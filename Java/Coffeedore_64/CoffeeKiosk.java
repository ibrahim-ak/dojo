import java.util.ArrayList;
import java.util.Set;

/**
 * CoffeeKiosk
 */
public class CoffeeKiosk {

     ArrayList<Item> menu;
     ArrayList<Order> orders;

     public CoffeeKiosk() {
          this.menu = new ArrayList<Item>();
          this.orders = new ArrayList<Order>();

     }

     public void addMenuItem(Item item) {
          this.menu.add(item);
     }

     public void displayMenu() {
          for (int x = 0; x < this.menu.size(); x++) {
               System.out.println(this.menu.get(x).getIndex() + " " + this.menu.get(x).getName() + " ---" + "$"
                         + this.menu.get(x).getPrice());
          }
     }

     public void newOrder() {

          // Shows the user a message prompt and then sets their input to a variable, name
          System.out.println("Please enter customer name for new order:");
          String name = System.console().readLine();

          // Your code:
          Order New_order = new Order(name);
          displayMenu();
          // Create a new order with the given input string
          // Show the user the menu, so they can choose items to add.

          // Prompts the user to enter an item number
          System.out.println("Please enter a menu item index or q to quit:");
          String itemNumber = System.console().readLine();
          New_order.addItem(this.menu.get(Integer.parseInt(itemNumber)));
          // Write a while loop to collect all user's order items
          while (!itemNumber.equals("q")) {
               System.out.println("Please enter a menu item index or q to quit:");
               itemNumber = System.console().readLine();
               New_order.addItem(this.menu.get(Integer.parseInt(itemNumber)));

               // Get the item object from the menu, and add the item to the order
               // Ask them to enter a new item index or q again, and take their input
          }
          // After you have collected their order, print the order details
     }
}