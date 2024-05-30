package Assignment07;

public class TVRemoteController {

	public static void main(String[] args) {

		Channel chan = new Channel();

		for (int i = 1; i < 10; i++) {
			System.out.println("MSG: " + "현재 채널: " + chan.channel);
			chan.channelUp();
			
		}
		for (int i = 0; i <= 10; i++) {
			System.out.println("MSG: " + "현재 채널: " + chan.channel);
			chan.channelDn();
		}

		System.out.println();

		Volume vol = new Volume();

		for (int i = 1; i < 5; i++) {
			System.out.println("MSG: " + "현재 음량: " + vol.volume);
			vol.volUp();
		}
		for (int i = 0; i <= 5; i++) {
			System.out.println("MSG: " + "현재 음량: " + vol.volume);
			vol.volDn();
		}
	}
}
