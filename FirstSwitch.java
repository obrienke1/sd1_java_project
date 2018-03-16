import java.util.Scanner;

public class FirstSwitch{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int theNumber = 0;

    System.out.print("Enter number 1, 2 or 3: ");
    theNumber = input.nextInt();

    switch(theNumber) {
     case 1: {
       System.out.println("The number is 1.");
       break; //exits switch
     }
     case 2: {
       System.out.println("The number is 2.");
       break; //exits switch
     }
     case 3: {
       System.out.println("The number is 3.");
       break; //exits switch
     }
     default: {
       System.out.println("Invalid number. It must be 1, 2, or 3.");
       break; //optional; exits switch anyway
     }
   }//end switch
   System.out.println();
   Index.main(null); // go back to main menu
  }//end main
}//end class
