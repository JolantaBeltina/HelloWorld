package lekcijaDivi.MajasDarbsDivi;

import java.util.Scanner;

public class MajasDarbsDivi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        // 1. uzdevums:

        int x = 5;
        int y = 10;
        //a
        System.out.println(y>x);
        //b
        System.out.println(y<x);
        //c
        System.out.println(x==5 && x<=10);
        //d
        System.out.println(x<=5 || x<10);
        //e
        System.out.println(x==0 || x==10);
        //f
        System.out.println(x*x > 10);



        // 2. uzdevums:
        System.out.println( "Ievadi mēneša skaitli: ");
        int monthNumber = scanner.nextInt();

        switch ( monthNumber) {
            case 1 : System.out.println( "Janvāris ir 1. mēnesis");
            break;
            case 2 : System.out.println( "Februāris ir 2.mēnesis");
                break;
            case 3 : System.out.println( "Marts ir 3.mēnesis");
                break;
            case 4 : System.out.println( "Aprīlis ir 4.mēnesis");
                break;
            case 5 : System.out.println( "Maijs ir 5.mēnesis");
                break;
            case 6 : System.out.println( "Jūnijs ir 6.mēnesis");
                break;
            case 7 : System.out.println( "Jūlijs ir 7.mēnesis");
                break;
            case 8 : System.out.println( "Augusts ir 8.mēnesis");
                break;
            case 9 : System.out.println( "Septembris ir 9.mēnesis");
                break;
            case 10 : System.out.println( "Oktobris ir 10.mēnesis");
                break;
            case 11 : System.out.println( "Novembris ir 11.mēnesis");
                break;
            case 12 : System.out.println( "Decembris ir 12.mēnesis");
                break;

        }


        // 3. uzdevums:


        System.out.println( "Ievadi trīs skaitļus: ");
        int veselsSkaitlis1 = scanner.nextInt();
        int veselsSkaitlis2 = scanner.nextInt();
        int veselsSkaitlis3 = scanner.nextInt();

        if ( veselsSkaitlis1 > veselsSkaitlis2 && veselsSkaitlis1 > veselsSkaitlis3){
            System.out.println(" Jūsu ievadītais 1. skaitlis ir lielākais ievadītais skaitlis: " + veselsSkaitlis1);
        } else if (veselsSkaitlis2 > veselsSkaitlis1 && veselsSkaitlis2>veselsSkaitlis3) {
            System.out.println("Jūsu ievadītais 2. skaitlis ir lielākais ievadītais skaitlis: " + veselsSkaitlis2);

        } else if ( veselsSkaitlis3 > veselsSkaitlis2 && veselsSkaitlis3>veselsSkaitlis1) {
            System.out.println("Jūsu ievadītais 3. skaitlis ir lielākais ievadītais skaitlis  : " + veselsSkaitlis3);
        }


        // 4. uzdevums:



        System.out.println(" Ievadi luksofora krāsu (Green, Yellow, Red)?");

        String color;
        color = scanner.nextLine();


        if (color.equals("Green")) {
            System.out.println("Drīkst šķērsot ielu!");
        } else if ( color.equals("Yellow")){
            System.out.println(" Gaidi!");
        } else if (color.equals("Red")){
            System.out.println("Gaidi!");
        } else {
            System.out.println( "Nepareiza krāsa!");
        }


    // 5. uzdevums:























    }
}
