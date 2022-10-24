package lekcijaPieci.labDarbs;

public class Main {
    public static void main(String[] args) {
        Cat muris = new Cat();
        Dog reksis = new Dog();
        Cow govs = new Cow();
        Fish zivs = new Fish();

        muris.age=3;
        muris.canClimbTrees = true;
        reksis.age=4;
        reksis.canClimbTrees= false;

        muris.breathe();
        reksis.breathe();
        govs.breathe();
        zivs.breathe();


        muris.makeSound();
        reksis.makeSound();
        govs.makeSound();

        muris.eat();
        reksis.eat();;

        muris.naguAsinasana();
        reksis.growl();

        muris.printClimbing();

        House house = new House(1,2,3,"Brīvības", 2.5,100000L,true);

        house.printHouse();
        house.setKadrestalaVertiba(30000L);
        house.setAdrese("Raiņa iela.");
        System.out.println("Mājas adrese ir:" + house.getAdrese());


        System.out.println(Calculator.add(5,10));
        System.out.println(Calculator.add(5.3,10.4));
        System.out.println(Calculator.add(5,8,9));


    }
}
