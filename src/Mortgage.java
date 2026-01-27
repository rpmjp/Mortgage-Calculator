public class Mortgage {
    private double amount;
    private double interestRate;
    private int term;

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
    public double monthlyMortgage() {
        double mortgagePayment;
        double monthlyRate = (interestRate / 100.0) / 12;
        int numberOfMonths = term * 12;
        double numerator = amount * monthlyRate * Math.pow(1 + monthlyRate, numberOfMonths);
        double denominator = Math.pow(1 + monthlyRate, numberOfMonths) - 1;
        return mortgagePayment = numerator / denominator;
    }
    public double principalBalance(){
        double monthlyInstallment = monthlyMortgage();
        double principalPaid = monthlyInstallment * 0.25;
        return (amount - principalPaid);
    }
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
