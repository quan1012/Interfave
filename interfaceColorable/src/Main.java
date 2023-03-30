
public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4,"red", shape.isFilled());
        shapes[1] = new Rectangle(5,6,"green", shape.isFilled());
        shapes[2] = new Square("yellow", shape.isFilled(),5);
        System.out.println("Geometry: " );
        for (Shape i: shapes) {
            System.out.println(i);
        }
        System.out.println(" ");
        Main main = new Main();
        main.Test(shapes);
    }
    public void Test(Shape[] array) {
        System.out.println("Colorable Squảquare: ");
        for (Shape i: array) {
            if (i instanceof Square){
                System.out.println(i);
                i.howToColor();
            }
        }
    }
}