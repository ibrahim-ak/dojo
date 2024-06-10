import java.util.Date;
public class AlfredQuotes {

     public String basicGreeting() {
          // You do not need to code here, this is an example method
          return "Hello, lovely to see you. How are you?";
     }
     public void guestGreeting (){
          System.out.println("hello world");
     }
     public String guestGreeting(String name) {
          // YOUR CODE HERE
          return "hello ! how are you " + name;
     }

     public String guestGreeting(String firstName, String lastName) {
          return "hello ! how are you " + firstName + " " + lastName + " i'am alfred ";
     }

     public String dateAnnouncement() {
          // YOUR CODE HERE
          Date data = new Date();
          return "placeholder for date announcement " + data;
     }
     public String respondBeforeAlexis(String conversation) {
          // YOUR CODE HERE
          return conversation;
     }
     // NINJA BONUS
     public String helloBatata(){
          return "hello Batata";
     }
     // See the specs to overload the guestGreeting method
     // SENSEI BONUS
     // Write your own AlfredQuote method using any of the String methods you have
     // learned!
}
