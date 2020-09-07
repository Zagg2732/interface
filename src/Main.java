import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //interface 테스트
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(3.0));
        shapes.add(new Square(4.0));
        shapes.add(new Rectangle(3.0, 6.0));
        //interface로 호출하여 편하게 코드를 짤수있음
        for (Shape shape : shapes){
            System.out.println("넓이: " + shape.getArea());
        }
    }
}
