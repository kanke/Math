import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * Created by kanke on 08/07/2015.
 */
public class Math {

    private static Logger LOGGER = LoggerFactory.getLogger(Math.class);

    public static void main(String[] args) throws IOException {
        PrimeNumber primeNumber = new PrimeNumber();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Print Enter a number:");

        try {
            int number = scanner.nextInt();
            if (number < 0)
                throw new IllegalArgumentException("\n" + number + " is less than zero : Enter a number >0 to compute");
            System.out.print(primeNumber.isPrimeNumber(number));
            System.out.print(ArmstrongNumber.isArmstrongNumber(number));
            System.out.print(FactorialNumber.printFactorialNumber(number));
            System.out.print(PalindromeNumber.isPalindromeNumber1(number));
            System.out.print(PalindromeNumber.isPalindromeNumber2(number));
        } catch (InputMismatchException e) {
            e.printStackTrace();
            LOGGER.error("Exception", e);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            LOGGER.error("Exception", e);
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("Exception", e);
        }
        System.out.print("\n Program ends here");
    }


}



