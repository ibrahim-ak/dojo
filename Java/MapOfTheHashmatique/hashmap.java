import java.util.HashMap;

public class hashmap {
     public static void main(String[] args) {
          
          HashMap<String, String> tracklist = new HashMap<String, String>();
          tracklist.put("law mara bs", "nasqut en saqatat wln tasqut");
          tracklist.put("kohol w 3atmeh", "etha ests3abt tstaw3eb est3mel esh galak sedak");
          tracklist.put("batata", "patata poteto tometoo tamata");
          tracklist.put("qulee", "e7qni 3'dab jesmek jwa 7oqolee");
          tracklist.put("ya balad2", "b3d ko7ol w 3atmeh 7abse t.. ");

          String track = tracklist.get("law mara bs");
          
          System.out.println(track );
          
          for (String trackk : tracklist.keySet()) {
               System.out.println(trackk + ": " + tracklist.get(trackk));
          }
          
     }

}
