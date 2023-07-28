package Task1;

/* Реализуйте класс "Прямоугольник" (Rectangle), 
который имеет свойства ширина (width) и высота (height). 
Класс должен обладать следующими методами:

Конструктор без параметров, который создает прямоугольник с шириной и высотой по умолчанию.
Конструктор, который принимает значения ширины и высоты и создает прямоугольник с заданными значениями.
Методы доступа (геттеры и сеттеры) для свойств ширины и высоты.
Метод "вычислить площадь" (calculateArea), который возвращает площадь прямоугольника (ширина * высота).
Метод "вычислить периметр" (calculatePerimeter), 
который возвращает периметр прямоугольника (2 * (ширина + высота)). */

public class Rectangle {
  
  private double width;

  private double height;

  public Rectangle () {
    this.height = 5;
    this.width = 4;
  }

  public Rectangle (double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double calculateArea () {
    return getWidth()*getHeight();
  }

  public double calculatePerimeter() {
    return 2*(getHeight()+getWidth());
  }
}
