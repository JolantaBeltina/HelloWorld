package lekcijaCetri.labDarbs;

public class Main {

    public static void main(String[] args) {
        String vards = "Jolanta";



        // ar māju tas pats, TAISAM jaunas mājas :
        House majaViens = new House(2,10,10,"Brīvības 1", 3.2,10000,true);

        House majaDivi= new House(2,10,10,"Brīvības 1", 3.2,10000,true);
        majaDivi.adrese="Upesgrīvas iela 99";
        majaDivi.durvjuSkaits=2;
        majaDivi.stavuDaudzums = 2;
        majaDivi.kadrestalaVertiba = 7000;
        majaDivi.vaiPrivatipasums=true;
        majaDivi.griestuAugstums=2.6;
        majaDivi.loguSakits=15;
        majaDivi.printHouse();

        // masīvs ar abām mājām

        House [] majas ={majaViens,majaDivi};
        for (House maja: majas) {
            maja.printHouse();
        }

        //

        Velosipeds ritenBraucejsViens = new Velosipeds();
        // izveido uzreiz 3 velosipedus ar Date
        for (int j = 0; j<3; j++){
            new Velosipeds();
        }


        Velosipeds ritenBraucejsDivi = new Velosipeds();

        // Konstruktors aragumentiem
        Velosipeds ritenisX= new Velosipeds("ZZK", 21, 100);

        ritenBraucejsViens.atrums = 40;
        ritenBraucejsDivi.atrums = 30;

        ritenBraucejsViens.printAtrums();
        ritenBraucejsDivi.printAtrums();

        Velosipeds ritenBraucejsTris = new Velosipeds();

        //sākotnējais ātrums
        ritenBraucejsTris.zimols = "ZZK ";
        ritenBraucejsTris.printAtrums();

        //paatrinajums +5
        ritenBraucejsTris.paatrinajums();
        ritenBraucejsTris.paatrinajums();
        ritenBraucejsTris.paatrinajums();
        ritenBraucejsTris.paatrinajums();
        // rezultāts paatrinājumam
        ritenBraucejsTris.printAtrums();
        System.out.println("Priekšā izskrien kaķis!");

        ritenBraucejsTris.bremzesana();
        ritenBraucejsTris.bremzesana();
        ritenBraucejsTris.bremzesana();
        ritenBraucejsTris.bremzesana();
        ritenBraucejsTris.bremzesana();
        ritenBraucejsTris.bremzesana();
        // rezultāts bremzēšsanai
        ritenBraucejsTris.printAtrums();

        Koks koks1 = new Koks();
        Koks koks2 = new Koks();


        koks1.kokaNosaukums = "Priede";
        koks1.augstums = 6;
        koks1.kurAug = "Pie Jūras ";
        koks1.vecums = 25;
        koks1.vaiIrdizkoks = true;

        koks2.kokaNosaukums = "Ozols";
        koks2.augstums = 12;
        koks2.kurAug = "Pļavā ";
        koks2.vecums = 10;
        koks2.vaiIrdizkoks = true;


        // kakis

        Kakis kakisTaisons = new Kakis();
        kakisTaisons.suga = "Bezšķirnes";
        kakisTaisons.gadi = 2;
        kakisTaisons.vards = "Taisons";
        kakisTaisons.vaiIzsalcis = true;
        kakisTaisons.printKakis();


        // Rinkis

        Rinkis rinkisViens = new Rinkis(5);
       
        System.out.println(rinkisViens.rekinatLaukumu());
        System.out.println(rinkisViens.rekinatLinijasGarumu());

        Rinkis rinkisDivi = new Rinkis(10);
        System.out.println(rinkisDivi.rekinatLaukumu());
        System.out.println(rinkisDivi.rekinatLinijasGarumu());

    int a = 5;
    int b = 10;
    Math.max(a,b);



    }
    }



