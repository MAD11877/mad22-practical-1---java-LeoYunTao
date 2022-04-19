import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    double height = in.nextDouble();

    Scanner in2 = new Scanner(System.in);
    double weight = in2.nextDouble();

    double bmi = weight / (height * height);
    
    System.out.println(bmi);
  }
}
