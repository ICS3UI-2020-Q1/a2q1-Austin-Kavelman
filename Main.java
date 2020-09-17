import java.util.Scanner;

/**
 * THis program determines if the number is true or false
 * @author Austin Kavelman
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a scanner for user input
    Scanner input = new Scanner(System.in);

    //Gets the users number and prints it on the screen
    System.out.println("Please enter an interger:");
    int number = input.nextInt();

    //Checks to see if number is odd/even
    if ( number % 2 == 0 )
        System.out.println("Entered number is even");
     else
        System.out.println("Entered number is odd");
  }
}
