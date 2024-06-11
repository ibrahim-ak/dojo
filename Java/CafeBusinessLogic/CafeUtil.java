import java.util.ArrayList;

public class CafeUtil {

     public int getStreakGoal(int numOfWeeks) {
          int sum = numOfWeeks * (numOfWeeks + 1) / 2;
          return sum;
     }

     public double getOrderTotal(double[] lineItems) {
          double sum = 0;
          for (int i = 0; i < lineItems.length; i++) {
               // System.out.println(sum);
               sum += lineItems[i];
          }
          return sum;
     }

     public void displayMenu(ArrayList<String> menuItems) {
          for (int i = 0; i < menuItems.size(); i++) {
               String name = menuItems.get(i);
               System.out.println(i + " " + name);

          }
     }

     public void addCustomer(ArrayList<String> customers) {
          System.out.println("please enter your username");
          String username = System.console().readLine();
          customers.add(username);
          System.out.println("hello " + username);
          System.out.println(customers);
     }

}
