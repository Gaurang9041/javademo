package pages;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		String lname;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("please enter your last name: ");
		lname=sc.next();
		
		if(lname.equals("patel")) {
			System.out.println("you are open category");
		}else if(lname.equals("shah")) {
				System.out.println("you ares OBC category");
			
		}else if(lname.equals("jadeja")) {
			System.out.println("you are SC category");
		}else {
			System.out.println("out of state");
		}

	}

}
