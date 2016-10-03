package com.schoolofnet;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class HelloWorld {
	
	public static void main(String[] args) {
		
		String age = "";
		age = JOptionPane.showInputDialog("What is your age ? ");
		
		Integer ageInt = Integer.parseInt(age);
		
		JOptionPane.showConfirmDialog(null, "Your age is " + ageInt);
		
		
//		int[] ages = new int[10000];
//		
//		ages[0] = 10;
//		ages[1] = 30;
//		ages[1] = 0;
//
//		List<Integer> list = new ArrayList<Integer>();
//		
//		list.add(1);
//		list.add(30);
		
//		for (int i = 0; i < list.size(); i++) {
//			Integer number = list.get(i);
//			
//			if (number > 1) {
//				System.out.println("Is greater then one");
//			}
//			
//			System.out.println(number);
//		}
		
//		int index = 0;
//		do {
//			Integer number = list.get(index);
//			
//			System.out.println(number);
//			
//			index++;			
//		} while(index < list.size());
//		
//		while(index < list.size()) {
//			Integer number = list.get(index);
//			
//			System.out.println(number);
//			
//			index++;
//		}
		
//		Scanner reader = new Scanner(System.in);
//		
//		System.out.println("Write a number 1: ");
//		Double num1 = reader.nextDouble();
//		System.out.println("Select a operation: 1) +, 2) -, 3) *, 4) /");
//		String operation = reader.next();
//		System.out.println("Write a number 2: ");		
//		Double num2 = reader.nextDouble();
//		
//		Double result = 0.0;
//		
//		if (operation.equals("1")) {
//			result = sum(num1, num2);
//		}
//		
//		if (operation.equals("2")) {
//			result = sub(num1, num2);
//		}
//		
//		if (operation.equals("3")) {
//			result = mult(num1, num2);
//		}
//		
//		if (operation.equals("4")) {
//			result = div(num1, num2);
//		}
//		
//		System.out.println(result);
//		
//		int a = 11;
//		
//		if (a > 10) {
//			System.out.println("Is greater than 10");
//		} else {
//			System.out.println("Is not greater than 10");
//		}
//		
//		int weekDay = 10;
//		
//		switch(weekDay) {
//			case 1:
//				System.out.print("Sunday");
//				break;
//			case 2:
//				System.out.print("Monday");
//				break;
//			case 3:
//				System.out.print("Tuesday");
//				break;
//			case 4:
//				System.out.print("Wednesday");
//				break;
//			case 5:
//				System.out.print("Thurday");
//				break;
//			case 6:
//				System.out.print("Friday");
//				break;
//			case 7:
//				System.out.print("Saturday");
//				break;
//			default: 
//				System.out.print("This option does not exists");
//				
//		}
		
//		int b = 10;
//		
//		a++;
//		b--;
//		
//		System.out.println(a);
//		System.out.println(b);
//		
//		
//		int c = 1;
//		int d = 2;
//		
//		boolean e = false;
//		
//		e = !(c < d);
//		
//		System.out.println(e);
//		if (!c) {
//			System.out.println("equals");
//		}
	}
	
//	public static Double sum(Double num1, Double num2) {
//		return num1 + num2;
//	}
//	
//	public static Double sub(Double num1, Double num2) {
//		return num1 - num2;
//	}
//	
//	public static Double mult(Double num1, Double num2) {
//		return num1 * num2;
//	}
//	
//	public static Double div(Double num1, Double num2) {
//		return num1 / num2;
//	}
}
