package Nivel2.HashSetSinDuplicadosExactos;

import java.util.Objects;

public class Restaurant implements Comparable<Restaurant> {
    private String name;
    private int rating;

    public Restaurant(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant other = (Restaurant) o;
        return rating == other.rating && Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rating);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }

    @Override
    public int compareTo(Restaurant o) {
        int nameComparison = this.name.compareTo(o.name);
        if (nameComparison != 0) {
            return nameComparison;
        }
        return Integer.compare(o.rating, this.rating);
    }

}

