import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
     public ArrayList<Integer> getTenRolls() {
          Random random = new Random();

          ArrayList<Integer> things = new ArrayList<Integer>();
          for (int i = 0; i < 10; i++) {
               int rand = random.nextInt(1, 21);
               things.add(rand);

          }
          return things;

     }

     public char getRandomLetter() {
          Random randMachine = new Random();
          int rand = randMachine.nextInt(26);
          char[] alpha = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                    's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
          return alpha[rand];

     }

     public String generatePassword() {
          String password = "";
          for (int i = 0; i < 8; i++) {
               password += getRandomLetter();
          }
          return password;
     }

     public ArrayList<String> getNewpasswordSet(int passlenght) {
          ArrayList<String> batata = new ArrayList<String>();
          for (int i = 0; i < passlenght; i++) {
               batata.add(generatePassword());
          }
          return batata;
     }

}