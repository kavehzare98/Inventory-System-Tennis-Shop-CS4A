// File: src/main/Main.java
package main;
import inventory.*;
import manager.InventoryManager;
import java.io.PrintStream;
import java.io.FileNotFoundException;


public class Main {
	public static void main(String[] args) {
	try
	{
		PrintStream out = new PrintStream("../output.txt");
	System.setOut(out);
		// Add a tennis racquet to invnetory using overloaded constructor
		SportsEquipment tennisRacquet = new SportsEquipment(101, "Wilson", 249.00f, 100, 130.00f, "Tennis", "Used by Tsitsipas", "Racquets", "Blade V8", "98,16x19,4 3/8", 305.00f);
		
		// Add tennis shorts to inventory using setters and getters
		SportsApparel tennisShorts = new SportsApparel();
		
		tennisShorts.setItemID(102);
		tennisShorts.setBrandName("Hurley");
		tennisShorts.setStockQuantity(35);
		tennisShorts.setPrice(40.95f);
		tennisShorts.setPurchaseCost(15.00f);
		tennisShorts.setSport("Tennis");
		tennisShorts.setDescription("Durable and Breathable");

		tennisShorts.setApparelCategory("Active Shorts");
		tennisShorts.setSize("XL");
		tennisShorts.setColor("Black");

		// Create i.m. and add items to list
		InventoryManager inventoryManager = new InventoryManager();
		inventoryManager.addItem(tennisRacquet);
		inventoryManager.addItem(tennisShorts);

		// Call every i.m. function
		System.out.println("All inventory items: ");
		inventoryManager.displayAllItems();

		System.out.println("\nAll IDs in inventory:");
		inventoryManager.printItemIDs();

		int checkID = 101;
		System.out.println("\nChecking stock for Item ID "+checkID+":");
		int stock = inventoryManager.checkStock(checkID);
		System.out.println("Stock for Item ID "+checkID+": " + stock);

		System.out.println("\nRestocking Item ID "+checkID+" by 50 units.");
		inventoryManager.restockItem(checkID, 50);
		System.out.println("Stock after restocking: " + inventoryManager.checkStock(checkID));

		// System.out.println("\nGetting info for Item ID "+checkID+":");
		// inventoryManager.getItemInfo(checkID);

		System.out.println("\nSelling 10 units of Item ID 102:");
		System.out.println("Old Quantity of Item ID 102: " + inventoryManager.checkStock(102));
		inventoryManager.sellItem(102, 10);
		System.out.println("SOLD!");
		System.out.println("New Quantity of Item ID 102: " + inventoryManager.checkStock(102));

		System.out.println("\nCalculating revenue for 15 units of Item ID "+checkID+":");
		float revenue = inventoryManager.calculateRevenue(checkID, 15);
		System.out.println("Revenue for 15 units: $" + revenue);

		System.out.println("\nCalculating cost for 5 units of Item ID 102:");
		float cost = inventoryManager.calculateCost(102, 5);
		System.out.println("Cost for 5 units: $" + cost);

		System.out.println("\nCalculating gross profit for 10 units of Item ID "+checkID+":");
		float profit = inventoryManager.calculateProfit(checkID, 10);
		System.out.println("Gross profit for 10 units: $" + profit);

		System.out.println("\nRemoving Item ID "+checkID+" from inventory:");
		inventoryManager.removeItem(checkID);
		System.out.println("Removed Item ID: " + checkID);

		System.out.println("\nDisplaying all items after removal:");
		inventoryManager.displayAllItems();
		
	} catch(FileNotFoundException e) {
		e.printStackTrace();
		}
	}

	}

