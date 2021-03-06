
public class TestBikes {
  /**
   * String args: Creating 3 "Bicycle" objects.
   * @author https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html
   *
   */
  public static void main(String[] args) {
    Bicycle bike01;
    Bicycle bike02;
    Bicycle bike03;

    bike01 = new Bicycle(20, 10, 1);
    bike02 = new MountainBike(20, 10, 5, "Dual");
    bike03 = new RoadBike(40, 20, 8, 23);

    bike01.printDescription();
    bike02.printDescription();
    bike03.printDescription();
  }
}
