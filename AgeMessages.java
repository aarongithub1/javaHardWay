import java.util.Scanner;

public class AgeMessages {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int age;

    System.out.print("How old are you? ");
    age = kb.nextInt();

    System.out.println("You are: ");
    if (age < 13) {
      System.out.println("\ttoo young to creat a Facebook account");
    }
    if (age >= 13) {
      System.out.println("\told enough to creat a Facebook account");
    }
    if (age < 16) {
      System.out.println("\ttoo young to get a driver's license");
    }
    if (age >= 16) {
      System.out.println("\told enough to get a driver's license");
    }
    if (age < 18) {
      System.out.println("\ttoo young to get a tattoo");
    }
    if (age >= 18) {
      System.out.println("\told enough to get a tattoo");
    }
    if (age < 21) {
      System.out.println("\ttoo young to drink alcohol");
    }
    if (age >= 21) {
      System.out.println("\told enough to drink alcohol");
    }
    if (age < 35) {
      System.out.println("\ttoo young to run for President of the U.S.");
      System.out.println("\t\t(How sad!)");
    }
    if (age >= 35) {
      System.out.println("\told enough to run for President of the U.S.");
      System.out.println("\t\t(How great!)");
    }
    if (age < 65) {
      System.out.println("\talso, too young to retire.");
    }
    if (age >= 65) {
      System.out.println("\talso, you are old enough to retire!");
    }


    //prior to the study drill changes..
    //age > 35 would have printed only the initial println "You are: "
    //because all of the if statements would have evaluated to false

  }
}
