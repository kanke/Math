import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by kanke on 14/07/2015.
 */
public class FactorialNumber {

    private static Logger LOGGER = LoggerFactory.getLogger(FactorialNumber.class);

    public static String printFactorialNumber(int number) {

        StringBuilder sb = new StringBuilder();
        int factorial = 1;
        try {
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("Exception", e);
        }
        sb.append("\nFactorial:" + factorial);
        return sb.toString();

    }
}
