import java.util.ArrayList;

public class ListOfEx {

     public static void main(String[] args) {

          try {
               ArrayList<Object> myList = new ArrayList<Object>();
               myList.add("13");
               myList.add("hello world");
               myList.add(48);
               myList.add("Goodbye World");
               for (int i = 0; i < myList.size(); i++) {
                    Integer castedValue = (Integer) myList.get(i);
               }
               System.out.println(myList);
          }
          catch (Exception batata) {
               System.out.println("Hey, uh, we cant casting this ");
               
          }
     }
}