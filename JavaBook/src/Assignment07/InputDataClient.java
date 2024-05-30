package Assignment07;

public class InputDataClient {

	public static void main(String[] args) {

		int person =10;
				
		InputData inData = new InputData(person);

		for (int i = 0; i < person; i++) {
			String name = "홍길" + i;
			int kor = (int) (Math.random() * 100);
			int eng = (int) (Math.random() * 100);
			int mat = (int) (Math.random() * 100);
			inData.setData(i, name, kor, eng, mat);
		}
		
		for(int i =0; i<person; i++) {
			System.out.println("번호: "+ (i+1) +" 이름: "+ inData.name[i]+" 국어: "+ inData.kor[i]+" 영어: "+ inData.eng[i]+
					" 수학: "+ inData.mat[i]+" 총점: "+inData.sum[i]+" 평균: "+ inData.avg[i]);
		}

	}

}
