package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PersonDAO { //DB연결, 추가(create), 읽기(조회)read, 수정update, 삭제delete
	private String driverClass = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String username = "system";
	private String password = "dodo0220";
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	//DB 연결
	public void connDB() {
		try {
			Class.forName(driverClass);
			conn = DriverManager.getConnection(url, username, password);
			System.out.println(conn + "DB연결 성공!!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
	}
		
		
} 
	//연결 종료
	
	
	//DB 종료
	public void disconnect() {
		if(rs!= null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}//종료
	
	//전체 목록 조회
	public ArrayList<Person> getListAll() {
		ArrayList<Person> list = new ArrayList<>();
		connDB();
		String sql = "SELECT * FROM person";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String id = rs.getString("userId");
				String pw = rs.getString("userPw"); //열 이름을 다시 변수로 담음
				String name = rs.getString("name");
				int age = rs.getInt("age");
				
				Person person = new Person();
				person.setUserId(id);
				person.setUserPw(pw);
				person.setName(name);
				person.setAge(age);
				
				list.add(person);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}//getListAll() 닫기
	
	//사람 추가
	public void create(Person person) {
		String userId = person.getUserId();
		String userPw = person.getUserPw();
		String name = person.getName();
		int age = person.getAge();
		
		connDB();
		String sql = "INSERT INTO person VALUES (?, ?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			pstmt.setString(2, userPw);
			pstmt.setString(3, name);
			pstmt.setInt(4, age);
			pstmt.executeUpdate(); //주위! 실행
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			disconnect();
		}
		
	}//create 닫기
	
	public boolean delete(String userId) {
		connDB();
		String sql = "DELETE FROM person WHERE userid = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
		
	}
	
	
	
	
}//class 닫기









