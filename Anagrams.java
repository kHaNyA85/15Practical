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
    }
  }
  
}
