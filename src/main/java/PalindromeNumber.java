import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by kanke on 14/07/2015.
 */
public class PalindromeNumber {

    private static Logger LOGGER = LoggerFactory.getLogger(PalindromeNumber.class);
    private static StringBuilder sb = new StringBuilder();
    private static StringBuilder sb_no;

    public static String isPalindromeNumber1(int number) {
        //If first string equals reverse string then it is Palindrome Number
        sb.append("\nThis first solution converts integer to string and reverses it:isPalindromeNumber1");

        String no = String.valueOf(number);

        sb_no = new StringBuilder(no);

        String no_reverse = sb_no.reverse().toString();

        if (no.equals(no_reverse)) {
            sb.append("\nPalindrome number " + no_reverse);
            return sb.toString();
        } else {
            sb.append("\nNot palindrome number " + no_reverse);
            return sb.toString();
        }


    }

    public static String isPalindromeNumber2(int number) {

        sb.append("\nThis is the second solution reverses the Integer and compares:isPalindromeNumber2");
        int n = number;
        int reverse = 0;
        try {

            while (number > 0) {
                int digit = number % 10;
                reverse = reverse * 10 + digit;
                number = number / 10;
            }

        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("Exception", e);

        }
        if (n == reverse) {
            sb.append("\nPalindrome number " + reverse);
            return sb.toString();
        } else {
            sb.append("\nNot palindrome number " + reverse);
            return sb.toString();
        }


    }
}