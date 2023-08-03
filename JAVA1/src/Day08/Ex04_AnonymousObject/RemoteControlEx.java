package Day08.Ex04_AnonymousObject;

public class RemoteControlEx {
	
	public static void main(String[] args) {
		//익명 구현 객체
		// : 클래스를 정의하지 않고도 이름없이 구현한 객체
		//인터페이스 객체명 = new 인터페이스(인자1, ...) { 객체정의}
		RemoteControl rc = new RemoteControl() {
			int volume;
			int channel;
			@Override
			public void turnOn() {
				System.out.println("on");
			}
			
			@Override
			public void turnOff() {
				System.out.println("off");
				
			}
			
			@Override
			public void setVolume(int volume) {
				this.volume = volume;
				System.out.println("volume : " + this.volume);
			}

			@Override
			public void setChannel(int channel) {
				this.channel = channel;
				System.out.println("channel : " + this.channel);
			}
		};
		
		rc.turnOn();
		rc.setVolume(50);
		rc.turnOff();
		
		
		
	}
	
}
