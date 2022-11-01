package lekcijaPieci.lekcijaDivi.labDarbs;

import java.util.Scanner;

public class LabDarbsDivi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Hello Lekcija 2");
        String personasKods = "040388-11545";
        boolean vaiIrBalsojis = true;

        // if
        int temperatura = 10;
        // (ja temperatura<10) - man javelk cepure


        // pirmais  nosacījums:

        int vecums;

        System.out.println("Kā Tevi sauc?");
        String name = scanner.nextLine();
        System.out.println("Labdien, " + name + " Esi sveicināta manā programmā!");
        System.out.println("Ievadi cilvēka vecumu: ");
        vecums = scanner.nextInt();

        //iekavas izpildas ja info ir TRUE
        if (vecums >= 18) {
            System.out.println(" Cilvēks drīks balsot");

        }

        System.out.println("Programmas turpinājums...");

        System.out.println("Ievadi skaitli a ");
        int a = scanner.nextInt();
        System.out.println("Ievadi skaitli b ");
        int b = scanner.nextInt();
        int summa = a + b;
        System.out.println("Skaitļa " + a + " un skaitļa " + b + " summa ir " + summa);


        // salīdzināšanas izteiksmes:
        //Lielāks

        int x = 3;
        int y = 2;
        //šeit būs true
        System.out.println(x > y);
        y = 3;
        //šeit būs false
        System.out.println(x > y);
        //Mazāks
        x = 5;
        y = 3;
        System.out.println(x < y);
        y = 10;
        System.out.println(x < y);

        // vienāds:

        System.out.println(x == y);
        System.out.println(5 == 5);
        //
        String luksaforaKrasa = "green";
        System.out.println(luksaforaKrasa.equals("green"));
        System.out.println(luksaforaKrasa.equals("red"));
        // nav vienāds

        System.out.println(x != y);
        //nolieguma simbols "!"
        System.out.println(!luksaforaKrasa.equals("red"));
        //mazāks vienāds
        x = 5;
        y = 5;
        int z = 8;
        System.out.println(x <= y);

        int vecums2 = 18;
        System.out.println("Vai cilvēks var balsot(kļūdains variants nav >=)?" + (vecums2 > 18));
        System.out.println("Vai cilvēks var balsot?" + (vecums2 >= 18));

        // piemērs ar "un" && viesiem jabut TRUE

        System.out.println(x < 6 && z > y);

        // VAI arī

        System.out.println(x < 6 || z > y);

        // mēģinājjums kaut ko prog.

        int age = 18;
        int i = 17;
        boolean hasVoted = false;
        System.out.println("Paksaties cilvēka pasē");
        if (age >= 18 && hasVoted == false) {
            System.out.println("Drīkst balsot!");
        } else {
            System.out.println("Nedrīkst balsot!");
        }
        System.out.println("Tālākās darbības!");

        // pārbaudīt vai skaitlis ir negatīvs, ja ir tad izadīt uz ekrāna telstu - NEGATĪVS
        int skaitlis = -5;
        if (skaitlis <= 0) {
            System.out.println("NEGATĪVS");
        }

        //es aizeju un Nobalsoju

        hasVoted = true;
        if (age >= 18 && hasVoted == false) {
            System.out.println("Drīkst balsot!");
        } else {

            System.out.println(" Nedrīkst balsot!");

        }

        if (skaitlis > 0) {
            System.out.println("Skaitlis pozitīvs ");
        } else {
            System.out.println("Skaitlis negatīvs  vai nulle ");
        }

        String luksaforaKrasa2 = "green";
        if (luksaforaKrasa2.equals("green")) {
            System.out.println(" Ej! ");
        } else {
            System.out.println("Stāvi!");
        }

        // IF elese IF

        System.out.println("Ievadīsim skitli i ");
        if (i == 10) {
            System.out.println("Skaitlis ir 10 ");
        } else if (i == 15) {
            System.out.println("Skaitlis ir 15");
        } else if (i == 20) {
            System.out.println("Skaitlis ir 15");
        } else {
            System.out.println(" Skaitlis nav neviens no vajadzīgajiem!");
        }


        // zaļa gaisma, sarkana gaisma, dzeltena gaisma, nedeg neviena gaisma (skaties zīmes)
        // ievadi skailti  - izvadi  vai poz/neg/ vai nulle
        // KODS - LUKSOFORS
        String trafficLight;
        System.out.println("Enter traffic light color (red, yellow or green):");

        trafficLight = scanner.nextLine();

        if (trafficLight.equals("red")) {
            System.out.println("Stay!");
        } else if (trafficLight.equals("yellow")) {
            System.out.println("Wait!");
        } else if (trafficLight.equals("green")) {
            System.out.println("Go!");
        } else {
            System.out.println("Wrong color!");
        }

        // noteikt v ievadītais  skaitlis ir pāra bai nepāra skaitlis

        int number = scanner.nextInt();
        // te uzrakstīt kodu, kurš izvada vai skaitlis ir para vai nepara
        if (number % 2 == 0) {
            System.out.println(number + " ir pāra skaitlis ");
        } else {
            System.out.println(number + "ir nepāra skaitlis");
        }


        // SWITCH

        int monthNumber = 4;
        switch (monthNumber) {

            case 1:
                System.out.println("Janvaŗis");
                break;
            case 2:
                System.out.println("Februāris");
                break;
            case 3:
                System.out.println("Marts");
                break;
            case 4:
                System.out.println("Aprīlis");
                break;
            default:
                System.out.println("Šāds mēnesis neeksistē");
        }

        String animal = "Dog";
        String reult;
        switch (animal) {
            case "Dog":
                reult = "Domestic animal";
            case "CAT":
                reult = "Domestic animal";
            case "Tiger":
                reult = "Wild animal";
            default:
                reult = "Unknown animal";
        }
        System.out.println("This is animal is " + animal);


        System.out.println("Ievadi skaitli g");
        int g = scanner.nextInt();
        if (g > 0) {
            System.out.println(g + " Ir lielāks par nulle");
        }

    }
}
