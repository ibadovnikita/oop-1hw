package Task1;

public class Task1 {
  public static void main(String[] args) {
    Rectangle rec1 = new Rectangle();
    System.out.println(rec1.calculateArea());
    System.out.println(rec1.calculatePerimeter());

    Rectangle rec2 = new Rectangle();
    rec2.setHeight(3);
    rec2.setWidth(5);
    System.out.println(rec2.calculateArea());
    System.out.println(rec2.calculatePerimeter());
    }
}
