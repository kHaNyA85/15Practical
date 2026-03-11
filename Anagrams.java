import java.io.*;
import java.util.*;

public class Anagrams{
  public static String signature(String word) {
    char[] letters = word.toCharArray();
    Array.sort(letters);
    return new String(letters);

    }
  public static void main(String[] args) {
    HashMap < String, ArrayList < String >> D = new HashMap<>();

    try{
      BufferedReader br = new BufferedReader(new FileReader("joyce1922_ulysses-1.text"));
      String Line;

      while ((line = br.readLine()) != null) {
        String[] words = line.split("\\s+");

        for (String w : words) {
          w = w.replaceAll("[.,;,:_!-]");
          w = w.toLowerCase();

          if (w.length() == 0) {
            continue;
          }
          String key = signature(w);

          if (!D.containsKey(key)) {
            ArrayList < String > list = new ArrayList<>();
            list.add(w);
            D.put(key, list);
          }
          else {
            D.get(key).add(w);
          }
          
        }
      }
      br.close();
      for (String key : D.keySet()) {
        ArrayList < String > list = D.get(key);

        if (list.size() >= 2) {
          System.out.println("key + ":" + list);
        }
      }
    }
    catch(IOException e) {
      System.out.println("Error reading file.");
    }
  }
  
}
