# Sprint 1 – Java Collections

This is a Java project about **collections**. I practised `ArrayList`, `HashSet`, `HashMap` and `ListIterator`. I also practised reading and writing files, and sorting objects.

The task has two levels. I did **all the exercises** of Level 1 and Level 2.

## What I practised

- Adding, changing and reading elements in an `ArrayList`.
- Working with duplicates in a `HashSet`.
- Going through collections with a `for` loop and an `Iterator`.
- Using a `ListIterator` to go through a list backwards.
- Storing data in a `HashMap`.
- Reading and writing text files.
- Writing `equals()` and `hashCode()` to control duplicates.
- Sorting objects with `Comparable`.
- Splitting the code into small classes and methods.

## Requirements

- Java 26 (set in `pom.xml`)
- IntelliJ IDEA
- Maven (optional)

## Project structure

```
Sprint1-JavaCollections
├── countries.txt          (data for the Capital Game)
├── classificacio.txt      (scores saved by the Capital Game)
├── pom.xml
└── src/main/java
    ├── Nivel1
    │   ├── Duplicats
    │   │   ├── Main.java
    │   │   └── Month.java
    │   ├── ListIterator
    │   │   ├── ListReverser.java
    │   │   └── Main.java
    │   └── CapitalGame
    │       ├── CitiesAndCapitals.java
    │       ├── DocsManagement.java
    │       └── Main.java
    └── Nivel2
        └── HashSetSinDuplicadosExactos
            ├── Restaurant.java
            ├── RestaurantManager.java
            └── Main.java
```
## Level 1

### Exercise 1 – Duplicates

**Classes**

- **`Month`**: a month with a `name`. It has `equals()`, `hashCode()` and `toString()`.
- **`Main`**: runs the exercise.

**What the program does**

1. Creates an `ArrayList<Month>` with 11 months. "August" is missing.
2. Adds "August" in position 7, so the order is correct.
3. Copies the list into a `HashSet` and tries to add "January" again. The `add()` method returns `false` and the size does not change. So the `HashSet` does not accept duplicates.
4. Prints the months with a `for` loop and with an `Iterator`.

> A `HashSet` does not keep the order of the elements. The months can appear in a different order.

### Exercise 2 – ListIterator

**Classes**

- **`ListReverser`**: has the method `listBackWards()`. It uses a `ListIterator` that starts at the end of the list. It goes back with `hasPrevious()` and `previous()`, and adds each number to a new list.
- **`Main`**: creates the first list and prints both lists.

**Example output**

```
First List [56, 25, 44, 78]
Second List[78, 44, 25, 56]
```

### Exercise 3 – Capital Game

**Classes**

- **`DocsManagement`**: reads a file line by line and writes a line at the end of a file.
- **`CitiesAndCapitals`**: has the game logic.
- **`Main`**: starts the game.

**How the game works**

1. It reads `countries.txt` and saves each country and its capital in a `HashMap<String, String>`.
2. It asks for the name of the user.
3. It chooses 10 different random countries (with `Collections.shuffle`).
4. For each country, the user writes the capital. The answer can be in uppercase or lowercase.
5. At the end, it shows the score, for example `angie, your score is: 9/10`.
6. It saves the name and the score in `classificacio.txt`, for example `angie,9`. Each new game adds a new line.

---

## Level 2

### Exercise 1 – HashSet without exact duplicates

**Classes**

- **`Restaurant`**: has a `name` and a `rating`. It has `equals()` and `hashCode()` that use **both** fields.
- **`RestaurantManager`**: keeps the restaurants in a `HashSet`.
- **`Main`**: tests the program.

Two restaurants with the same name and the same rating are duplicates, and the `HashSet` does not add them. Two restaurants with the same name but a different rating are different, and both are added.

**Example**

```
Total: 4
```

The test adds 5 restaurants. One is an exact duplicate ("El Changarrito", 8), so the total is 4.

### Exercise 2 – Multiple sorting

`Restaurant` implements `Comparable<Restaurant>`. The method `compareTo()` sorts:

1. By **name**, in alphabetical order.
2. If the names are equal, by **rating**, from highest to lowest.

The method `getSorted()` in `RestaurantManager` returns a sorted list with `Collections.sort()`.

**Example of order**

```
Restaurant{name='El Changarrito', rating=8}
Restaurant{name='Osaka', rating=8}
Restaurant{name='Osaka', rating=7}
Restaurant{name='Tlaxcal', rating=9}
```

---

## Notes

- The exercise says `countries.txt` uses commas, but my file separates the country and the capital with a **space**. The code splits each line by spaces.
- In `countries.txt`, names with more than one word use `_` (for example `Andorra_la_Vella`). The game changes `_` to a space before it checks the answer.
- The package names are in Spanish/Catalan (`Nivel1`, `Duplicats`), but the code is in English.
- `org/example/Main.java` is the default IntelliJ file. It is not part of the exercises.