package tutorial13;

import java.util.Scanner;

public class array {
	public static int max(int a, int b) {
		return(a>b)?a:b;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �迭�� ũ�⸦ �Է��ϼ���: ");
		int number = scanner.nextInt();
		int[]array=new int[number];
		int i;
		for(i=0;i<number;i++)
		{
			System.out.print("�迭�� �Է��� ������ �Է��ϼ���: ");
			array[i]=scanner.nextInt();
		}
		int result = -1;
		for(i =0; i<number;i++)
		{
			result=max(result,array[i]);
		}
		System.out.print("�Է��� ���� ���� ū ����" + result + "�Դϴ�");

	}

}
