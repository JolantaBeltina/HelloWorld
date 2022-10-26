package lekcijaPieci.majasDarbs;

import lekcijaPieci.labDarbs.House;

public class Main {
    public static void main(String[] args) {

        Cilindrs cilindrs2 = new Cilindrs(90,85);
        System.out.println("Cilindrs 1:");

        cilindrs2.printCilindrs();

        System.out.println("Cilindra 1 Virsmas laukums ir : " + cilindrs2.getSurFaceArea());
        System.out.println("Cilindra 1 Virsmas tilpums ir : " + cilindrs2.getVolume());

        System.out.println("*******************************************");

        Cilindrs cilindrs = new Cilindrs();
        System.out.println("Cilindrs 2: ");


        cilindrs.setHeight(55);
        System.out.println("Cilindra augstums:" + cilindrs.getHeight());

        cilindrs.setRadius(16);
        System.out.println("Cilindra radiuss: " + cilindrs.getRadius());

        System.out.println("Cilindra Virsmas laukums ir: " + cilindrs.getSurFaceArea());
        System.out.println("Cilindra tilpums ir : " + cilindrs.getVolume());









    }
}
