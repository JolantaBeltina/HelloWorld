package lekcijaCetri.majasDarbs;

public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        triangle.a=6;
        triangle.b=6;
        triangle.g=12;
        triangle.printTriangle();


        System.out.println("****************");

        Triangle triangle1 = new Triangle(10, 10, 15) {};
        triangle1.printTriangle();
        triangle1.printArea();



    }

}
