import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberUtilTest {


    @Test
    public void addTest(){


        int sum = NumberUtil.add(1,1);
        assertEquals(2,sum);

    }

    @Test
    public void subtractTest(){


        int sum = NumberUtil.subtract(5,3);
        assertEquals(2,sum);

    }

    @Test
    public void divideTest(){


        int sum = NumberUtil.divide(8,2);
        assertEquals(4,sum);

    }

    @Test
    public void multiplyTest(){


        int sum = NumberUtil.multiply(5,5);
        assertEquals(25,sum);

    }
}
