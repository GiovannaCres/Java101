/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.swing.JOptionPane;

/**
 *
 * @author renat
 */
public class Applicattion1
{

	public static void main(String[] args)
	{
		areYouOlderThan18();
		//GreaterThanExample();
		//	mathguessexample(args);
	}

	/**
	 * @param args the command line arguments
	 */
	// TODO code application logic here
	public static void areYouOlderThan18()
	{
		String ageInput = JOptionPane.showInputDialog("what age are you");
		int age = Integer.parseInt(ageInput);
		if (age > 18)
		{
			System.out.println("you can vote ");
		} else if (age == 18)
		{
			System.out.println("get a job");
		} else
		{
			System.out.println("go back to coder dojo ");
		}

	}

	public static void GreaterThanExample()
	{
	}

	public static void mathguessexample(String[] args)
	{
		String input = JOptionPane.showInputDialog("enter your name");
		System.out.println(input);
		int number1 = 184;
		int number2 = 24;
		int answer01 = number1 * number2;
		System.out.println(answer01);
		int number3 = 45;
		int number4 = 100;
		int answer02 = number4 - number3;
		System.out.println(answer02);
		int number5 = 478;
		int number6 = 4576;
		int answer03 = number5 + number6;
		System.out.println(answer03);
		int number7 = 13;
		int number8 = 89;
		int answer04 = number7 + number8;
		System.out.println(answer04);
		int number9 = 73;
		int number10 = 34;
		int answer05 = number9 + number10;
		System.out.println(answer05);
		int number11 = 21;
		int number12 = 98;
		int answer06 = number11 + number12;
		System.out.println(answer06);
		int number13 = 8758;
		int number14 = 647;
		int answer07 = number13 * number14;
		System.out.println(answer07);
		int number15 = 3;
		int answer08 = number15 / number15;
		System.out.println(answer08);
		int number16 = 123456789;
		int number17 = 987654321;
		int answer09 = number16 * number17;
		System.out.println(answer09);

		String number1Input = JOptionPane.showInputDialog("enter a number");
		String number2Input = JOptionPane.showInputDialog("enter a number");
		//String answerInput = J
	}

}
