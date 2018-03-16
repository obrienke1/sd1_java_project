// Convert.java
// Program converts Fahrenheit to Celsius and vice versa.
import java.util.Scanner;

public class Convert{
   // convert temperatures
   public static void main(String args[]){
      Scanner input = new Scanner(System.in);

      int choice; // the user's choice in the menu

      do{
         // print the menu
         System.out.println("1. Fahrenheit to Celsius");
         System.out.println("2. Celsius to Fahrenheit");
         System.out.println("3. Exit");
         System.out.print("Choice: ");
         choice = input.nextInt();

         if (choice == 1 || choice == 2){
            System.out.print("Enter temperature: ");
            int oldTemperature = input.nextInt();

            // convert the temperature appropriately
            switch (choice){
               case 1:
                  System.out.println(oldTemperature+" Fahrenheit is "+celsius(oldTemperature)+ " Celsius\n");
                  break;
               case 2:
                  System.out.println(oldTemperature+" Celsius is "+fahrenheit(oldTemperature)+" Fahrenheit\n");
                  break;
            }
         }
      } while (choice != 3);
      Index.main(null);
   }

   // return Celsius equivalent of Fahrenheit temperature
   public static int celsius(int fahrenheitTemperature){
      return ((int) (5.0 / 9.0 * (fahrenheitTemperature - 32)));
   }

   // return Fahrenheit equivalent of Celsius temperature
   public static int fahrenheit(int celsiusTemperature){
      return ((int) (9.0 / 5.0 * celsiusTemperature + 32));
   }
} // end class Convert
