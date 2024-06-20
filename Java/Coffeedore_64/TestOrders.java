import java.util.ArrayList;

public class TestOrders {
     public static void main(String[] args) {

          CoffeeKiosk cKiosk = new CoffeeKiosk();
          
          Item item1 = new Item("coco", 20.0);
          Item item2 = new Item("coco", 20.0);
          Item item3 = new Item("coco", 20.0);

          cKiosk.addMenuItem(item1);
          cKiosk.addMenuItem(item2);
          cKiosk.addMenuItem(item3);
     
          cKiosk.newOrder();
}
}
