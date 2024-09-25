
package Introduction_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListMenu {
    private static ArrayList<String> itemList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        
        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Add item");
            System.out.println("2. View items");
            System.out.println("3. Search item");
            System.out.println("4. Sort items");
            System.out.println("5. Update item");
            System.out.println("6. Delete item");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    clearScreen();
                    addItem();
                    break;
                case 2:
                    clearScreen();
                    viewItems();
                    break;
                case 3:
                    searchItem();
                    break;
                case 4:
                    sortItems();
                    break;
                case 5:
                    updateItem();
                    break;
                case 6:
                    deleteItem();
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
        }
        
        scanner.close();
    }

    private static void addItem() {
        System.out.print("Enter items separated by comma or space: ");
        String input = scanner.nextLine();
        String[] items = input.split("[,\\s]+");
        for (String item : items) {
            itemList.add(item);
        }
        System.out.println("Items added successfully.");
    }

    private static void viewItems() {
        if (itemList.isEmpty()) {
            System.out.println("No items to display.");
            return;
        }
        System.out.println("Items:");
        for (String item : itemList) {
            System.out.println(item);
        }
    }

    private static void searchItem() {
        System.out.print("Enter item to search: ");
        String itemToSearch = scanner.nextLine();
        int index = itemList.indexOf(itemToSearch);
        if (index != -1) {
            System.out.println("Item found at index: " + index);
        } else {
            System.out.println("Item not found.");
        }
    }

    private static void sortItems() {
        Collections.sort(itemList);
        System.out.println("Items sorted.");
    }

    private static void updateItem() {
        System.out.print("Enter index of item to update: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        if (index >= 0 && index < itemList.size()) {
            System.out.print("Enter new value: ");
            String newValue = scanner.nextLine();
            itemList.set(index, newValue);
            System.out.println("Item updated successfully.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    private static void deleteItem() {
        System.out.print("Enter index of item to delete: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        if (index >= 0 && index < itemList.size()) {
            itemList.remove(index);
            System.out.println("Item deleted successfully.");
        } else {
            System.out.println("Invalid index.");
        }
    }
private static void clearScreen() {
    try {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    } catch (Exception ex) {
        System.out.println("Failed to clear screen: " + ex.getMessage());
    }
}


}

