package lekcijaCetri.labDarbs;

import java.util.Date;

public class Velosipeds {

    String zimols;
    int ramjaIzmers;
    int atrums = 0;

    Date izgatavosansDatums;

    // konstrUktors tiek izsaukt ja nekas netiek padots

    Velosipeds(){
        System.out.println("Taisām jaunu Velo!");
        izgatavosansDatums = new Date();
        System.out.println("Izgatavošanas datums: " + izgatavosansDatums);
    }

    // Paramatrizets konstruktos this panemsim noaugsas un ieliksim no ramja

    Velosipeds(String zimols, int ramjaIzmers, int atrums){
        izgatavosansDatums = new Date();
        this.zimols = zimols;
        this.ramjaIzmers = ramjaIzmers;
        this.atrums = atrums;

    }



    public void printAtrums(){
        System.out.println(atrums);
    }

    public void paatrinajums(){
        System.out.println(zimols + "Velo paatrinas");
        atrums = atrums+5;
    }

    public void bremzesana(){

        if(atrums>=5) {
            System.out.println(zimols + "Velo Bremze");
            atrums = atrums - 5;
        } else {System.out.println("Beidz bremzēt! Tu jau stāvi!");

        }
    }



}

