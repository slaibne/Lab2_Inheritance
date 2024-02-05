import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean response = true;
        double hoursThisWeek;
        ArrayList<Worker> staff = new ArrayList<Worker>();
        staff.add(new Worker("010203", "Lovelle", "Surrell", "Ms.", 2001, 27));
        staff.add(new Worker("020304", "Bonnie", "Hou", "Ms.", 2004, 18.50));
        staff.add(new Worker("030405", "Allison", "Siffri", "Ms.", 2000, 22.40));
        staff.add(new SalaryWorker("040506", "Ivy", "Hou", "Ms.", 2001, 0, 48805));
        staff.add(new SalaryWorker("050607", "Gaby", "Hattar", "Ms.", 2001, 0, 51605));
        staff.add(new SalaryWorker("060708", "Sujata", "Adakari", "Ms.", 2001, 0, 46950));
        while (response)
        {
            hoursThisWeek = SafeInput.getDouble(in, "How many hours were worked this week?");
            for (Worker s : staff)
            {
                System.out.println(s.getFormalName() + " " + s.displayWeeklyPay(hoursThisWeek));
            }
            response = SafeInput.getYNConfirm(in, "Are there more weeks you'd like to calculate?");
        }















    }
}