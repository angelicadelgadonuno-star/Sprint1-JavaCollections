package Nivel2.HashSetSinDuplicadosExactos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RestaurantManager {

private Set<Restaurant> restaurants = new HashSet<>();

public void add(Restaurant r) {
    restaurants.add(r);
}
public int count() {
    return restaurants.size();
}
public List<Restaurant> list () {
    return new ArrayList<>(restaurants);
}



}


