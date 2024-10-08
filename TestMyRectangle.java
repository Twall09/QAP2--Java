public class TestMyRectangle {
    public static void main(String[] args) {
        MyRectangle rectangle1 = new MyRectangle(2, 4, 2, 5);
        
        System.out.println();
        System.out.println("Rectangle1: " + rectangle1);

        MyPoint topLeft = new MyPoint(2, 6);
        MyPoint bottomRight = new MyPoint(7, 2);
        MyRectangle rectangle2 = new MyRectangle(topLeft, bottomRight);
        System.out.println("Rectangle 2: " + rectangle2);

        System.out.println();
        System.out.println("Rectangle 1 width: " + rectangle1.getWidth());
        System.out.println("Rectangle 1 height: " + rectangle1.getHeight());
        System.out.println("Rectangle 1 area: " + rectangle1.getArea());
        System.out.println("Rectangle 1 perimeter: " + rectangle1.getPerimeter());

        System.out.println();
        System.out.println("Rectangle 2 width: " + rectangle2.getWidth());
        System.out.println("Rectangle 2 height: " + rectangle2.getHeight());
        System.out.println("Rectangle 2 area: " + rectangle2.getArea());
        System.out.println("Rectangle 2 perimeter: " + rectangle2.getPerimeter());
    }
}
