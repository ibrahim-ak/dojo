public class CafeJava {
     public static void main(String[] args) {
          String generalGreeting = "Welcome to Cafe Java, ";
          String pendingMessage = ", your order will be ready shortly";
          String readyMessage = ", your order is ready";
          String displayTotalMessage = "Your total is $";

          double mochaPrice = 3.5;
          double dripCofePrice = 4.99;
          double lateePrice = 6.3;
          double cappuccinoPrice = 4.5;

          String customer1 = "Cindhuri";
          String customer2 = "Sam";
          String customer3 = "Jimmy";
          String customer4 = "Noah";

          boolean isReadyOrder1 = false;
          boolean isReadyOrder2 = true;
          boolean isReadyOrder3 = false;
          boolean isReadyOrder4 = true;

          System.out.println(generalGreeting + customer2);
          // if (isReadyOrder1){
          // System.out.println(readyMessage );
          // // System.out.println(displayTotalMessage +  );
          
          // }
          // else{
          //      System.out.println(pendingMessage);
          // }

          // if (isReadyOrder4){
          //      System.out.println(readyMessage );
          //      System.out.println(displayTotalMessage + "" + cappuccinoPrice  );
               
          //      }
          //      else{
          //           System.out.println(pendingMessage);
          //      }
          // if (isReadyOrder2){
          //      System.out.println(readyMessage );
          //      System.out.println(displayTotalMessage + lateePrice*2  );
               
          //      }
          //      else{
          //           System.out.println(pendingMessage);
          //      }
          if (isReadyOrder2){
               System.out.println(readyMessage );
               System.out.println(displayTotalMessage + (  mochaPrice- lateePrice)   );
               if (mochaPrice- lateePrice < 0){
                    System.out.println("dear " + customer2 + " you need to charge $" + Math.abs(lateePrice-mochaPrice));
               }
               else{
                    System.out.println("dear " + customer2 + " we owe you " +  Math.abs(lateePrice-mochaPrice));
               }
               
               }
          else{
               System.out.println(pendingMessage);
               }
     }
}
