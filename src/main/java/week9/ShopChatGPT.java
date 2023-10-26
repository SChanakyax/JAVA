package week9;

import java.util.Scanner;

public class ShopChatGPT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        StringBuilder orderSummary = new StringBuilder();

        System.out.println("Welcome to ABC shop");

        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.println("Greetings: " + name);

        // Define the menu as a two-dimensional array (itemCode, itemName, price)
        String[][] menu = {
                {"101", "Apple", "150"},
                // Add more items to the menu as needed
        };

        while (true) {
            System.out.println("\nMenu Items");
            System.out.println("ItemCode   Item Name   Price");

            for (String[] item : menu) {
                System.out.printf("%s          %s         %s%n", item[0], item[1], item[2]);
            }

            int itemCode;
            String itemName = "";
            double itemPrice = 0;

            while (true) {
                System.out.print("Enter the item code to order: ");
                itemCode = Integer.parseInt(scanner.nextLine());

                // Search for the item in the menu
                boolean itemFound = false;
                for (String[] item : menu) {
                    if (Integer.parseInt(item[0]) == itemCode) {
                        itemName = item[1];
                        itemPrice = Double.parseDouble(item[2]);
                        itemFound = true;
                        break;
                    }
                }

                if (itemFound) {
                    break;
                } else {
                    System.out.println("Invalid item code. Please enter a valid item code.");
                }
            }

            System.out.print("Quantity: ");
            int quantity = Integer.parseInt(scanner.nextLine());

            double itemCost = itemPrice * quantity;
            total += itemCost;

            orderSummary.append(itemName).append("\t").append(quantity).append("\t").append(itemPrice).append("\t").append(itemCost).append("\n");

            System.out.print("To check out, enter 0; to shop more, enter any other key: ");
            int checkoutChoice = Integer.parseInt(scanner.nextLine());

            if (checkoutChoice == 0) {
                break;
            }
        }

        System.out.print("Loyalty Number (4 digits): ");
        String loyaltyNumber = scanner.nextLine();

        double discount = 0;
        if (loyaltyNumber.startsWith("10")) {
            discount = 0.10;
        } else if (loyaltyNumber.startsWith("20")) {
            discount = 0.20;
        }

        double discountedTotal = total - (total * discount);

        // Display order summary
        System.out.println("\nItems Ordered:");
        System.out.println("Item Name\tQuantity\tPrice\tTotal");
        System.out.println(orderSummary.toString());
        System.out.printf("Total: %.2f%n", total);

        // Display discount and amount to pay
        System.out.printf("Discount: %.0f%%%n", discount * 100);
        System.out.printf("Amount to Pay: %.2f%n", discountedTotal);

        System.out.println("Thank You!");

        scanner.close();
    }
}
