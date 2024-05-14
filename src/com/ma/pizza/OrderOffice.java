
package com.ma.pizza;

import java.util.Scanner;

public class OrderOffice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Order od = new Order();

       
            System.out.println("\t\t\t**********ALVII's PIZZA VILLAY**********");
            System.out.println();
            while (true) {
            	 System.out.println();
            System.out.println(" \t\t  *Choose pizza Which Kinds of  PIZZAS Your Want*");
            System.out.println();
            System.out.println("\t\t\t 1. Small Pizza");
            System.out.println("\t\t\t 2. Medium Pizza");
            System.out.println("\t\t\t 3. Large Pizza");
            System.out.println("\t\t\t 4. Cold Drink");
            System.out.println("\t\t\t 5. Generate Bill");
            System.out.println("\t\t\t 6. Exit");

            System.out.println("Enter the Number according to Above Statements:");
            int choice = scanner.nextInt();
            System.out.println("========================");

            switch (choice) {
                case 1:
                {
                    System.out.println("Please enter the Quantity of Small Pizza:");
                    int smallQuantity = scanner.nextInt();
                    od.setTotalSmallQuantity(smallQuantity);
                    od.order(new SmallPizza());
                    System.out.println("Total quantity of Small pizzas ordered: " + od.getTotalSmallQuantity());
                    break;
                }
                case 2:
                {
                    System.out.println("Please enter the Quantity of Medium Pizza:");
                    int mediumQuantity = scanner.nextInt();
                    od.setTotalMediumQuantity(mediumQuantity);
                    od.order(new MediumPizza());
                    System.out.println("Total quantity of Medium pizzas ordered: " + od.getTotalMediumQuantity());
                    break;
                }
                case 3:
                {
                    System.out.println("Please enter the Quantity of Large Pizza:");
                    int largeQuantity = scanner.nextInt();                 
                    od.setTotalLargeQuantity(largeQuantity);
                    od.order(new LargePizza());
                    System.out.println("Total quantity of Large pizzas ordered: " + od.getTotalLargeQuantity());
                    break;
                }
                case 4:
                {
                    System.out.println("Please enter the Quantity of Cold Drink:");
                    int coldDrinkQuantity = scanner.nextInt();
                    od.setTotalColdDrinkQuantity(coldDrinkQuantity);
                    od.order(new ColdDrink());
                    System.out.println("Total quantity of Cold Drinks ordered: " + od.getTotalColdDrinkQuantity());
                    break;
                }
                case 5:
                {
                	System.out.println("Your Bill Is Generated Please Wait..");
                	try {
                   	 Thread.sleep(2000);
						
					} catch (Exception e) {
						
					}
                	 System.out.println("Total quantity of Small pizzas ordered: " + od.getTotalSmallQuantity());
                     System.out.println("Total quantity of Medium pizzas ordered: " + od.getTotalMediumQuantity());
                     System.out.println("Total quantity of Large pizzas ordered: " + od.getTotalLargeQuantity());
                     System.out.println("Total quantity of Cold Drinks ordered: " + od.getTotalColdDrinkQuantity());
                     
                     System.out.println("Total Bill:" + od.calculateTotalAmount());
                    break;
                }
                case 6:
                {
                    System.out.println("\t\t**Thank You for Purchasing!!");
                    System.out.println();
                    break;
                }
                default:
                    System.out.println("Invalid choice");
                    
                    scanner.close();
                    
                    
            }
             
            
            
        }
            
    }
    
   

}

