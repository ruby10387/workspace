package edu.fju.exam;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		int money;
		int total=0;
		
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		money = Integer.parseInt(line);
		switch(money){
		case 1:
			total = total+money;
			System.out.print(total);
			break;
		case 5:
			total = total+money;
			System.out.print(total);
			break;
		case 10:
			total = total+money;
			System.out.print(total);
			break;
		}
	}

}
