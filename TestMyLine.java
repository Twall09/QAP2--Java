public class TestMyLine {
    public static void main(String[] args) {
        MyLine line1 = new MyLine(4, 5, 10, 15);

        System.out.println();
        System.out.println("Line 1: ");
        System.out.println(line1);  
        System.out.println("Length: " + line1.getLength());  
        System.out.println("Gradient: " + line1.getGradient()); 
        
        System.out.println(); 
        System.out.println("Line 2: ");
        MyPoint begin = new MyPoint(1, 2);
        MyPoint end = new MyPoint(5, 8);
        MyLine line2 = new MyLine(begin, end);
        System.out.println(line2); 
        System.out.println("Length: " + line2.getLength());  
        System.out.println("Gradient: " + line2.getGradient());  
    }
}
