import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {
    Worker testWorker = new Worker("000001", "Jane", "Jambo", "Mrs.", 1982, 20);
    @Test
    void calculateWeeklyPay()
    {
        assert testWorker.calculateWeeklyPay(40) == 800;
        assert testWorker.calculateWeeklyPay(60) == 1400;
    }

    @Test
    void displayWeeklyPay()
    {
        assert testWorker.displayWeeklyPay(40).equals("Worked for 40.0 hours and gained this much money: $800.00");
        assert testWorker.displayWeeklyPay(60).equals("From the normal time worked of 40 hours; gained: $800.00" +
                " Then worked for another 20.0 hours of overtime and gained: $600.00 " +
                "In total worked for 60.0 hours and gained: $1,400.00");
    }
}
