import java.util.ArrayList;

public class Order {

     private String name;
     private boolean ready;
     private ArrayList<Item> itemsList = new ArrayList<Item>();
     public double total;

     public Order(String name) {
          this.name = name;
     }

     public Order() {
          this.name = "guest";
          this.itemsList = new ArrayList<Item>();
     }

     public boolean isReady() {
          return ready;
     }

     public void setReady(boolean ready) {
          this.ready = ready;
     }

     public ArrayList<Item> getItemsList() {
          return itemsList;
     }

     public void setItemsList(ArrayList<Item> itemsList) {
          this.itemsList = itemsList;
     }

     public void addItem(Item Item) {
          this.itemsList.add(Item);
          this.total += Item.getPrice();

     }

     public String getStatusMessage(){
          if (this.ready == true){
               return "your order is ready";
          }
          return "thank you for waiting your order will be ready soon";
          
     }
     public double getOrderTotal() {
          return this.total;
     }
     public void display(){
          System.out.println("customername: "+this.name);
          for (Item item:itemsList ){
               System.out.println(item.getName() + " $"+ item.getPrice());
          }
          System.out.println("Total: $" +getOrderTotal() );
     }
}