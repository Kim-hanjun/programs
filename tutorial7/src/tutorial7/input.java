package tutorial7;

import java.util.Scanner;

public class input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int i = sc.nextInt(); // 받은 정수를 i 에 입력하겠다. nextint는 정수를 받아들인단 뜻. 문자면 int 생략한다
		System.out.print("입력된 정수는"+ i + "입니다");
		sc.close(); //안정적으로 종료될수 있도록
	}

}
