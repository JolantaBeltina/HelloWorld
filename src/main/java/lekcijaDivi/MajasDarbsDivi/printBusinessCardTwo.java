package lekcijaDivi.MajasDarbsDivi;

public class printBusinessCardTwo {


    static void myMethod(String name, String surName, String phoneNumber, int birthDate) {
        System.out.println(  "##########"+ "\n" +"Vārds: " + name + "\n" + "Uzvārds: " + surName +"\n"+
                "Telefona numurs: " + phoneNumber + "\n" + "Dzimšanas datums: " + birthDate);
    }

    public static void main(String[] args) {
        myMethod("Jolanta", "Beltiņa", " +371 29698605", 1988);
        myMethod("Anna", "Panna", "+371 12345678", 2022);

    }
}

