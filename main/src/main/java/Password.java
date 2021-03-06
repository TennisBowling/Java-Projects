package main.src.main.java;

import java.nio.charset.StandardCharsets;
	import java.util.*;
	import java.util.concurrent.TimeUnit;


public class Password {
	
			public static void main(String[] args) throws InterruptedException {
				
				int tries=0;
				Base64.Encoder encoder = Base64.getEncoder();
				Scanner sc = new Scanner(System.in); //summon scanner
				
				System.out.println("set password");
				
				String normalString = sc.nextLine();
				
				
				String encodedString = encoder.encodeToString( 
				        normalString.getBytes(StandardCharsets.UTF_8) );
				
							
				while(tries<5) {

				System.out.println("enter password");
				String userInput = sc.nextLine();	
				
					String userEncoded = encoder.encodeToString( 
				        userInput.getBytes(StandardCharsets.UTF_8) );
				 
				if(!userEncoded.equals(encodedString)) tries++;
				
				if(userEncoded.equals(encodedString)) {
					System.out.println("correct password");
					System.exit(0);
				}
					else if(tries<5) System.out.println("Incorrect, try again. You have "+(0 + tries) +" failed attempts. Once it gets to five, you will have to wait.");
			
					  
				
				else {
					System.out.println("you had 5 failed attempts. you must wait 5 seconds in order to try again");
					tries=0;
					TimeUnit.SECONDS.sleep(5);
					
				}
				}
				sc.close();
			
	}

}
