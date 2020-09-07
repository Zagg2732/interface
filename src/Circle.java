public class Circle implements Shape{  // shape interface를 적용

    public static final double PI = Math.PI; // 원주율은 Math.PI를 사용

    public final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    } //shape interface 사용

}
