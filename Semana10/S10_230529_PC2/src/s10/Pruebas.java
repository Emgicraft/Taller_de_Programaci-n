package s10;

import java.util.Random;

/**
 *
 * @author Moisés
 */
public class Pruebas {
    public static void main(String[] args) {
        // create random object
        Random ran = new Random();
  
        // Print next int value
        // Returns number between 0-9
        //int nxt = ran.nextInt(10);
        int nxt=0;
  
        for (int i = 1; i <= 100000; i++) {
            // Printing the random number 
            // between 0 and 9
            nxt = ran.nextInt(10);
            if (nxt==10) {
                System.out.println("Random number between 0 and 10 is : " + nxt);
            }
            else if (i % 1000 == 0) {
                System.out.println("1000 ");
            }
        }
    }
}
