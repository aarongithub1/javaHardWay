import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) throws Exception {
        Scanner kb = new Scanner(System.in);
        String plaintext, cipher = "", file1 = "message.txt", file2 = "cipher.txt";
        int shift;

        File f1 = new File(file1);
        if (f1.exists() && f1.length() > 0) {
            Scanner input = new Scanner(f1);
                plaintext = input.next();
                shift = input.nextInt();
            input.close();
        }
        else {
            shift = 4;
            plaintext = "Hello";
        }

        File f2 = new File(file2);
        if (f2.exists() && f2.length() > 0) {
            //Save this name and high score to th file.
            PrintWriter out = new PrintWriter(f2);
                out.println(cipher);
            out.close();
        }

        for (int i = 0; i < plaintext.length(); i++) {
            cipher += shiftLetter(plaintext.charAt(i), shift);
        }
        System.out.println("The original word was: "+plaintext+"\nYour cipher word is: "+cipher+"\nshift was: "+shift);
    }

    /**
     * Returns the character shifted by the given number of letters.
     */
    public static char shiftLetter(char c, int n) {
        int u = c;

        if (! Character.isLetter(c))
            return c;

        u = u + n;
        if (Character.isUpperCase(c) && u > 'Z'
         || Character.isLowerCase(c) && u > 'z') {
             u -= 26;
         }
        if (Character.isUpperCase(c) && u < 'A'
         || Character.isLowerCase(c) && u < 'a') {
             u += 26;
         }

         return (char)u;
    }

}
