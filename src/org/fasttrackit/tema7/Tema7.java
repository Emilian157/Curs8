package org.fasttrackit.tema7;

public class Tema7 {
    public static void main(String[] args) {
        Person persana1 = new Person("George",21, false);
        System.out.println(persana1.toString());
        Person persana2 = new Person("Georgiana",40, true);
        System.out.println(persana2.toString());

        System.out.println("-------------------------------------------------");

        Product cola = new Product("Coca Cola", 9.99D, 100, "suc");
        Product pepsi = new Product("Pepsi", 9.49D, 100, "suc");
        Product salamSasesc = new Product("Salam Sasesc", 30D, 44, "mezeluri");
        Product salamSibiu = new Product("Salam Sibiu", 90D, 0, "mezeluri");
        System.out.println(cola.hasStock());
        System.out.println(pepsi.hasStock());
        System.out.println(salamSasesc.hasStock());
        System.out.println(salamSibiu.hasStock());
        System.out.println(cola.isCategory("suc"));
        System.out.println(cola.isCategory(new String("suc")));
        System.out.println(cola.isCategory("mezeluri"));

        System.out.println("-------------------------------------------------");

        Bottle water  = new Bottle(500,400,false);
        System.out.println("Empty capacity: " + water.getEmptyCapacity());
        water.drinkAmount(100);
        water.openBottle();
        water.drinkAmount(100);
        water.closeBottle();
        water.drinkAmount(500);
        water.openBottle();
        water.drinkAmount(500);
        water.drinkAmount(100);
        water.drinkAmount(100);
        water.drinkAmount(100);

        System.out.println("----BOTTLE SHOULD BE EMPTY----");

        water.drinkAmount(100);
    }
}
