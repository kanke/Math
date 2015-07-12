import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by kanke on 08/07/2015.
 */

public class PrimeNumber {

    private static Logger LOGGER = LoggerFactory.getLogger(PrimeNumber.class);

    public static String isPrimeNumber(int a) {


        StringBuilder sb = new StringBuilder();
        if (a < 0) {
            System.out.print("Please enter a number greater that zero");
        }

        try {
            if (a % 2 == 0) {
                sb.append("prime number");
                return sb.toString();

            } else {
                sb.append("Not prime number");
                return sb.toString();
            }

        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("Exception ",e);
        }
       // sb.append("");
        return sb.toString();
    }
}
