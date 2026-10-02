import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    static long classWithSame = 0;


    public static boolean hasDuplicates(ArrayList<Integer> list) {
        HashSet<Integer> set = new HashSet<>(list);
        return set.size() < list.size();
    }

    public static ArrayList<Integer> makeClass() {
    ArrayList<Integer> className = new ArrayList<Integer>(); // Create an ArrayList object

    
    for (int i = 0;i < 23;i++) {
      int randomNum = (int)(Math.random() * 365) + 1;
      className.add(randomNum);
    
    }
    return className;
  }

  public static void main(String[] args) {    
      
      
   int times = 10000000;
      
  for (int i = 0;i < times;i++) {
      ArrayList<Integer> myList = makeClass();

      if (hasDuplicates(myList)) {
        classWithSame ++;
      }

    
  }
  System.out.println("Success Rate: " + ((double) classWithSame / times * 100) + "%");
 }
}