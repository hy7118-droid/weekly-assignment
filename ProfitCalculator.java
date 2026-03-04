public class ProfitCalculator {

    public static void main(String[] args) {

        // Fixed Values
        double costPrice = 129.0;
        double sellingPrice = 191.0;

        // Calculations
        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;

        // Output (Single Print Statement)
        System.out.println("The Cost Price is INR " + costPrice 
                + " and Selling Price is INR " + sellingPrice + "\n"
                + "The Profit is INR " + profit 
                + " and the Profit Percentage is " + profitPercentage);
    }
}
