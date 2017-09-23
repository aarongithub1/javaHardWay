import java.util.Scanner;
import java.io.PrintWriter;

public class ReceiptRevisited {
    public static void main(String[] args) throws Exception {
        PrintWriter fileout = new PrintWriter("receipt.txt");
        Scanner kb = new Scanner(System.in);
        double ppg = 2.50, gal;

        System.out.print("How many gallons of fuel: ");
        gal = kb.nextDouble();


        fileout.println("+------------------------+");
        fileout.println("|                        ");
        fileout.println("|      CORNER STORE      ");
        fileout.println("|                        ");
        fileout.println("|  2017-09-22   06:00PM  ");
        fileout.println("|                        ");
        fileout.println("|  Gallons: "+gal);
        fileout.println("|  Prince/gallon: "+ppg);
        fileout.println("|                        ");
        fileout.println("|   Fuel total: $"+(ppg*gal));
        fileout.println("|                        ");
        fileout.println("+-----------------------+");
        fileout.close();

    }
}
