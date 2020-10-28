import java.util.Calendar;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-10-28
 * Time: 09:14  
 * Project: KVALIT20-OOP-Lektion17
 * Copyright: MIT
 */
 public class Person {

  // Instansvariabler / Fält (Field) / Egenskaper / Attribut
 String firstName;
 String lastName;
 String dateOfBirth; // YYYY-MM-DD
 double height; // meter
 double weight; // kg

 // Metoder / Operationer / Funktioner

 /**
 * En klassmetod om returnerar hela namnet
 * @param p är en instans av klassen person
 * @return namnet (förnamn + efternamn)
  ***/
 public static String getName(Person p){
  return p.firstName + " " + p.lastName;
 }

 /**
  * getAge är en klassmetod som beräknar ålder
  * @param p är en referens till ett objekt av typen Person
  * @return ålder
  */
 public static int getAge(Person p){

  String calendar = Calendar.getInstance().getTime().toString();
  String thisYearString = calendar.substring(calendar.lastIndexOf(' ')+1);
  int thisYear = Integer.parseInt(thisYearString);

  String yearString = p.dateOfBirth.substring(0,4);
  int year = Integer.parseInt(yearString);

  int age = thisYear - year;
  return  age;

 }

 /**
  * En klassmetod som beräknar kroppsmassindex
  * @param p är en referensvariabel av typer Person
  * @return BMI
  */
 public static double getBMI(Person p){
  // BMI = Vikt / (Längd * Längd)
  return p.weight / (p.height * p.height);
 }

 /**
  * En klassmetod som returnerar viktklassen
  * @param p är en person
  * @return viktklassen
  */
 public static String getBMICategory(Person p){

  double BMI = Person.getBMI(p);

  String category;

  if(BMI < 18.5)
   category = "Undervikt";
  else if (BMI <= 25)
   category = "Normalvikt";
  else
   category = "Övervikt";

  return category;
 }

}
