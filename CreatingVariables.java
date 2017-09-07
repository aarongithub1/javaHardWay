public class CreatingVariables {
  public static void main(String[] args) {
    int x, y, age, reps;
    double seconds, e, checking, weight;
    String firstName, lastName, title, middleName;

    x = 10;
    y = 400;
    age = 39;
    reps = 42;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    weight = 195.50;

    firstName = "Aaron";
    lastName = "Ipp";
    title = "Mr.";
    middleName = "Fullmoon";

    System.out.println("The variable x contains " + x);
    System.out.println("The value " + y + " is stored in the variable y.");
    System.out.println("Jay did: " + reps + " push-ups.");
    System.out.println("Jay weighs: " + weight + " lbs.");
    System.out.println("The experiment took " + seconds + " seconds.");
    System.out.println("A favorite irrational # is Euler's number: " + e);
    System.out.println("Hopefully you have more than $" + checking + "!");
    System.out.println("My name is: " + title + " " + firstName + " " + middleName + " " + lastName);
    //System.out.println("test auto pairing brackets, removed from packages");

  }
}
