package Chap07;

public class Encapsulation {
	 private String name;  //name에 아무것도 안들어감

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name; //this.name 은 자신을 가르킴
	}
}
