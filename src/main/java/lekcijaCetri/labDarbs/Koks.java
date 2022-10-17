package lekcijaCetri.labDarbs;

public class Koks {

    String kokaNosaukums;
    String  kurAug;
    Boolean vaiIrdizkoks;
    int augstums;
    int vecums;

    public void printKokanosaukums(){
        System.out.println(kokaNosaukums);

    }

    public void printVecums (){
        System.out.println(vecums);
        if(vecums>=15) {
            System.out.println("Ir dižkoks!");
        } else {System.out.println("Nav");

        }
    }
    public void printKuraug (){
        System.out.println(kurAug);
    }
    public void printVaiIrDizkoks (){
        System.out.println(vaiIrdizkoks);
        }
    }

