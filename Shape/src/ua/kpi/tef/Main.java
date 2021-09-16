package ua.kpi.tef;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Shape shape = new Rectangle(new Point(3,4),new Point(7,6));
        System.out.println(shape);
        Shape shape2 = new Triangle(new Point(4,3), new Point(8,8), new Point(12,3));
        System.out.println(shape2.perimeter());
        System.out.println(shape2.square());
        shape2.move(2,3);




    }
}
