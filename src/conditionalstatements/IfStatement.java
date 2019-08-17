package conditionalstatements;

public class IfStatement {

    public static void main(String[] args) {

        int number = 5;

        if ( number >=3 )
            System.out.println("number is greater...");

            System.out.println("number is smaller");

            boolean paidBillOnTime = false;
            String customerName= "Fahim";
            double currentAccountBalance = 900.84;
            double penaltyFee = 55.85;

            if ( customerName.equalsIgnoreCase("Fahim") && paidBillOnTime == false ) {
                currentAccountBalance = currentAccountBalance - penaltyFee;
                System.out.println("the new current balance is :" + currentAccountBalance);
            }
            else
                System.out.println("thanks for paying the bill on time");
    }
}
