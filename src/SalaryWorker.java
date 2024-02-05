import java.text.DecimalFormat;
import java.text.NumberFormat;

import static java.text.NumberFormat.getCurrencyInstance;

public class SalaryWorker extends Worker
{
    private double annualSalary;

    public SalaryWorker(String id, String fName, String lName, String title, int yob, double pay, double salary)
    {
        super(id, fName, lName, title, yob, pay);
        this.annualSalary = salary;
    }
    @Override
    double calculateWeeklyPay(double hoursWorked)
    {
        return (annualSalary/52);
    }

    @Override
    String displayWeeklyPay(double hoursWorked)
    {
        NumberFormat num = NumberFormat.getCurrencyInstance();
        return "The weekly pay is merely the annual salary divided by 52; the result being " + num.format(annualSalary/52);
    }
}