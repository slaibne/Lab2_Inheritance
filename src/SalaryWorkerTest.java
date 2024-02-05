import org.junit.jupiter.api.Test;

import java.text.NumberFormat;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {
    SalaryWorker testSalaryWorker = new SalaryWorker("000001", "Jim", "Jambo", "Mr.", 1980, 0, 52000);
    @Test
    void calculateWeeklyPay()
    {
        assert testSalaryWorker.calculateWeeklyPay(40) == (1000);
        assert testSalaryWorker.calculateWeeklyPay(90) == (1000);
    }

    @Test
    void displayWeeklyPay()
    {
        assert testSalaryWorker.displayWeeklyPay(90).equals("The weekly pay is merely the annual salary divided by 52;" +
                " the result being $1,000.00");
        assert testSalaryWorker.displayWeeklyPay(40).equals("The weekly pay is merely the annual salary divided by 52;" +
                " the result being $1,000.00");
    }
}