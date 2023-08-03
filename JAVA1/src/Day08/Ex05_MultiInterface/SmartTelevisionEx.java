package Day08.Ex05_MultiInterface;

public class SmartTelevisionEx {
	
	public static void main(String[] args) {
		
		SmartTelevision tv = new SmartTelevision();
		
		tv.turnOn();
		tv.setVolume(20);
		int channel = tv.channelSearch("MBC");
		tv.setChannel(channel);
		
		String[] idolContent = tv.contentSearch("아이돌"); 
		System.out.println("============= 검색된 컨텐츠 =============");
		
		for (int i = 0; i < idolContent.length; i++) {
			System.out.print( idolContent[i] );
			if( i < idolContent.length-1 )
				System.out.print(", ");
		}
		System.out.println();
		tv.receiveVoice("오늘 날씨 어때?");
		
		tv.turnOff();
	}

}
