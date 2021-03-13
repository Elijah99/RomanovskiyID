import com.bsuir.calculator.Calculator;
import com.bsuir.calculator.CalculatorException;
import com.bsuir.calculator.LiquidityCalculator;
import com.bsuir.entity.CoefficientsStatistics;
import com.bsuir.entity.CompanyStatistics;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class LiquidityCalculatorTest {

    CompanyStatistics statistics = new CompanyStatistics(1L, new Date(), null, null, null, 1.1f, null, 1.1f, 1.1f,
            1.1f, null, null, null, null, null, null, null);
    CoefficientsStatistics expected = new CoefficientsStatistics(1.0f, 1.0f, 0.0f);

    CompanyStatistics statistics_second = new CompanyStatistics(1L, new Date(), null, null, null, 2.8f, null, 0.5f, 1.7f,
            1.1f, null, null, null, null, null, null, null);
    CoefficientsStatistics expected_second = new CoefficientsStatistics(0.17857143f, 0.60714287f, 0.21428573f);

    @Test
    public void test() throws CalculatorException {
        Calculator calculator = new LiquidityCalculator();

        CoefficientsStatistics actual = calculator.calculate(statistics);

        Assert.assertEquals(expected, actual);
    }

    @Test(expected = CalculatorException.class)
    public void testException() throws CalculatorException {
        Calculator calculator = new LiquidityCalculator();

        CoefficientsStatistics actual = calculator.calculate(new CompanyStatistics());
    }

    @Test
    public void testSecond() throws CalculatorException {
        Calculator calculator = new LiquidityCalculator();

        CoefficientsStatistics actual = calculator.calculate(statistics_second);

        Assert.assertEquals(expected_second, actual);
    }


}
