package lekcijaPieci.staticPiemers;

public class Cilveks {

    public static int count = 1;

    public int darbiniekaNumurs;


    public String name;

    public Cilveks(String name) {
        this.name = name;
        darbiniekaNumurs = count;
        count ++;
    }
    public void printName(){
        System.out.println("Cilvēka vārds ir: "+ name);
        System.out.println("Darbinieka "+ name +  " numurs ir :  " + darbiniekaNumurs);
    }
}
