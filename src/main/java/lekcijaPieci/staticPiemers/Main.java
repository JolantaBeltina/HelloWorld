package lekcijaPieci.staticPiemers;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {

        Cilveks persona1 = new Cilveks("Pēteris");
        persona1.printName();
        Cilveks persona2= new Cilveks("Anna");
        persona2.printName();
        Cilveks persona3= new Cilveks("Anna2");
        Cilveks persona4= new Cilveks("Anna3");
        Cilveks persona5= new Cilveks("Anna4");
        persona5.printName();


    }
}




