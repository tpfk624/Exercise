//1018 : [����-�����] �ð� �Է¹޾� �״�� ����ϱ�(����) 
package codeup;

import java.util.Scanner;

public class _1018{

	public static void main(String[] args){
		
		String a;
		Scanner sc = new Scanner(System.in);

		a = sc.nextLine();

		String[] time = a.split(":");

		System.out.format("%d:%d", Integer.parseInt(time[0]), Integer.parseInt(time[1]));

	}
}

