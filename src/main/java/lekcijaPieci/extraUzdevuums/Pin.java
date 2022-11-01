package lekcijaPieci.extraUzdevuums;

import java.util.Scanner;

public class Pin {


    Scanner pinScanner = new Scanner(System.in);


    int pin = 1234;
    int ievaditaisSkailis;
    int j = 0;

    public void parbauduparbadu() {

        System.out.println("Ievadi savu PIN kodu:");
        ievaditaisSkailis = pinScanner.nextInt();
        while (ievaditaisSkailis != pin || j >= 3) {
            System.out.println("Nepareizs PIN, mēģiniet vēlreiz");
            System.out.println("Ievadi savu PIN kodu:");
            ievaditaisSkailis = pinScanner.nextInt();
            j++;

        }
        System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ");

    }
}








//
//        public void parbaudamPin (){
//            System.out.println("Ievadi savu PIN kodu:");
////          ievaditaisSkailis = pinScanner.nextInt();
//                int x = 0;
//            if (ievaditaisSkailis==pin) {
//                System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ");
//
//            } else  {
//                System.out.println("Nepareizs PIN, mēģiniet vēlreiz");
//                x++;
//            }
//            System.out.println("Atvainojiet, bet jūs esat bloķēts");
//        }
//    }

