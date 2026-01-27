public class MortgageCalculation {
    public static void main(String[] args) {

        Mortgage njMortgage = new Mortgage(400000,6, 30);
        Mortgage nyMortgage = new Mortgage(350000,5.75, 15);

        //System.out.println(nyMortgage);
        System.out.printf("NJ monthly mortgage: $%,.2f%n", njMortgage.monthlyMortgage());
        System.out.printf("NY monthly mortgage: $%,.2f%n", nyMortgage.monthlyMortgage());

        //TODO 2, 3, 4, AND 5

    }
}