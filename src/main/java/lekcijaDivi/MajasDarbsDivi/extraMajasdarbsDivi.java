package lekcijaDivi.MajasDarbsDivi;


import java.util.Random;
import java.util.Scanner;

public class extraMajasdarbsDivi {

    static void myMethod(){


        Scanner scanner = new Scanner(System.in);
        Random random = new java.util.Random();
        int x = random.nextInt(11)+1;
        System.out.println( "Uzmini skaitli no 0-50!");
        System.out.println("Tu drīskti minēt tikai 10x");
        System.out.println( "Ievadi savu minējumu : ");
        int speletajaSkaitlis = scanner.nextInt();
        if (speletajaSkaitlis ==  x){
            System.out.println("Tu UZMINĒJI! " + " Skaitlis ir: "+ x);
        } else if ( speletajaSkaitlis < x){
            System.out.println("Jūsu skaitlis ir mazāks! Mēģini vēlreiz!");
        } else if (speletajaSkaitlis > x){
            System.out.println( "Tavs skailtis ir lielāks par 50!");
            System.out.println(" Lūdzu ievadi savu minējumu līdz skaitlim 50!");
        }
    }
    public static void main(String[] args) {
        myMethod();
        myMethod();
        myMethod();
        myMethod();
        myMethod();
        myMethod();
        myMethod();
        myMethod();
        myMethod();
        myMethod();

        System.out.println("Tu esi ZAUDĒJIS!");
            
        }


    }









