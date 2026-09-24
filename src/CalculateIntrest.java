public class CalculateIntrest {
    public static void main(String[] args) {
        System.out.println(CompoundIntrest(1000, 5, 0,05));
    }

public static double calculateInterestEarned(double principal, int years, double interestRate) {
    double totalAmount = principal;


    for (int year = 0; year < years; year++) {
        totalAmount = totalAmount + (totalAmount * interestRate);
    }

   
    return totalAmount - principal;
     }
}