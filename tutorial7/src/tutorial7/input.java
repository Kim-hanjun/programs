package tutorial7;

import java.util.Scanner;

public class input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		int i = sc.nextInt(); // ���� ������ i �� �Է��ϰڴ�. nextint�� ������ �޾Ƶ��δ� ��. ���ڸ� int �����Ѵ�
		System.out.print("�Էµ� ������"+ i + "�Դϴ�");
		sc.close(); //���������� ����ɼ� �ֵ���
	}

}
