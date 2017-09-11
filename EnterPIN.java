import java.util.Scanner;

public class EnterPIN {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int pin = 12345;
    double bal = 425.17;
    String myPW = "Password";

    System.out.println("\nWELCOME TO THE BANK OF JAVA.");

    System.out.print("ENTER YOUR PASSWORD: ");
    String enterPW = keyboard.next();

    while (! enterPW.equals(myPW)) {
      System.out.println("\nINVORRECT PASSWORD. TRY AGAIN.");
      System.out.print("ENTER YOUR PASSWORD: ");
      enterPW = keyboard.next();
    }

    System.out.println("\nPASSWORD ACCEPTED.\n");


    System.out.print("ENTER YOUR PIN: ");
    int enterPIN = keyboard.nextInt();

    while (enterPIN != pin) {
      System.out.println("\nINVORRECT PIN. TRY AGAIN.");
      System.out.print("ENTER YOUR PIN: ");
      enterPIN = keyboard.nextInt();
    }

    System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $" + bal + "\n");
  }
}
