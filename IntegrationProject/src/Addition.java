// overloading a method (1)


public class Addition {
  public int add(int a, int b) {

    int sum = a + b;
    return sum;
  }

  /**
   * @param a
   * @param b
   * @param c
   * @return
   */
  public int add(int a, int b, int c) {

    int sum = a + b + c;
    return sum;
  }

}
