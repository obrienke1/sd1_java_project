import java.util.Scanner;

public class Break_Ex2{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
	int counter = 0;

	System.out.println("Guess the correct number");
	System.out.println("Guess a number from 1 to 10");
	System.out.println("You have 10 attempts: ");

	while(input.hasNext()){
	  if(input.nextInt() == 8){
	    System.out.println("Match found, it is 8");
		break;
	  }

	  counter++;
	  if(counter == 10){
	    System.out.println("No Match found");
		break;
	  }
	}
    Index.main(null);
  }
}