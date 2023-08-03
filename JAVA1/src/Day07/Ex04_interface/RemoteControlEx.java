package Day07.Ex04_interface;

public class RemoteControlEx {
	
	public static void main(String[] args) {
		// 인터페이스 타입 객체명 = new 구현클래스();
		RemoteControl tvRc = new Television();
		tvRc.turnOn();
		tvRc.setVolume(5);
		tvRc.setVolume(100);
		tvRc.setMute(true);
		tvRc.turnOff();
		System.out.println();
		
		
		RemoteControl spRc = new Speaker();
		spRc.turnOn();
		spRc.setVolume(5);
		spRc.setVolume(100);
		spRc.setMute(false);
		spRc.turnOff();
		System.out.println();
		
		RemoteControl.changeBattery();
		
		
		
	}
}
