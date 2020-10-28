import java.time.Period;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-10-28
 * Time: 09:33  
 * Project: KVALIT20-OOP-Lektion17
 * Copyright: MIT
 */
 public class PersonDemo {

 public static void main(String[] args) {

  // Skapa instanser av klassen Person
  Person p1; // p1 är en referensvariabel
  p1 = new Person(); // ett objekt skapas

  // Skriv ut objektet
  System.out.println(p1); // Hash-kod  Person@23fc625e
  System.out.println(p1.firstName);  // null
  System.out.println(p1.lastName);  // null
  System.out.println(p1.dateOfBirth); // null
  System.out.println(p1.height); // 0.0
  System.out.println(p1.weight); // 0.0

  // Ändra namnet
  p1.firstName = "Mahmud";
  p1.lastName = "Al Hakim";

  // Skriv ut hela namnet m.h.a. en metod
  String name = Person.getName(p1);
  System.out.println(name);

  System.out.println(Person.getName(p1));

  // Arbeta med ålder
  p1.dateOfBirth = "1973-02-02";
  Person.getAge(p1);
  System.out.println("Ålder: " + Person.getAge(p1) + " år");

  // Arbeta med BMI
  double BMI = Person.getBMI(p1);
  System.out.println(BMI); // NaN = Not A Number
  p1.height = 1.70; // m
  p1.weight = 85; // Kg
  System.out.printf("BMI: %.2f \n" , Person.getBMI(p1));

  // Visa viktklassen
  String viktklass = Person.getBMICategory(p1);
  System.out.println("Viktklass: " + viktklass);

 }
}
