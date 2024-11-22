// File: src/main/Main.java
package main;
import inventory.*;
import manager.InventoryManager;

public class Main {
	public static void main(String[] args) {
		// Add a tennis racquet to invnetory using overloaded constructor
		SportsEquipment tennisRacquet = new SportsEquipment(101, "Wilson", 100, 249.00, 130.00, "Tennis", "Used by Tsitsipas", "Racquets", "Blade V8", "98,16x19,4 3/8", 305);
		
		// Add tennis shorts to inventory using setters and getters
		SportsApparel tennisShorts = new SportsApparel(101, "Wilson", 100, 249.00, 130.00, "Tennis", "Used by Tsitsipas", "Racquets", "Blade V8", "98,16x19,4 3/8", 305);
		
		tennisShorts.setItemID(102);
		tennisShorts.setBrandName("Hurley");
		tennisShorts.setStockQuantity(35);
		tennisShorts.setPrice(40.95);
		tennisShorts.setPurchaseCost(15.00);
		tennisShorts.setSport("Tennis");
		tennisShorts.setDescription("Durable and Breathable");

		tennisShorts.setEquipmentCategory("Active Shorts");
		tennisShorts.setSize(8);
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

