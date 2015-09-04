package input.controller;

import java.util.Scanner;

public class InputController
{
	//Declaration section for instance variables.
	//Data members are always private.
	private Scanner inputScanner;
	
	public InputController()
	{
		inputScanner = new Scanner(System.in);
	}
	
	public void start()
	{
		System.out.println("Please type in your name.");
		String myInput;
		myInput = inputScanner.next();
		inputScanner.nextLine();
		System.out.println("Hello there " + myInput + ", do you like plums?");
		System.out.println("Did you type more than one?  I am sorry, please type your full name.");
		String fullName = inputScanner.nextLine();
		System.out.println("Your full name is " + fullName);
		System.out.println("How old are you?");
		int age = inputScanner.nextInt();
		System.out.println("Cool, you're " + age);
		//When the Scanner looks for an integer and you give it anything else, it will spit out a huge error.
		//Today we made program that was started from InputRunner and ran in InputController.
		//It asked you your name and age, and responded to each.
	}
}
