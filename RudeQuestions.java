import java.util.Scanner;

public class RudeQuestions {
  public static void main(String[] args) {
    String name;
    int age, laps;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Hello. What is your name? ");
    name = keyboard.next();

    System.out.print("Hi, " + name + "! How old are you? ");
    age = keyboard.nextInt();
    System.out.println("So you're " + age + ", eh? That's not very old.");

    System.out.print("How much do you weigh, " + name + "? ");
    weight = keyboard.nextDouble();
    System.out.println(weight + "! Better keep that quiet!!");

    System.out.print(name + ". How many laps can you swim in a pool? ");
    laps = keyboard.nextInt();
    System.out.println(laps + " laps?? You may need to put in extra work, " + name);

    System.out.print("Finally, what's your income, " + name + "? ");
    income = keyboard.nextDouble();

    System.out.print("Hopefully that is " + income + " per hour");
    System.out.println(" and not per year!");
    System.out.print("Well, thanks for answering my rude questions, ");
    System.out.println(name + ".");

    //Double will accept whole numbers and fractional numbers, a double will accept an integer
    //Double goes out 308, -324 places so it should cover all Integers
    //Question 1 "Name" is a string, and will accept anything entered
    //Question 2 "age" is an int, blows up on fractional values and strings
    //Question 3 "weight" is a Double, blows up on a string but will accept whole and fractional values
    //Question 4 "income" is a Double, "..."


  }
}
