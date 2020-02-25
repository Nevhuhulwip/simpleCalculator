import org.graalvm.compiler.debug.CSVUtil;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void add() {
        Assert.assertEquals(Calculator.add(1, 2, 3, 4), 10);
    }

    @Test
   public void multiplication() {
        Assert.assertEquals(Calculator.Multiplication(1,2,3,4),24);
    }
}