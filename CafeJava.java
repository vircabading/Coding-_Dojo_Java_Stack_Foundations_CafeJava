// /////////////////////////////////////////////////////////////
// Coding Dojo > Java Stack > Foundations: Cafe Java
// By: Virgilio D. Cabading Jr.     Created at: November 26, 2021 1730
// /////////////////////////////////////////////////////////////

public class CafeJava {
    // //// MAIN EXECUTABLE CODE ///////////////////////////////
    public static void main(String[] args) {

        // **** Variable Declaration ***************************
        String generalGreeting = "Welcome to Cafe Java, ";
        String orderedMessage = ", ordered a ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String costMessage = " costs $";
        String displayTotalMessage = "Your total is $";
        
        // **** Menu variables *********************************
        double mochaPrice = 3.5;                                // Create 3 more drink price variables
        double dripCoffeePrice = 1.75;                          //  for drip coffee, latte and cappuccino
        double cafeLattePrice = 3.75;
        double cappuccinoPrice = 4.0;
        
        // **** Customer name variables ************************
        String customer1 = "Cindhuri";
        String customer2 = "Noah";                              // Create 3 more customer variables
        String customer3 = "Sam";                               //  for Sam, Jimmy and Noah
        String customer4 = "Jimmy";
        
        // **** Order Completion variables *********************
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;                          // Create the order status flag (true/false) for each customer
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = false;

        // **** Total order price variables ********************
        double totalCostOrder1 = 0;
        double totalCostOrder2 = 0;
        double totalCostOrder3 = 0;
        double totalCostOrder4 = 0;
        
        // //// APP INTERACTION SIMULATION /////////////////////

        System.out.println("/////////////////////////////////////////////////////");
                                                                // First Customer Order a coffee
        System.out.println(generalGreeting + customer1);        // Displays "Welcome to Cafe Java, Cindhuri"
        System.out.println(customer1 + orderedMessage + "drip Coffee");
        totalCostOrder1 += dripCoffeePrice;
        System.out.println("Drip Coffee" + costMessage + totalCostOrder1);
        if (isReadyOrder1) {
            System.out.println(customer1 + readyMessage);
            System.out.println(displayTotalMessage + totalCostOrder1);
        } else {
            System.out.println(customer1 + pendingMessage);
        }
        System.out.println("*****************************************************");
        isReadyOrder1 = true;                                   // Customer's order is now ready
        if (isReadyOrder1) {
            System.out.println(customer1 + readyMessage);
            System.out.println(displayTotalMessage + totalCostOrder1);
        } else {
            System.out.println(customer1 + pendingMessage);
        }
        System.out.println("");

        System.out.println("/////////////////////////////////////////////////////");
                                                                // Noah Orders a Cappuccino
        System.out.println(generalGreeting + customer2);
        System.out.println(customer2 + orderedMessage + "Cappuccino");
        totalCostOrder2 += cappuccinoPrice;
        System.out.println("Cappuccino" + costMessage + totalCostOrder2);
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
            System.out.println(displayTotalMessage + totalCostOrder2);
        } else {
            System.out.println(customer2 + pendingMessage);
        }
        System.out.println("*****************************************************");
        isReadyOrder2 = true;                                   // Customer's order is now ready
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
            System.out.println(displayTotalMessage + totalCostOrder2);
        } else {
            System.out.println(customer2 + pendingMessage);
        }
        System.out.println("");
        
        System.out.println("/////////////////////////////////////////////////////");
                                                                // Sam Orders two Lattes
        System.out.println(generalGreeting + customer3);
        System.out.println(customer3 + orderedMessage + "Cafe Latte");
        totalCostOrder3 += cafeLattePrice;
        System.out.println("Cafe Latte" + costMessage + cafeLattePrice);
        System.out.println(customer3 + orderedMessage + "Cafe Latte");
        totalCostOrder3 += cafeLattePrice;
        System.out.println("Cafe Latte" + costMessage + cafeLattePrice);
        if (isReadyOrder3) {
            System.out.println(customer3 + readyMessage);
            System.out.println(displayTotalMessage + totalCostOrder3);
        } else {
            System.out.println(customer3 + pendingMessage);
        }
        System.out.println("*****************************************************");
        isReadyOrder3 = true;                                   // Customer's order is now ready
        if (isReadyOrder3) {
            System.out.println(customer3 + readyMessage);
            System.out.println(displayTotalMessage + totalCostOrder3);
        } else {
            System.out.println(customer3 + pendingMessage);
        }
        System.out.println("");

        System.out.println("/////////////////////////////////////////////////////");
                                                                // Jimmy just realized he was charged for a coffee but had ordered a latte
        System.out.println(generalGreeting + customer4);
        System.out.println(customer4 + orderedMessage + "Drip Coffee");
        totalCostOrder4 += dripCoffeePrice;
        System.out.println("Drip Coffee" + costMessage + dripCoffeePrice);
        System.out.println(customer4 + orderedMessage + "Cafe Latte instead of a Drip Coffee");
        totalCostOrder4 -= dripCoffeePrice;
        totalCostOrder4 += cafeLattePrice;
        System.out.println("Cafe Latte" + costMessage + cafeLattePrice);
        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + totalCostOrder4);
        } else {
            System.out.println(customer4 + pendingMessage);
        }
        System.out.println("*****************************************************");
        isReadyOrder4 = true;                                   // Customer's order is now ready
        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + totalCostOrder4);
        } else {
            System.out.println(customer4 + pendingMessage);
        }
        System.out.println("");
    }
}