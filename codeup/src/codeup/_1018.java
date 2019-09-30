//1018 : [기초-입출력] 시간 입력받아 그대로 출력하기(설명) 
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

