/*
 * Mortgage class stores mortgage details: amount (principal), yearly interest rate, and term (years).
 * Includes a constructor to initialize these fields, getters/setters for each, and a toString()
 * method that returns a formatted description of the mortgage.
 */
public class Mortgage {
    private double amount;
    private double interestRate;
    private int term;

    /*
     * Constructor: initializes mortgage amount, yearly interest rate,
     * and term (in years).
     */
    public Mortgage(double amount, double interestRate, int term) {
        this.amount = amount;
        this.interestRate = interestRate;
        this.term = term;
    }
    public double getAmount() {
        return amount;
    }
    public double getInterestRate() {
        return interestRate;
    }
    public int getTerm() {
        return term;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public void setTerm(int term) {
        this.term = term;
    }
    /*
     * Returns monthly payment M using: M = P[r(1+r)^n] / [(1+r)^n - 1],
     * where P = principal (amount), r = monthly rate, n = term in months.
     */
    public double monthlyMortgage() {
        double mortgagePayment;
        double monthlyRate = (interestRate / 100.0) / 12;
        int numberOfMonths = term * 12;
        double numerator = amount * monthlyRate * Math.pow(1 + monthlyRate, numberOfMonths);
        double denominator = Math.pow(1 + monthlyRate, numberOfMonths) - 1;
        return mortgagePayment = numerator / denominator;
    }
    /*
     *Returns principal balance after the first installment,
     * assuming 25% of the payment reduces principal
     * (and 75% is interest): balance = amount - 0.25 * monthlyMortgage().
     */
    public double principalBalance(){
        double monthlyInstallment = monthlyMortgage();
        double principalPaid = monthlyInstallment * 0.25;
        return (amount - principalPaid);
    }
    /*
     *Applies an early extra principal payment and
     * returns the updated principal balance.
     */
    public double extraPrincipalPayment(double principalPayment){
        double principalBalance = amount - principalPayment;
        setAmount(principalBalance);
        return principalBalance;
    }
    @Override
    public String toString() {
        return String.format("Mortgage Information:\nPrincipal " +
                        "Amount: $%,.2f\nCurrent " +
                        "Interest Rate: %.2f%%\nTerm: %d years",
                        amount, interestRate, term);
    }
}
