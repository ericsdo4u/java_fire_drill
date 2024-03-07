import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LogisticsServiceTest {

    @Test
    public void testCheckNumberOfDeliveryIs50() {
        assertEquals(45000, LogisticsService.calculationOfDispatchersBasePay(80));
    }

    @Test
    public void testNumbersOfDeliveryIs25AndTheResult_Is_9000() {
        assertEquals(9000 , LogisticsService.calculationOfDispatchersBasePay(25));
    }

    @Test
    public void testThatThereIsNoNegativeDelivery() {
        assertThrows(IllegalArgumentException.class, () -> LogisticsService.calculationOfDispatchersBasePay(-30));

    }

}