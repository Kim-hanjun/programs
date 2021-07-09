package tutorial13;

import java.util.Scanner;

public class array {
	public static int max(int a, int b) {
		return(a>b)?a:b;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("생성할 배열의 크기를 입력하세요: ");
		int number = scanner.nextInt();
		int[]array=new int[number];
		int i;
		for(i=0;i<number;i++)
		{
			System.out.print("배열에 입력할 정수를 입력하세요: ");
			array[i]=scanner.nextInt();
		}
		int result = -1;
		for(i =0; i<number;i++)
		{
			result=max(result,array[i]);
		}
		System.out.print("입력한 수중 가장 큰 값은" + result + "입니다");

	}

}
