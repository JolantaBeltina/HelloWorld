package lekcijaViens.labDarbs;

public class Main {
    public static void main(String[] args) {
// int=integer, satur veselu skaitli!
int vecums = 34;
int temperatura = -10;
        System.out.println( "Ziemā janvārī ārā būs grādi:" + temperatura);
        System.out.println("Mans vecums ir:" + vecums
        );
     int garums =168;
        System.out.println("Mans garums ir:" + garums
        );
     int kurpjuIzmers=40;
        System.out.println("Mans kurpju izmērs ir:" + kurpjuIzmers
        );
     int darbaStazs = 10;
        System.out.println("Mans darba stāžs ir:" + darbaStazs
        );
     int svars = 60;
        System.out.println("Mans svars ir:" + svars
        );
        String sunaVards = "Reksis";
        String teksts = "Suņa vārds ir:";

        System.out.println(teksts + sunaVards);
// maksimālā integer vērtība;
        int population = 180000000;
        int maxInt = 214748364;
       //pieņem veselu skatilino -127 līdz +127
        byte vecumsDivi = 99;
        System.out.println(vecumsDivi);
        short latvijasMazpilseta = 17000;
        System.out.println(latvijasMazpilseta);
        long zivisOkeana = 21474836499L;
        System.out.println("Zivis okeānā ir:" + zivisOkeana);

        float apavuIzmers = 40.5F;
        System.out.println("Apavu izmērs:" + apavuIzmers);
        //Šodien ir sestdiena, veikals ir atvērts
        boolean isOpen = true;

        //Turpretīm skolas ir slēgtas
        boolean isClose = false;
        System.out.println("Vai veikals ir atvērts?" + isClose);
        boolean isLeapYear = true;
        boolean isFebruaris = false;
        char valuta = '$';
        char dzimums = 'V';
        System.out.println("tests" + valuta + dzimums );
        int summa;
        int a = 5;
        int b = 10;
        summa = a +b ;
        System.out.println(summa);
        summa = a +a;
        System.out.println(summa);
        int x = 10;
        int y = -45;
        int rezultats = x+y;
        System.out.println("Rezultāts ir :" + rezultats);
        rezultats = x-y;
        System.out.println("Rezultāts ir :" + rezultats);
    rezultats = x*y;
        System.out.println("Rezultāts ir :" + rezultats);
        rezultats = 10/2;
        System.out.println("Rezultāts ir :" + rezultats);

        // dalīšana un izprintē ārā atlikumu;
        rezultats = 11%2;
        System.out.println("Rezultāts ir :" + rezultats);
        rezultats = 5*(3+7);
        System.out.println("Rezultāts ir :" + rezultats);



        String koks = "Ozols";
        int vecumsGados = 25;
        boolean isdDizosols = true;
        boolean navDizozols = false;
        double augstums = 3.5;
        float platums = 1.3F;
        System.out.println( koks + " ir audzis pļavā " + vecumsGados + "gadus." +
                " Ir sasniedzis: " + augstums  + " un platumu  " + platums + " Vai tas ir dižosols?" + isdDizosols);

    }



}
