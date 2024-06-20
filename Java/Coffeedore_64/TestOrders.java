import java.util.ArrayList;

public class TestOrders {
     public static void main(String[] args) {

          CoffeeKiosk cKiosk = new CoffeeKiosk();
          
          Item item1 = new Item("coco", 20.0);
          Item item2 = new Item("batata", 3.5);
          Item item3 = new Item("carto", 12.2);
          Item item4 = new Item("watermellon", 12.2);

          cKiosk.addMenuItem(item1);
          cKiosk.addMenuItem(item2);
          cKiosk.addMenuItem(item3);
          cKiosk.addMenuItem(item4);
     
          cKiosk.newOrder();

}
}
