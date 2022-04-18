import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    System.out.println("Enter height (m): ");
    double height = new Scanner(System.in).nextDouble();

    System.out.println("Enter weight (kg): ");
    double weight = new Scanner(System.in).nextDouble();

    double bmi = weight / (height * height);
    
    System.out.println("Your bmi is: " + bmi);
  }
}
