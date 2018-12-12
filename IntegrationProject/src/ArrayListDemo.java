import java.util.ArrayList;

public class ArrayListDemo {
  public static void main(String[] args) {

    ArrayList<String> a1 = new ArrayList<>();
    
    a1.add("OC");
    a1.add("JP");
    a1.add(1, "A");
    a1.add(3, "8");
    a1.add(4, "8");
    ArrayList<String> a2 = new ArrayList<>();
    a2.add("OC");
    a2.add("P8");
    System.out.println(a1);// prints [OC, A, JP, 8, 8]
    a1.addAll(a2);
    System.out.println(a1);// prints [OC, A, JP, 8, 8, OC, P8]

  }


}
