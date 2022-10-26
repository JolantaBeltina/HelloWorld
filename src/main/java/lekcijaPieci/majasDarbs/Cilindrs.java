package lekcijaPieci.majasDarbs;

public class Cilindrs {

    private double radius;
    private double height;

    public double getRadius() {return radius;}

    public void setRadius(double radius) {this.radius = radius;}

    public double getHeight() {return height;}

    public void setHeight(double height) {this.height = height;}

    public double surFaceArea;
    double volume;


    public double getSurFaceArea (){
        return 2 * Math.PI * radius * (radius + height);}
    public double getVolume (){return Math.PI * radius * radius * height;}



    public Cilindrs(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public Cilindrs(){}
    public void printCilindrs() {
        System.out.println("Cilindra radiuss: " + radius + "\n Cilindra augstums: " + height );

             }







           }










