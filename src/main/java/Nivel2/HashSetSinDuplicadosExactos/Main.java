package Nivel2.HashSetSinDuplicadosExactos;

public class Main {
    static void main(String[] args) {

        RestaurantManager manager = new RestaurantManager();

        Restaurant r1 = new Restaurant("El Changarrito", 8);
        Restaurant r2 = new Restaurant("Osaka", 7);
        Restaurant r3 = new Restaurant("Osaka", 8);
        Restaurant r4 = new Restaurant("Tlaxcal", 9);
        Restaurant r5 = new Restaurant("El Changarrito", 8);

        manager.addNewRestaurant(r1);
        manager.addNewRestaurant(r2);
        manager.addNewRestaurant(r3);
        manager.addNewRestaurant(r4);

        try {
            manager.addNewRestaurant(r5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Total: " + manager.count());
        System.out.println(manager.list());
        System.out.println("Ordered Restaurant List:");
        System.out.println(manager.getSorted());

    }
}
