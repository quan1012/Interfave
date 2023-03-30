public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        Main main = new Main();
        shapes[0] = new Circle(10,"yellow",false);
        shapes[1] = new Rectangle(10,10,"green",false);
        shapes[2] = new Square("red",false,10);
        for(Shape i : shapes){
            System.out.println(i);;
        }
        System.out.println(" ");
        main.Resize(shapes);

    }

    private void Resize(Shape[] array) {
        for (Shape i : array) {
            i.resize(Math.random() *100);
            System.out.println(i);
        }
        }
    }