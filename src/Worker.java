import java.text.NumberFormat;

public class Worker extends Person {
    private double hourlyPayRate;


    public Worker(String id, String fName, String lName, String title, int yob, double pay)
    {
        super(id, fName, lName, title, yob);
        this.hourlyPayRate = pay;
    }
    double calculateWeeklyPay(double hoursWorked)
    {

        double v;
        if(hoursWorked <= 40)
            v = (hourlyPayRate * hoursWorked);
        else
            v = (hourlyPayRate*40) + ((hoursWorked - 40) * (hourlyPayRate*1.5));
        return v;
    }
    String displayWeeklyPay(double hoursWorked)
    {
        NumberFormat num = NumberFormat.getCurrencyInstance();
        if(hoursWorked <= 40)
            return "Worked for " + hoursWorked + " hours and gained this much money: " + num.format(hourlyPayRate * hoursWorked);
        else
            return "From the normal time worked of 40 hours; gained: " + num.format(hourlyPayRate*40) +
                    " Then worked for another " + (hoursWorked-40) + " hours of overtime and gained: " + num.format((hoursWorked - 40) * (hourlyPayRate*1.5)) +
                    " In total worked for " + hoursWorked + " hours and gained: " + num.format(this.calculateWeeklyPay(hoursWorked));
    }
}