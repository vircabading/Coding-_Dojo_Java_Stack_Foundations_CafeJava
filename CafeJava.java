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
        double capuccinoPrice = 4.0;
        
        // **** Customer name variables ************************
        String customer1 = "Cindhuri";
        String customer2 = "Sam";                               // Create 3 more customer variables
        String customer3 = "Jimmy";                             //  for Sam, Jimmy and Noah
        String customer4 = "Noah";
        
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
        isReadyOrder1 = true;
        if (isReadyOrder1) {
            System.out.println(customer1 + readyMessage);
            System.out.println(displayTotalMessage + totalCostOrder1);
        } else {
            System.out.println(customer1 + pendingMessage);
        }
        System.out.println("");

        // ** Your customer interaction print statements will go here ** //
        
    }
}