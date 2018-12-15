import java.util.ArrayList;


public class ArrayListDemo {
  /**
   *ArrayList: to make Array List.
   *Code from https://javabeat.net/ocajp-arraylist/
   */
  public static void main(String[] args) {

    ArrayList<String> a1 = new ArrayList<>();

    a1.add("Ja");
    a1.add("ss");
    a1.add(1, "i");
    a1.add(3, "o");
    a1.add(4, "n");
    ArrayList<String> a2 = new ArrayList<>();
    a2.add("La");
    a2.add("zo");
    System.out.println(a1);
    a1.addAll(a2);
    System.out.println(a1);

  }


}
