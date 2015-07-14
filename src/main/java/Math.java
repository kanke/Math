import java.io.IOException;
import java.util.Scanner;


/**
 * Created by kanke on 08/07/2015.
 */
public class Math {


    public static void main(String[] args) throws IOException {
        PrimeNumber primeNumber = new PrimeNumber();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Print Enter a number:");

        try {
            int number = scanner.nextInt();
            System.out.print(primeNumber.isPrimeNumber(number));
            System.out.print(ArmstrongNumber.isArmstrongNumber(number));
            // isArmstrongNumber(number);
            //  System.out.print(ArmstrongNumber.isArmstrongNumber(number));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.print("\n Program ends here");
    }




}



