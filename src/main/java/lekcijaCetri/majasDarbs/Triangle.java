package lekcijaCetri.majasDarbs;

import java.util.Date;

public class Triangle {

    int a;
    int b;
    int g;
    int area;
    boolean vaiVienadasmalas=true;
    boolean vaiVienadisani = true;

    Triangle (){
        System.out.println("Veidojam jaunu trijstūri!  ");
    };

    public void printTriangle(){
        System.out.println("\n Mala a: " + a + "\n Mala b: " + b + "\n Mala g: " + g);
    }

    Triangle(int a, int g, int b){
        this.a=a;
        this.g=g;
        this.b=b;
        area=(b*a*g)/2;
        }
    public void printArea(){
        System.out.println("Tringle area is : " + area);}
    }











