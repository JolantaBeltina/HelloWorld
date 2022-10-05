package lekcijaViens.majasDarbs;

public class FirstClass {
    public static void main(String[] args) {
        String ValstsNosaukums = "Puertoriko";
        long iedzivotajuSkaits = 3474182L;
        int ValstsPlatiba = 	9104;
        String Galvaspilseta = "Sanhuana";
        String ValstsValoda1 = "Spāņu valoda";
        String ValstsValoda2 = "Angļu valoda";
        boolean irUSA = true;
        boolean navEU = false;
        char valuta = '$';
        float AtlantijasOkeans = 329.7F;

        System.out.println( ValstsNosaukums +   " valsts platība ir:"+ ValstsPlatiba + "km2;");
        System.out.println(ValstsNosaukums + " galvaspilsētas nosaukums ir "+ Galvaspilseta  + ";");
        System.out.println(ValstsNosaukums + " valsts valodas ir : "+ ValstsValoda1 + " un " + ValstsValoda2 + ";");
        System.out.println("Vai " + ValstsNosaukums +  " ir EU? - " + navEU +";");
        System.out.println("Vai " + ValstsNosaukums +  " ir ASV? - " + irUSA + ";");
        System.out.println( ValstsNosaukums +   " valsts valūta ir: "+ valuta + " ASV dolārs.");
        System.out.println( ValstsNosaukums +   " ziemeļus apskalo Atlantijas okeāns "+ AtlantijasOkeans + " miljoni km3. ");

        System.out.println( ValstsNosaukums + " oficiāli Puertoriko Asociētā Valsts ir ASV valdījums Vestindijā."
                + ValstsPlatiba +
                " km2 platība - Aizņem Puertoriko salu (8674 km²), kā arī Vjekesu (134 km²), Monu (54 km²), Kulebru (28 km²) un citas mazākas salas. "
                + Galvaspilseta + " pilsētu dibināja spāņu kolonizatori 1521. gadā. Puertoriko galvaspilsēta ir otra vecākā eiropiešu " +
                "dibinātā pilsēta Amerikā aiz Dominikānas galvaspilsētas Santodomingo."
                + ValstsValoda1 + " un " + ValstsValoda2 +
                " ir bieži sastopama vietējo sarunvalodās. "
                + valuta + "  - ASV dolārs (valūtas kods USD) ir ASV valūta. To vēl bieži saīsina " +
                "kā dolāra zīmi $ vai kā US$, lai atšķirtu no citu valstu valūtām, ko arī sauc par dolāriem." );


        System.out.println( "Uzdevums Nr. 2 - piemēri uz katru aritmētisko operatoru:");

        int x = 1550;
        int y = 55;
        int rezultats = x+y;
        System.out.println("Rezultāts 1. ir :" + rezultats);
        rezultats = x-y;
        System.out.println("Rezultāts 2. ir :" + rezultats);
        rezultats = x*y;
        System.out.println("Rezultāts 3. ir :" + rezultats);
        rezultats = x/y;
        System.out.println("Rezultāts 4. ir :" + rezultats);
        rezultats = x*(y-50);
        System.out.println("Rezultāts 5. ir :" + rezultats);
        rezultats = (y-50)+(x*100);
        System.out.println("Rezultāts 6. ir :" + rezultats);




    }
}
