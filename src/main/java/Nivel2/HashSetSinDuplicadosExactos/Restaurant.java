package Nivel2.HashSetSinDuplicadosExactos;

import java.util.Objects;

public class Restaurant  {

private String nom;
private int puntuacio;

public Restaurant(String nom, int puntuacio) {
    this.nom = nom;
    this.puntuacio = puntuacio;
    }

public String getNom() {
    return nom;
    }

public int getPuntuacio() {
    return puntuacio;
    }

    @Override
public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Restaurant other = (Restaurant) o;
    return puntuacio == other.puntuacio && Objects.equals(nom, other.nom);
    }

    @Override
public int hashCode() {
    return Objects.hash(nom, puntuacio);
    }
}
