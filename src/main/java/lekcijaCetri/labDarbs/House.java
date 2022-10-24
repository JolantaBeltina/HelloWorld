package lekcijaCetri.labDarbs;

public class House {
    public House(int stavuDaudzums, int loguSakits, int durvjuSkaits, String adrese, double griestuAugstums, long kadrestalaVertiba, boolean vaiPrivatipasums) {
        this.stavuDaudzums = stavuDaudzums;
        this.loguSakits = loguSakits;
        this.durvjuSkaits = durvjuSkaits;
        this.adrese = adrese;
        this.griestuAugstums = griestuAugstums;
        this.kadrestalaVertiba = kadrestalaVertiba;
        this.vaiPrivatipasums = vaiPrivatipasums;
    }

    int stavuDaudzums;
    int loguSakits;
    int durvjuSkaits;
    String adrese;
    double griestuAugstums;
    long kadrestalaVertiba;
    boolean vaiPrivatipasums;

    // metode atgriež vērtības - konkatinācija!
    public void printHouse() {
        System.out.println("Stāvu daudzums:  " + stavuDaudzums + "\n Logu skaits: " + loguSakits
                + "\n Durvju skaits: " + durvjuSkaits + " \n Adrese: " + adrese + "\n Griestu augstums:" + griestuAugstums
                + " \n Kadastrālā vērtība:  " + kadrestalaVertiba + "\n Vai ir privātīpašums: " + vaiPrivatipasums);
    }
}
