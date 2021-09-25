package interfaceex.remotecontrol;

public class SmartTVTest {

	public static void main(String[] args) {
		SmartTV smartTV = new SmartTV();
		smartTV.turnOn();
		smartTV.search("http://www.naver.com");
		smartTV.setVolume(12);
		
		smartTV.setMute(true);
		smartTV.turnOff();
		
		RemoteControl.changeBattery();
	}

}
