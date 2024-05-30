package Assignment06;

public class StringAdd {

	public static void main(String[] args) {
		String str = "Ko2re4a0Po4ly4te2chn9ic3";
		StringBuilder result = new StringBuilder(); 

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) { 
				result.append(ch);
			}
		}

		System.out.println("result: " + result.toString());
	}
}
