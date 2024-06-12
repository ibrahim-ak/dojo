import java.util.ArrayList;

public class TestOrders {
     public static void main(String[] args) {
// first assignment >>>>>>>>>>>>


          // // Menu items
          // Item item1 = new Item();
          // Item item2 = new Item();
          // Item item3 = new Item();
          // Item item4 = new Item();
          // item1.name = "mocha";
          // item1.price = 3.33;
          // item2.name = "latte";
          // item2.price = 2.55;
          // item3.name = "drip coffe";
          // item3.price = 4.99;
          // item4.name = "cappuccino";
          // item4.price = 6.22;
          
          // // Order variables -- order1, order2 etc.
          // Order order1 = new Order();
          // Order order2 = new Order();
          // Order order3 = new Order();
          // Order order4 = new Order();
          

          // order1.name = "Cindhuri";
          // order2.name = "jimmy";
          // order3.name = "noah";
          // order4.name = "sam";
          // // Application Simulations
          // order2.itemsList.add(item1);
          // order2.total += item1.price;
          // order3.itemsList.add(item4);
          // order4.itemsList.add(item2);
          // order4.total += item2.price;
          // order4.ready = true;
          // order1.ready = true;
          // order4.itemsList.add(item2);
          // order4.itemsList.add(item2);
          // order4.total = order4.total + (item2.price * 2);
          // order2.ready = true;
          // Use this example code to test various orders' updates
          // System.out.println(order1);
          // System.out.println(order1.total);
          // System.out.println(order4.total);
          // System.out.printf("Name: %s\n", order1.name);
          // System.out.printf("Total: %s\n", order1.total);
          // System.out.printf("Ready: %s\n", order1.ready);
// end of first assignment >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

          Item item1 = new Item("mocha", 20.0);
          Item item2 = new Item("drip coffe", 10.5);
          Item item3 = new Item("cappuccino", 12.66);
          Item item4 = new Item("latte", 4.3);
          Order order1 = new Order();
          Order order2 = new Order();
          Order order3 = new Order("mohie");
          order1.addItem(item1);
          order1.addItem(item2);
          order2.addItem(item4);
          order2.addItem(item1);
          order3.addItem(item4);
          order3.addItem(item4);
          order3.addItem(item1);
          // System.out.println(order1.getItemsList());
          order1.setReady(true);
          
          System.out.println(order1.getStatusMessage());
          // System.out.println(order1.getOrderTotal());
          order3.display();
     }
}
