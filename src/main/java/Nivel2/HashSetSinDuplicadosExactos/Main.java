package Nivel2.HashSetSinDuplicadosExactos;

public class Main {
    static void main(String[] args) {

    RestaurantManager manager = new RestaurantManager();

    Restaurant r1 = new Restaurant("El Changarrito",8);
    Restaurant r2 = new Restaurant("Osaka",7);
    Restaurant r3 = new Restaurant("Osaka",8);
    Restaurant r4 = new Restaurant("Tlaxcal", 9);
    Restaurant r5 = new Restaurant("El Changarrito",8);

    manager.add(r1);
    manager.add(r2);
    manager.add(r3);
    manager.add(r4);

        System.out.println("Total: " + manager.count());
        System.out.println(manager.list());


    }
}
