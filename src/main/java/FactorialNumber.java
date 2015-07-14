import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;


/**
 * Created by kanke on 14/07/2015.
 */
public class FactorialNumber {

    private static Logger LOGGER = LoggerFactory.getLogger(FactorialNumber.class);

    public static String printFactorialNumber(int number) {

        StringBuilder sb = new StringBuilder();
        BigInteger factorial = BigInteger.ONE;

        try {
            for (int i = 1; i <= number; i++) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("Exception", e);
        }
        sb.append("\nFactorial:" + factorial);
        return sb.toString();

    }
}
