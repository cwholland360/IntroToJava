package com.charlesholland.handson1;

public class HandsOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isSunny = false;
		boolean atBeach = false;

		// if it's sunny
	    // print "Wear sunglasses!"
	    	// if at the beach
	        	// print "Wear sunblock!"
		if (isSunny) {
			System.out.println("Wear sunglasses!");
		
			if (atBeach) {
				System.out.println("& Wear sunblock.");
			}
			// else
			// print "Don't need sunblock."
			else {
				System.out.println("& Don't need sunblock.");
			} 
		}
		// else
	    // print "Don't wear sunglasses."
	    // if at the beach
	        // print "Come back tomorrow."
		else {
			System.out.println("Don't wear sunglasses.");
			
			if(atBeach) {
				System.out.println("& Come back tomorrow.");
			}
			 // else
	        // print "Don't go to the beach."
			
			else {
				System.out.println("& Don't go to the beach.");
			}
		}
		
	}
}
	
