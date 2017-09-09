import java.util.Scanner;

public class WeaselOrNot {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String word;
    boolean yep, nope;

    System.out.print("Type the word \"weasel\", please.  ");
    word = keyboard.next();

    //the following two statements work the same
    yep = "weasel".equals(word);
    //yep = word.equals("weasel");
    nope = ! word.equals("weasel");

    System.out.println();
    System.out.println("You typed what was requested: " + yep);
    System.out.println("You ignored polite instructions: " + nope + "\n");

  }
}
