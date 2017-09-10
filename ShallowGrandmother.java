import java.util.Scanner;

public class ShallowGrandmother {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int age, GDage = 30, happy;
    double income, cute;
    boolean allowed, allowed2;

    System.out.print("Enter your age: ");
    age = keyboard.nextInt();

    System.out.print("Enter your yearly income: ");
    income = keyboard.nextDouble();

    System.out.print("How cute are you, on a scale from 0.0 to 10.0? ");
    cute = keyboard.nextDouble();

    System.out.print("How happy do you make them? ");
    happy = keyboard.nextInt();

    allowed = (age > 25 && age < 40 && (income > 50000 || cute >= 8.5));
    System.out.println("Gram 1: Allowed to date my grandchild? " + allowed);

    allowed2 = (age >= (GDage - 5) && age <= (GDage + 5) && (happy > 7));
    System.out.println("Gram 2: Allowed to date my grandchild? " + allowed2);

  }
}
