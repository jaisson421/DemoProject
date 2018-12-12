// overloading a method (1)


/** First of two classes to demonstrate overloading a method.
 * @author Jaisson Lazo
 *
 */


public class Addition {
  /** 
   *Adds two set integers.
   * @return value of sum two integers.
   */
  public int add(int a, int b) {

    int sum = a + b;
    return sum;
  }

  /** 
   *Adds two set integers.
   * @return value of sum two integers.
   */
  public int add(int a, int b, int c) {
   

    int sum = a + b + c;
    return sum;
  }

}
