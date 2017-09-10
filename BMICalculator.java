import java.util.Scanner;

public class BMICalculator {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double m, kg, bmi;
    double inch, feet, lbs;

    System.out.print(" Enter your height in m: ");
    m = keyboard.nextDouble();

    System.out.print("Enter your weight in kg: ");
    kg = keyboard.nextDouble();

    bmi = kg/(m*m);

    System.out.println("Your BMI is: " + bmi);

    System.out.println("\n-----------------------------------\n");

    System.out.print("Enter your height in inches: ");
    inch = keyboard.nextDouble();

    System.out.print("Enter your weight in lbs: ");
    lbs = keyboard.nextDouble();

    m = inch * 0.0254;
    kg = lbs * 0.453592;

    bmi = kg/(m*m);

    System.out.println("Your BMI is: " + bmi);

    System.out.println("\n-----------------------------------\n");

    System.out.print("Enter your height (feet only): ");
    feet = keyboard.nextDouble();

    System.out.print("Enter your height (inches): ");
    inch = keyboard.nextDouble();

    System.out.print("Enter your weight in lbs: ");
    lbs = keyboard.nextDouble();

    feet *= 12;
    inch += feet;

    m = inch * 0.0254;
    kg = lbs * 0.453592;

    bmi = kg/(m*m);

    System.out.println("Your BMI is: " + bmi);

  }
}
