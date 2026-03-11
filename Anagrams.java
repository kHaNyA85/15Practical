import java.io.*;
import java.util.*;

public class Anagrams{
  public static String signature(String word) {
    char[] letters = word.toCharArray();
    Array.sort(letters);
    return new String(letters);

    }
  
}
