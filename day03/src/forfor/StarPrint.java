package forfor;

public class StarPrint {

	public static void main(String[] args) {
		// º° Âï±â
		/*for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("³ª");
			}
			System.out.println(); //ÁÙ¹Ù²Þ
		}*/
		
		//»ï°¢Çü ¸ð¾ç º° Âï±â
		/*
		 *               *****
		 **              ****
		 ***             ***
		 ****            **  
		 *****           *
		 */
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println(); //ÁÙ¹Ù²Þ
		}
		System.out.println();
		
		//¿ª Á÷°¢»ï°¢Çü
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=6-i; j++) {
				System.out.print("*");
			}
			System.out.println(); //ÁÙ¹Ù²Þ
		}
		
		
		
		
		
		
		
		
		
		
	}
}
