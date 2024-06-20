public class Item {
     private String name;
     private Double price;
     private int index;
     private static int indexmen;

     public int getIndex() {
          return index;
     }

     public void setIndex(int index) {
          this.index = index;
     }

     public Item(String name, Double price) {
          this.name = name;
          this.price = price;
          this.index = indexmen;
          indexmen++;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public Double getPrice() {
          return price;
     }

     public void setPrice(Double price) {
          this.price = price;
     }
}
