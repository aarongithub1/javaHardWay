public class ClubBouncer {
  public static void main(String[] args){
    int age = 22;
    boolean onGuestList = false;
    double allure = 7.5;
    String gender = "F";

    if (onGuestList || age >= 21 || (gender.equals("F") && allure >= 8)) {
      System.out.println("You are allowed to enter the club.");
    }
    //System.out.println("Break!");
    else {
      System.out.println("You are not allowed to enter the club.");
    }

    //Program does not run when the else statement isn't immediately after the 'if' statement.
    //after the closing } of the body of code in the if statement

  }
}
