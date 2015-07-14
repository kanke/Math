import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by kanke on 12/07/2015.
 */
public class ArmstrongNumber {

    private static Logger LOGGER = LoggerFactory.getLogger(ArmstrongNumber.class);
    private static StringBuilder sb = new StringBuilder();

    public static String isArmstrongNumber(int number) {
        int original_number = number;
        int sum = 0;
        try {
            String no = String.valueOf(original_number);

            for (int i = 0; i < no.length(); i++) {
                char c = no.charAt(i);
                int  c_number = Character.getNumericValue(c);
                int  cube_number = cube(c_number);
                sum = sum + cube_number;

            }

        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            LOGGER.error("Exception", e);
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("Exception", e);
        }

        if (sum == original_number) {
            sb.append("\nArmstrong no" + sum);
            return sb.toString();
        } else {
            sb.append("\nNot Armstrong no" + sum);
            return sb.toString();

        }

    }


    private static int cube(int number) {
        return number * number * number;

    }


}
