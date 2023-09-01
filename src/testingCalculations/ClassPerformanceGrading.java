/*
 * A Java program to receive student's score, verify and display the grade level for the student.
 * Written by 
 * @ VICTOR EBONG
 */


package testingCalculations;

import java.util.Scanner;

public class ClassPerformanceGrading {
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter the value of your score");
		Scanner scan = new Scanner(System.in);
		double score = scan.nextDouble() ; 
		scan.close();
		if(score >= 101 ) {
			System.out.println("This value of: " + score + " is a wrong value and  \n" + score + " is greater than 100");
		}
		
		else if(score >= 70 && score <= 100) {
			System.out.println("Your grade is A" + ": Your Score of: " + score + " is ranked: \n " + "\b EXCELLENT.");
		}
		else if(score >= 60) {
			System.out.println("Your grade is B" + ": Your Score of: " + score + " is ranked: \n " + "\b VERY GOOD.");
		}
		else if(score >= 50) {
			System.out.println("Your grade is C"+ ": Your Score of: " + score + " is ranked: \n " + "\b GOOD.");
		}
		else if(score >= 45) {
			System.out.println("Your grade is D" + ": Your Score of: " + score + " is ranked: \n " + "\b FAIR.");
		}
		else if(score >= 40) {
			System.out.println("Your grade is E" + ": Your Score of: " + score + " is ranked: \n " + "\b POOR.");
		}
		else if(score >= 1) {
			System.out.println("Your grade for the score of " + score + " is: " + "F" + ":\n  AND \n Your Score of: " + score + " is ranked: \n " + "\b FAIL.");
		}
		else
		{
			System.out.println("This value of: " + score + " is a wrong value and  \n" + score + " is less than or equal to 0");
		}
	}

}
