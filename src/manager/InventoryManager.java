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
			if (item[i].getItemID() == itemID) {
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
		item.getInfo();
	}

	// removeItem(int itemID) - This method removes a current inventory item from the system
	// 			    via its itemID.
	// 			    The method returns a boolean as follows:
	// 			    	true - successfully removed item from the items List.
	// 			    	false - unsuccessful operation. Item not found.
	public bool removeItem(int itemID) {
		
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
			InventoryItem item = items[found];
			item.getInfo();
		}
		else {
			System.out.println("The item was not found in the inventory system!");
		}
	}

	// checkStock(int itemID)
	public int checkStock(int itemID) {
		
		int found = findItem(itemID);

		if (found != -1) {
			InventoryItem item = items[found];
			
			int stockQuantity = item.getStockQuantity();
	
			return stockQuantity;
		}
		else {
			return found;
		}
	}
	// restockItem(int itemID)
	
	// printItemIDs()
	
	// sellItem(itemID, quantity)
	
	// displayAllItems()
	
	// calculateRevenue(itemID, quantity)
	
	// calculateCost(itemID, quantity)
	
	// calculateGrossProfit(itemID, quantity)

	




}
