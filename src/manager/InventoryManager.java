// File: src/manager/InventoryManager.java
//
package manager;

import inventory.InventoryItem;
import inventory.SportsEquipment;
import inventory.SportsApparel;

import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
	
	// items: List containing all inventory items.
	private List<InventoryItem> items;
	
	// Constructor
	public InventoryManager() {

		items = new ArrayList<>();
	}

	// findItem(itemID: int) - helper function that returns index in items List where
	// 			   an inventory item was found (based on its ID). Otherwise,
	// 			   the function returns -1 to indicate item not found.
	public int findItem(int itemID) {
		
		int found = -1;

		for (int i = 0; i < items.size(); i++) {
			if (items.get(i).getItemID() == itemID) {
				found = i;
				break;
			}
		}

		return found;
	}

	// addItem(item: InventoryItem) - This method adds a new item to the inventory system.
	// 				  It initializes the stock quantity to 0. 
	public void addItem(InventoryItem item) {
		items.add(item);
		System.out.println("The following item has been added to the inventory system!");
		System.out.println(item.getInfo());
	}

	// removeItem(int itemID) - This method removes a current inventory item from the system
	// 			    via its itemID.
	// 			    The method returns a boolean as follows:
	// 			    	true - successfully removed item from the items List.
	// 			    	false - unsuccessful operation. Item not found.
	public boolean removeItem(int itemID) {
		
		int found = findItem(itemID);

		if (found != -1) {
			System.out.println("The following item has been removed from the inventory system!");
			items.remove(found);
			return true;
		}
		else {
			System.out.println("The item was not found in the inventory system!");
			return false;
		}

	}


	// getItemInfo(int itemID) - This method attempts to find an item based on its itemID
	// 			     and prints its content if found. Otherwise it prints an
	// 			     error message.
	public void getItemInfo(int itemID) {
		
		int found = findItem(itemID);
		
		if (found != -1) {
			InventoryItem item = items.get(found);
			System.out.println(item.getInfo());
		}
		else {
			System.out.println("The item was not found in the inventory system!");
		}
	}

	// checkStock(int itemID)
	public int checkStock(int itemID) {
		
		int found = findItem(itemID);

		if (found != -1) {
			InventoryItem item = items.get(found);
			
			int stockQuantity = item.getStockQuantity();
	
			return stockQuantity;
		}
		else {
			return found;
		}
	}
	// restockItem(int itemID, int quantity)
	public void restockItem(int itemID, int quantity) {
		int found = findItem(itemID);

		if (found != -1) {
			InventoryItem item = items.get(found);
			int current_stock = item.getStockQuantity();
			int final_stock;
			final_stock = current_stock + quantity;
			item.setStockQuantity(final_stock);
		}
		else {
			System.out.println("Error: Item not found!");
		}
	}

	// printItemIDs()
	public void printItemIDs() {
		System.out.println("\n  itemID  |  brandName  |  price  ");
		for (int i = 0; i < items.size(); i++) {
			System.out.println(items.get(i).getItemID() + " | " + items.get(i).getBrandName() + " | " + items.get(i).getPrice());
		}	
		System.out.println("");
	}
	
	// sellItem(itemID, quantity)
	public void sellItem(int itemID, int quantity) {
		int found = findItem(itemID);

		if (found != -1) {
			InventoryItem item = items.get(found);
			int current_stock = item.getStockQuantity();

			if (quantity > current_stock){
				System.out.println("Insufficient stock. New Selling quantity: " + current_stock);
				item.setStockQuantity(0);	// Sell all remaining stock
			} else {
				System.out.println("Sufficient stock. Selling desired quantity: " + quantity);
				int final_stock = current_stock - quantity;
				item.setStockQuantity(final_stock);
			}

		} else {
			System.out.println("Error: Item not found!");
		}
	}
	
	// displayAllItems()
	public void displayAllItems() {
		System.out.println("Displaying All Items in current Inventory System:");
		for (int i = 0; i < items.size(); i++)
		{
			System.out.println(items.get(i).getInfo());
		}
	}

	// calculateRevenue(itemID, quantity)
	public float calculateRevenue(int itemID, int quantity) {
		int found = findItem(itemID);

		if (found != -1) {
			float itemPrice = items.get(found).getPrice();
			float totalRevenue = itemPrice * quantity;
			return totalRevenue;
		} else {
			return (float)found;
		}
	}
	
	// calculateCost(itemID, quantity)
	public float calculateCost(int itemID, int quantity) {
		int found = findItem(itemID);

		if (found != -1) {
			float itemCost = items.get(found).getPurchaseCost();
			float totalCost = itemCost * quantity;
			return totalCost;
		} else {
			return (float)found;
		}
	}	

	// calculateGrossProfit(itemID, quantity)
	public float calculateProfit(int itemID, int quantity) {
		int found = findItem(itemID);

		if (found != -1) {
			float totalRevenue = calculateRevenue(itemID, quantity);
			float totalCost = calculateCost(itemID, quantity);
			float totalProfit = totalRevenue - totalCost;
			return totalProfit;
		} else {
			return (float)found;
		}
	}

}
