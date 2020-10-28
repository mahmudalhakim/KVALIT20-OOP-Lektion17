import java.time.Period;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-10-28
 * Time: 10:52
 * Project: KVALIT20-OOP-Lektion17
 * Copyright: MIT
 */
public class CarDemo {

  public static void main(String[] args) {

    // En instans av klassen Car
    Car c1 = new Car();

    System.out.println(
        c1.modelName + " ägs av " + c1.owner);
        // null ägs av null (Ej Smart)

    c1.modelName = "Volvo";
    System.out.println(
        c1.modelName + " ägs av " + c1.owner);
        // Volvo ägs av null

    // Vi ska sälja bilen
    Person p1 = new Person();
    p1.firstName = "Mahmud";
    p1.lastName  = "Al Hakim";

    Person p2 = new Person();
    p2.firstName = "Yasmin";
    p2.lastName = "Al Hakim";

    // Viktigt:
    // Koppla en person till en bil
    c1.owner = p2;

    System.out.println(
        c1.modelName + " ägs av " +
           c1.owner );
    // Volvo ägs av Person@3af49f1c

    System.out.println(
        c1.modelName + " ägs av " +
          Person.getName(c1.owner) );
    // Volvo ägs av Yasmin Al Hakim

    // Byt ägare
    Person p3 = new Person();
    p3.firstName = "Test";
    p3.lastName = "Testson";

    // Data
    // Bilen har en referens som heter c1
    // Köparen har en referens som heter p3
    c1.owner = p3;

    System.out.println("Bilen ägs nu av "
            + c1.owner );
    // Bilen ägs nu av Person@13221655

    System.out.println("Bilen ägs nu av "
        + Person.getName(c1.owner));
    // Bilen ägs nu av Test Testson

    // Övning
    // Skriv ut ägarens förnamn (ej hela namnet)


    // Utdata:
    // Bilen ägs av Test

  }
}
