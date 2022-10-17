package lekcijaTris.majasDarbs;

import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {
        pirmaisUzdevums();
        otraisUzdevums();
        tresaisUzdevums();
        ceturtaisUzdevums();





    }

    public static void pirmaisUzdevums() {

        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadi skaitļus: ");

        number = scanner.nextInt();
        int summa=0;

        int [] ievaditieSkailti = new int[number];
        {

            while (summa<100){
                summa = summa + number;
                number = scanner.nextInt();
            }
            System.out.println("Gatavs!");
        }




    }

        public static void otraisUzdevums() {
        //1.WHILE

        int [] masivsInt = { 1,2,3,4,5,6,7,8,9,10};
            int s = 0;
            while (s< masivsInt.length){
                System.out.print(masivsInt[s]);
                s++;
            }

        //2.DO WHILE
        int q = 0;
        do{
            System.out.print(masivsInt[q]);
            q++;
        } while (q < masivsInt.length);

        //3.FOR Loop
          for (int i=0;i<10;i++){

              System.out.print(masivsInt[i]);
          }

        // 4. FOR Each
            for (int masivi:masivsInt) {
                System.out.print(masivi + "\n");
            }

            // Masīvs String

        String [] masivsString =  { "Pildspalva", "Zīmulis", "Lineāls"};

            // While

            int k=0;
            while (k<masivsString.length){
                System.out.println(masivsString[k]);
                k++;
            }

            // Do while


            int k2 = 0;
            do{
                System.out.println(masivsString[k2]);
                k2++;
            } while (k2< masivsString.length);

            // For Loop

            for (int k3=0;k3<3;k3++){

                System.out.println(masivsString[k3]);
            }

            // For Each
            for (String kanceleja:masivsString) {
                System.out.println(kanceleja);

            }



        char [] masivsChar = {'Ā','B','O','L','S' };

            //While
            int c=0;
            while (c< masivsChar.length){
                System.out.println(masivsChar[c]);
                c++;
            }

            // Do while
            int c2=0;
            do {
                System.out.println(masivsChar[c2]);
                c2++;

            } while (c2<masivsChar.length);

            // For Loop

            for (int c3=0;c3<masivsChar.length;c3++){

                System.out.println( masivsChar[c3]);
            }

            // For each

            for (char auglis:masivsChar) {
                System.out.print(auglis);

            }
        }



        public static void tresaisUzdevums(){

        int [] skaitluMasivs;
        skaitluMasivs = new int[100];

        int skailti =0;
        int paraSkaitli = 2;
         for (int skaitli = 0; skaitli<skaitluMasivs.length;skaitli++){


             System.out.print("Pāra skaitļi masīvā ir" + (skaitli));
             skaitluMasivs[skailti]=paraSkaitli;
             skaitli++;
             paraSkaitli = paraSkaitli +2;
         }


            }



            public static void ceturtaisUzdevums() {



                }














            }




























