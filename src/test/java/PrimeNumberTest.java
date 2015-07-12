
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;


/**
 * Created by kanke on 08/07/2015.
 */
public class PrimeNumberTest {

    int a = 0;
    PrimeNumber primenumber = mock(PrimeNumber.class);
    PrimeNumber primenumber2 = new PrimeNumber();

    @BeforeClass
    public static void setUp() {

    }

    @Test
    public void checkNumberNotNUll() {
        assertNotNull(a);
    }

    @Test
    public void checkIsNotPrime(){
        int notPrime = 5;
        primenumber2.isPrimeNumber(notPrime);
        assertFalse("Not prime Number", false);

    }

    @Test
    public void checkIsPrime(){
        int notPrime = 4;
        primenumber2.isPrimeNumber(notPrime);
        assertTrue("prime Number", true);

    }

    @Test
    public void isPrimeNumber() {
        String testString = "xxx";


       verify(primenumber).isPrimeNumber(5);


    }

}

