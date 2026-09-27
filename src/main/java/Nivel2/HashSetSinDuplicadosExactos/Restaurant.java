package Nivel2.HashSetSinDuplicadosExactos;

import java.util.Objects;

public class Restaurant  {

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
                "nom='" + name + '\'' +
                ", puntuacio=" + rating +
                '}';
    }
}
