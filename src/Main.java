import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double gasInTank = 0.0;
        double tankSize = 0.0;
        double milePerGallon = 0.0;
        double pricePerGallon = 0.0;

        boolean validGas = false;
        boolean validTank = false;
        boolean validMPG = false;
        boolean validPPG = false;

        double milesInTank = 0.0;
        double milesLeft = 0.0;
        double gasToBuy = 0.0;
        double priceOfGas = 0.0;
        double fullTank = 0.0;

        do {
            System.out.print("Enter the number of gallons of gas you have in your tank: ");
            if (in.hasNextDouble()) {
                gasInTank = in.nextDouble();
                in.nextLine();
                validGas = true;
            } else {
                System.out.println("Please enter a valid amount of gas");
                in.nextLine();
            }
        } while (validGas == false);

        do {
            System.out.print("Enter the number of gallons of gas your tank can hold: ");
            if (in.hasNextDouble()) {
                tankSize = in.nextDouble();
                in.nextLine();
                validTank = true;
            } else {
                System.out.println("Please enter a valid tank size");
                in.nextLine();
            }
        } while (validTank == false);

        do {
            System.out.print("Enter the miles per gallon your car gets: ");
            if (in.hasNextDouble()) {
                milePerGallon = in.nextDouble();
                in.nextLine();
                validMPG = true;
            } else {
                System.out.println("Please enter a valid mile per gallon");
                in.nextLine();
            }
        } while (validMPG == false);

        do {
            System.out.print("Enter the price per gallon of gas: ");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                in.nextLine();
                validPPG = true;
            } else {
                System.out.println("Please enter a valid price per gallon");
                in.nextLine();
            }
        } while (validPPG == false);

        milesInTank = gasInTank * milePerGallon;
        milesLeft = 100 - milesInTank;
        gasToBuy = milesLeft / milePerGallon;
        priceOfGas = gasToBuy * pricePerGallon;

        fullTank = tankSize * milePerGallon;

        if (milesLeft < 0) {
            System.out.println("You can go 100 miles on your current tank, " +
            "so it would cost $0 to go 100 miles.");
            System.out.printf("On a full tank of gas, this car could drive %.2f miles", fullTank);
        } else {
            //System.out.println("You have " + gasInTank + " gallons in your tank, which is "
            //        + milesLeft + " miles of range. So, you would need to buy " + gasToBuy +
            //        " gallons of gas, which would cost " + priceOfGas + ". So, it" +
            //" would cost " + priceOfGas + " to drive 100 miles.");
            System.out.printf("You have %.2f gallons of gas in your tank, which is " +
                    "%.2f miles of range. So, you would need to buy %.2f gallons \nof gas" +
                    ", which would cost $%.2f. So, it would cost $%.2f to drive 100 miles", gasInTank,
                    milesInTank, gasToBuy, priceOfGas, priceOfGas);
            System.out.printf("\nOn a full tank of gas, this car could drive %.2f miles", fullTank);
        }

    }
}