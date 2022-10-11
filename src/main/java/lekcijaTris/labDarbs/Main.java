package lekcijaTris.labDarbs;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
//        System.out.println("Sākas programma");
//        manaMetode2("Pēteris", "Kalniņš", "Jūrmala",60);
//        manaMetode2("Pēteris2", "Kalniņš2", "Jūrmala2",50);
//        manaMetode();
//        manaMetode();
//        System.out.println("Beidzas programma");
//        int laukums = aprekinatTaisnsturaLaukumu(3,6);
//        System.out.println("Taisnstura laukums ir: " + laukums);
//        macamiesMasivus();


        uzdevumsSavsvards();



    }

    // uzdevums 4 nodefinet savu vārdu kā masīvu ar char
    //izvadit izmantojot foreach ciklu

    public static void uzdevumsSavsvards (){
        char [] mansVards = {'J', 'o','l','a', 'n', 't', 'a'};
        for (char vards : mansVards) {
            System.out.println(vards);









    }


//    // UZDEVUMS 3 majas kas dalās ar 3 un 5;
//
//    public static void uzdevumsMajas (){
//int count = 0;
//        int j;
//        for (j=0; j<=50; j++){
//            if (j%3==0 || j%5==0){
//                System.out.println("Šie nurmuri neder: " + j);
//            } else {
//                count++;
//            }
//        }
//        System.out.println("Der " + count + " Māju numuri");
//
//
//
//
//
//    }

    //CIKLI

//    public static void whileCikls() {
//        int x = 5;
//
//        while (x >= 0) {
//            System.out.println("X nav nulle, X= " + x );
//            x = x - 1; // var aizstāt ar x--
//        }
//        int i = 10;
//        while (i<50){
//            System.out.println("i ir" + i);
//           i++; // tas pats = i = i + 1;
//        }
//
//        // masivi  + cikli
//        String[] cars = {"Volvo", "BMW", "Nissan", "Mercedes"};
//        System.out.println("Kods sākās: ");
//        int z =0;
//        while (z< cars.length){
//            System.out.println(cars[z]);
//            z = z+1; // ja + 2 tad izprintes 0 un 2;
//        }


        // uzdevums


            // ciparu ievadīšana
        Scanner ievade = new Scanner(System.in);
        System.out.println("Ievadi Skaitli:");
        int number = ievade.nextInt();
        int summa = 0;
        while (number>0){
            summa = summa + number;
            System.out.println("Ievadi skaitli ...");
            number = ievade.nextInt();
        }
        System.out.println("summa ir : " + summa);

        //jauns uzdevums

        String[] kartis = {"Pīķa dūzis", "Ercena kalps", "Kreiča dāma"};
        int a = 0;
        while (a< kartis.length){
            System.out.println(kartis[a]);

            a++;

        }



//
//    }
//
//// Cikls DO WHILE
//    public static void doWhileCikls(){
//    Scanner parolesIevade = new Scanner(System.in);
//
//
//        int q = 1;
//        do{
//            System.out.println("Test Test Test");
//            q++;
//        } while (q < 10);
//
//
//        String parole = "SuperSecretPassword123";// šī ir parole kas būs pareiza, tik tad kad ievadīsi izies no cikla
//        String ievaditaParole;
//        do{
//            System.out.println("Ievadi paroli:");
//            ievaditaParole = parolesIevade.nextLine();
//            System.out.println("Pārbaudām paroli");
//        } while (!ievaditaParole.equals(parole));
//    System.out.println("Pareiza parole");
//
//
//
//
//}


////CIKLS FOR
//public static void forCikls(){
//    Scanner izvadeFor = new Scanner(System.in);
//    String[] kartis2 = { "Dūzis", "Ercens", "Kreicis"};
//        for (int j = 0; j< kartis2.length; j++){
//
//            System.out.println(kartis2[j]);
//        }
//        // izpildīsies pāra skaitļi
//
//        for (int v = 0; v<=20; v++) {
//            if (v==6){break;} // izvadīs pēc6 bet nebūs braek jo apsājāss pie iepriekšejā skaitļa
//            System.out.println(v);
//        }
//
//
//
//        // FOR EACH cikls - katram masiva elementam:
//
//    long [] telefonaNumuri = {222222,333333,444444,555555,54678976};
//        //izitere cauri katram masivam foreach:
//
//
//
//    }
//





}



    //MASIVI
    public static void macamiesMasivus(){
        int [] monthlyCosts = {100,40,23,44,55,200};
        System.out.println("Janvārī iztērētā summa; " + monthlyCosts[0]);
        System.out.println("Februārī iztērētā summa; " + monthlyCosts[1]);
        System.out.println("Martā iztērētā summa; " + monthlyCosts[2]);
        System.out.println("Aprīlī iztērētā summa; " + monthlyCosts[3]);
        System.out.println("Maijā iztērētā summa; " + monthlyCosts[4]);
        System.out.println("Jūnijā iztērētā summa; " + monthlyCosts[5]);

        String [] produktuSaraksts = { "Piens", "Maize", "Olas"};

        System.out.println(produktuSaraksts[0]); // piens
        System.out.println(produktuSaraksts[1]); // maize

        //nomaina sarakstam 2 vertibu no olas uz desa
        produktuSaraksts[2] = "Desa";
        System.out.println(produktuSaraksts[2]);
        int[] menesiGada = new int [12];
        menesiGada[0] = 1;

        String [] cars = { "Volvo", "BMW", "VW"};
        System.out.println("Masiva garums ir: " + cars.length);
        cars[1]="Audi"; //aizstajam masiva Volvo uz Audi



        String [] studentuSaraksts = new String[23];
        studentuSaraksts [0]= "Jānis Bērziņš";
        studentuSaraksts [1]= "Anna Panna";
        studentuSaraksts [2]= "Egils Paegle";
        System.out.println( studentuSaraksts [0]);
        System.out.println( studentuSaraksts [1]);
        System.out.println( studentuSaraksts [2]);
        System.out.println( studentuSaraksts [3]);// null tukšs




    }




    public static int aprekinatTaisnsturaLaukumu(int platums, int garums){
        return platums * garums;





    }



    public static void printNewLine(){

        System.out.println("\n");

    }

    public static double avarege( double x, double y, double z){
        return x+y+z;
    };
    public static void manaMetode (){

        System.out.println(" @@@@@@@@@@@@");
        System.out.println(" Jolanta Beltiņa");
        System.out.println(" Jūrmala");
        System.out.println("Vecums: " + 50);
        System.out.println(" $$$$$$$$$$$$");
      // metode - metodē


    }
    public static void manaMetode2 ( String vards, String uzvards, String pilseta, int vecums) {

        System.out.println(" @@@@@@@@@@@@");
        System.out.println(vards + " " + uzvards);
        System.out.println(pilseta);
        System.out.println("Vecums: " + vecums);
        System.out.println(" $$$$$$$$$$$$");
    }





}
