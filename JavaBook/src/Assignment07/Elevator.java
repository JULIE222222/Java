package Assignment07;

public class Elevator {
	int limit_up_floor = 10;
	int limit_down_floor = 0;
	int floor = 1;
	String help;

	void up() {
		if (floor == limit_up_floor) {
			help = "마지막층입니다.";
		} else {
			floor++;
			help = floor + "층입니다.";
		}
	}

	void down() {
		if (floor == limit_down_floor) {
			help = "처음층입니다.";
		} else {
			floor--;
			help = floor + "층입니다.";
		}
	}

}
