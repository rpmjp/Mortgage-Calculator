public class MortgageCalculation {
    public static void main(String[] args) {

        // mortgage of $400,000 with fixed yearly mortgage rate of 6% for 30 years
        Mortgage njMortgage = new Mortgage(400000,6, 30);
        // mortgage of $350,000 with fixed yearly mortgage rate of 5.75% for 15 years.
        Mortgage nyMortgage = new Mortgage(350000,5.75, 15);

        // monthly mortgage amount for both loans
        System.out.printf("NJ monthly mortgage: $%,.2f%n", njMortgage.monthlyMortgage());
        System.out.printf("NY monthly mortgage: $%,.2f%n \n", nyMortgage.monthlyMortgage());

        //TODO 2, 3, 4, AND 5

        // principal balance after first installment is paid for both loans
        System.out.printf("NJ mortgage principal balance after first installment: $%,.2f%n",
                njMortgage.principalBalance());
        System.out.printf("NY mortgage principal balance after first installment: $%,.2f%n \n",
                nyMortgage.principalBalance());

        // New interest rate by lowering both rates by 25 basis points and print this new
        System.out.println("NJ Old interest rate: " + njMortgage.getInterestRate());
        System.out.println("NY Old interest rate: " + nyMortgage.getInterestRate() + "\n");
        njMortgage.setInterestRate(njMortgage.getInterestRate() - 0.25);
        nyMortgage.setInterestRate(nyMortgage.getInterestRate() - 0.25);
        System.out.println("NJ New interest rate: " + njMortgage.getInterestRate());
        System.out.println("NY New interest rate: " + nyMortgage.getInterestRate());
        System.out.printf("NJ monthly mortgage with new rate: $%,.2f%n",
                njMortgage.monthlyMortgage());
        System.out.printf("NY monthly mortgage with new rate: $%,.2f%n \n",
                nyMortgage.monthlyMortgage());

        // Make extra principal payment of $5000 for both loans and print monthly mortgage
        njMortgage.extraPrincipalPayment(5000);
        nyMortgage.extraPrincipalPayment(5000);

        System.out.printf("NJ monthly mortgage after $5000: $%,.2f%n",
                njMortgage.monthlyMortgage());
        System.out.printf("NY monthly mortgage after $5000: $%,.2f%n",
                nyMortgage.monthlyMortgage());

        // Print the current principal balance for both loans.
        System.out.printf("NJ mortgage principal balance after $5000 payment: $%,.2f%n",
                njMortgage.getAmount());
        System.out.printf("NY mortgage principal balance after $5000 payment: $%,.2f%n \n",
                nyMortgage.getAmount());
    }
}