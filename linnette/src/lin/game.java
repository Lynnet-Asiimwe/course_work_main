package lin;

import java.util.Scanner;
import java.util.Random;
public class game {

	public game() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int maxRange;

        //create objects
        Scanner SC = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("Please enter maximum range: ");
        maxRange=SC.nextInt();
        
        for(int loop=1; loop<=10; loop++)
        {
            System.out.println(rand.nextInt(maxRange));
        }
        for(int loop=1; loop<=10; loop++)
        {
            System.out.println(" \nNAME THE NUMBERS YOU HAVE SEEN \n");
        }
	}

}
