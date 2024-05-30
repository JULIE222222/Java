package Assignment07;

public class InputData {
	int[] kor; // 각 학생의 국어 점수를 저장하는 배열
    int[] eng;       // 각 학생의 영어 점수를 저장하는 배열
    int[] mat;       // 각 학생의 수학 점수를 저장하는 배열
    int[] sum;       // 각 학생의 총점을 저장하는 배열
    int[] avg;    // 각 학생의 평균을 저장하는 배열
    String[] name;   // 각 학생의 이름을 저장하는 배열

    // 생성자: 입력된 학생 수에 맞게 배열을 초기화합니다.
    public InputData(int personCount) {
        kor = new int[personCount];
        eng = new int[personCount];
        mat = new int[personCount];
        sum = new int[personCount];
        avg = new int[personCount];
        name = new String[personCount];
    }

    // setData 메서드: 주어진 인덱스에 학생의 정보를 설정합니다.
    public void setData(int index, String name, int kor, int eng, int mat) {
        this.name[index] = name;                   // 해당 인덱스의 학생 이름 설정
        this.kor[index] = kor;                     // 해당 인덱스의 학생 국어 점수 설정
        this.eng[index] = eng;                     // 해당 인덱스의 학생 영어 점수 설정
        this.mat[index] = mat;                     // 해당 인덱스의 학생 수학 점수 설정
        this.sum[index] = kor + eng + mat;         // 해당 인덱스의 학생 총점 설정 (국어, 영어, 수학 점수 합산)
        this.avg[index] = (int) sum[index] / 3; // 해당 인덱스의 학생 평균 설정 (국어, 영어, 수학 평균)
    }
}
