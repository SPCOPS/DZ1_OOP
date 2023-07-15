public class DZ1_1_OOP {
    public static void main(String[] args) {
    Rectangle rectangle1 = new Rectangle();
        System.out.println("Ширина прямоугольника: " + rectangle1.getWidth());
        System.out.println("Высота прямоугольника: " + rectangle1.getHeight());
        System.out.println("Площадь прямоугольника: " + rectangle1.calculateArea());
        System.out.println("Периметр прямоугольника: " + rectangle1.calculatePerimeter());

        Rectangle rectangle2 = new Rectangle(5.0, 3.0);
        System.out.println("Ширина прямоугольника: " + rectangle2.getWidth());
        System.out.println("Высота прямоугольника: " + rectangle2.getHeight());
        System.out.println("Площадь прямоугольника: " + rectangle2.calculateArea());
        System.out.println("Периметр прямоугольника: " + rectangle2.calculatePerimeter());
    }
}

class Rectangle {
    private double width;
    private double height;


    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double width, double height) {
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

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}