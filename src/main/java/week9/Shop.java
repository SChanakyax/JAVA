package week9;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * welcome to ABC shop
 * Name : >> ?
 * Greetings : ""
 *
 * Menu Items
 * ItemCode Item Name Price
 * 101       Apple    150
 * ---
 *
 * Enter the item code to order >> ?? [if invalid - invalid item code enter again; display item name and the price]
 * Quantity >> ?
 *
 * To check out enter :0 or any other to shop more>> ??
 *
 * Enter the Item code to order >> ?? [if invalid -  invalid item code enter again ;  display Item name and the price]
 * Quantity >> ??
 *
 * To Check out enter :0 or any other to shop more>> ??
 * Should be repeated as per user input
 *
 * Display the items ordered, quantity, price and total
 *
 * Loyalty Number >> ?? (4 digits)
 * if loyalty number starts with 10**** -10% discount , 20**** -20% discount
 *
 * Display discount and amount to pay
 *
 * Thank You!
 */
public class Shop {
    public static void main(String[] args) {
        String name;
        int quantity, total=0, i=0,itemCode, loyalityNumber;
        float tTotal = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ABC Shop ");

        System.out.println("Please enter your name : ");
        name = sc.nextLine();

        System.out.println("Greetings " + name +" \n");

        String items[][] =  {
            {"101","Apple","150"},
            {"102", "Orange", "100"},
                {"103","Grapes","340"},
                {"104","Avacado","200"}
        };

        System.out.println("Menu Items are shown below ");
        System.out.println("ItemCode \tItem Name \tPrice");

        for (int m=0; m< items.length; m++){
            for (int j=0;j< 3; j++){
                System.out.print(items[m][j] + "\t\t\t");
            }
            System.out.println();
        }


        do{
            System.out.print("Enter item code (To Check out enter :0 or any other to shop more) : ");
            itemCode = sc.nextInt();

            for( i=0; i<items.length; i++) {
                if(items[i][0].equals(String.valueOf(itemCode))){
                    System.out.println("Item Found");
                    System.out.print("Enter the quantity : ");
                    quantity = sc.nextInt();

                    System.out.println(items[i][2]);
                    tTotal = total + (quantity * Integer.parseInt(items[i][2]));
                    break;
                }else {
                    System.out.println("Item Not found");
                }
            }
        } while(itemCode != 0);

        do{
            System.out.println("Enter the loyality number : ");
            loyalityNumber = sc.nextInt();

            if(loyalityNumber / 10 == 10){
                tTotal +=  (tTotal * 0.9);
                System.out.println("Discount is 10% ");
            }else if (loyalityNumber / 20 == 20) {
                tTotal += (tTotal * 0.8);
                System.out.println("Discount is 20% ");
            }else {
                System.out.println("re enter the loyality number");
            }


        } while (String.valueOf(loyalityNumber).length() > 4);

        System.out.print("Amount to be paid  ");
        System.out.println(tTotal);


    }
}
