import java.util.HashMap;
import java.util.Iterator;

public class Example06 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> cats = new HashMap<Integer, String>();
		
		cats.put(1, "페르시안"); //앞은 key값 뒤는 value값을 put으로 넣어줌 
		cats.put(2, "샴");
		System.out.println(cats);
		cats.put(3, "러시안블루");
		System.out.println(cats);
		
		cats.put(3, "래그돌"); //원하는 값을 지정해주면 덮어쓰기가 됨
		System.out.println(cats);
		
		cats.remove(1);
		System.out.println(cats);
		System.out.println(cats.size());
		System.out.println(cats.get(2)); //두번째 값을 가져옴
		System.out.print("(Key,Value) = ");

		Iterator<Integer> keys = cats.keySet().iterator(); //반복문을 사용할 때 사용함, while문 안에 hasNext를 사용하여 사용해줌
		
		while (keys.hasNext()) { //다음 값이 있으면 가져오기, 값이 없으면 빠져나오기
			int key = keys.next();
			System.out.print("(" + key + "," + cats.get(key) + ")");
		}

	}

}
