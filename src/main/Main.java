// File: src/main/Main.java
package main;
import inventory.*;
import manager.InventoryManager;

public class Main {
	public static void main(String[] args) {
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
			
		}

	}

