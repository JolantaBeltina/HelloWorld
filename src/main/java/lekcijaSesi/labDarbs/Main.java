package lekcijaSesi.labDarbs;

import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
        Faker faker = new Faker();
        String vards = faker.name().firstName();
        System.out.println("Mani sauc " + vards);
        System.out.println(faker.shakespeare().hamletQuote());
        System.out.println(faker.address().streetName());
        for (int i = 0; i <3; i++){
            System.out.println("Cat name" + faker.cat().name());
        }
        // Adresi, telefona numurs, epasts, uzvards, vienu pec brivas izveles
        System.out.println("Adrese: " + faker.address().streetName() + " Pilsēta: "  + faker.address().cityName());
        System.out.println("Telefona numurs: " + faker.phoneNumber().phoneNumber());
        System.out.println("E-pasts: " + faker.internet().emailAddress());
        System.out.println("Uzvārds: " + faker.name().lastName());
        System.out.println(faker.chuckNorris().fact());



    }

}
