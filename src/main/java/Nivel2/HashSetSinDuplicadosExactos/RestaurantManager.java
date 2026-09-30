package Nivel2.HashSetSinDuplicadosExactos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RestaurantManager {

    private Set<Restaurant> restaurants = new HashSet<>();

    public void addNewRestaurant(Restaurant r) {
        if (this.restaurants.contains(r)) {
            throw new IllegalArgumentException("ERROR: The Restaurant you tried to add is already in our system");
        } else {
        this.restaurants.add(r);
        }
    }

    public int count() {
        return restaurants.size();
    }

    public List<Restaurant> list() {
        return new ArrayList<>(restaurants);
    }

    public List<Restaurant> getSorted() {
        List<Restaurant> sorted = new ArrayList<>(restaurants);
        Collections.sort(sorted);
        return sorted;
    }


}


