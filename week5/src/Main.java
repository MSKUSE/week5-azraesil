public class Main {
    public static void main(String[] args) {

        Point p1 = new Point();
        String s1 = new String(original:"Ali");
        System.out.println(p1.xCoord);
        System.out.println(p1.yCoord);

        Point p2 = new Point(x:3, y:3);
        System.out.println(p2.xCoord);
        System.out.println(p2.yCoord);

        Point p3 = new Point(xy:5);
        System.out.println(p3.xCoord);
        System.out.println(p3.yCoord);


        Point tLeft = new Point(x:3, y:4);
        Rectangle r1 = new Rectangle(
                tLeft, sideA:3, sideB:4);

        System.out.println(r1.getSideA());
        System.out.println(r1.getSideB() );
        System.out.println(r1.getTopLeft().xCoord);
        System.out.println(r1.getTopLeft().yCoord);


    }

    }

Point tLeft = new Point(x:3, y:4);
Circle c1 = new Circle(
        new Point(x:3, y:4),radius:5 );

        System.out.println(c1.radius());
}

public void main() {
}