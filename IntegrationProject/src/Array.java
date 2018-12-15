

public class Array {
  /**
   * Code to find the smallest value of an array.
   * 
   * @return the smallest value of an array. Code from
   *         https://www.javatpoint.com/java-program-to-find-smallest-number-in-an-array
   */
  public static int getSmallest(int[] a, int total) {
    int temp;
    for (int i = 0; i < total; i++) {
      for (int j = i + 1; j < total; j++) {
        if (a[i] > a[j]) {
          temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }
    return a[0];
  }

  /**
   * String args: Creating two different arrays.
   */
  public static void main(String[] args) {

    // TODO Auto-generated method stub
    int[] a = {1, 2, 5, 6, 3, 2};
    int[] b = {43, 76, 101, 89, 56, 34, 96};

    System.out.println("Smallest: " + getSmallest(a, 6));
    System.out.println("Smallest: " + getSmallest(b, 7));

    int sum = 0;

    for (int counter = 0; counter < a.length; counter++) {
      sum += a[counter];
    }
    System.out.println("The sum of Array a is " + sum + ".");

    int index = -1;

    for (int i = 0; (i < a.length) && (index == -1); i++) {
      if (a[i] == 3) {
        index = i;
      }
    }

    System.out.println("Index 3 of Array a is " + index + ".");
    // enhanced for loop for sum of array a
    int total = 0;

    for (int x : a) {
      total += x;
    }
    System.out.println(total);
  }
}
