
/**
 * @author https://www.geeksforgeeks.org/different-ways-method-overloading-java/
 * part two of overloading a method
 */
class GFG {
  public static void main(String[] args) {

    Addition ob = new Addition();

    int sum1 = ob.add(1, 2);
    System.out.println("sum of the two integer value :" + sum1);
    int sum2 = ob.add(1, 2, 3);
    System.out.println("sum of the three integer value :" + sum2);

  }
}
