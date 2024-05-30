package Assignment07;

public class ElevatorClient_main {

	public static void main(String[] args) {

		// inVal = 0;
		Elevator elev = new Elevator();

		elev.up();
		elev.down();

		for (int i = 0; i < 10; i++) {
			elev.up();
			System.out.println("MSG: " + elev.help);
		}
		for (int i = 1; i < 10; i++) {
			elev.down();
			System.out.println("MSG: " + elev.help);
		}
	}
}
