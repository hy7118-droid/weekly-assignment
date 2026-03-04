import java.util.Scanner;

public class IncomeCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // User Inputs
        double salary = input.nextDouble();
        double bonus = input.nextDouble();

        // Calculation
        double totalIncome = salary + bonus;

        // Output
        System.out.println("The salary is INR " 
                + salary 
                + " and bonus is INR " 
                + bonus 
                + ". Hence Total Income is INR " 
                + totalIncome);

        input.close();
    }
}
