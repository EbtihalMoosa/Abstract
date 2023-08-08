// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Traingle traingle = new Traingle(9,3);
        System.out.println("the area of triangle= "+ traingle.getArea());
        System.out.println("the paramiter of triangle= " + traingle.calcParmitere());

        Rectangle rectangle = new Rectangle(5,4);
        System.out.println("the area of rectangle= "+ rectangle.getArea());
        System.out.println("the paramiter of rectangle= " + rectangle.calcParmitere());

        Circle circle = new Circle(5);
        System.out.println("the area of circle= "+ circle.getArea());
        System.out.println("the paramiter of circle= " + circle.calcParmitere());



        }
    }
