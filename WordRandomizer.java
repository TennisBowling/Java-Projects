package uuuu;
import java.util.Scanner;
public class WordRandomizer {

	public static void main(String[] args) {
		
		int d=31;
		while(d==31) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter words");
		String cards = sc.nextLine();
		
        cards = shuffle(cards);
        System.out.println("Shuffled  = " + cards);
		}
        
     }

    static String shuffle(String cards){
        if (cards.length()<=1)
            return cards;

        int split=cards.length()/2;

        String temp1=shuffle(cards.substring(0,split));
        String temp2=shuffle(cards.substring(split));

        if (Math.random() > 0.5) 
            return temp1 + temp2;
        else
            return temp2 + temp1;
	}
        
}
