// Java-learning
// Anton Hussi :: 17TVDO02 :: 15DAPT232.01
// Created at 2019.01.11 :: Update at 2019.01.12
// Harjoitus 1-3 | Bensaa suonissa
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
// import java.util.Arrays;
import java.util.regex.*;

public class harj1_3 {
  // Variables for class
  static String[] _errorMSG = {"Virhe: ", "Annappas decimaaleina", "", "Tarkista syötteesi"};
  private static DecimalFormat _round = new DecimalFormat("#.##");
  private static DecimalFormatSymbols _decimal = new DecimalFormatSymbols();

  // Currently working
  private static boolean containNumbersOnly(String source) {
    boolean result = false;
    Pattern pattern = Pattern.compile("[0-9]+.[0-9]+"); //correct pattern for both float and integer.
    pattern = Pattern.compile("\\d+.\\d+"); //correct pattern for both float and integer.

    result = pattern.matcher(source).matches();
    if(result){ return true; } else { return false; }
  }

  // Actual main program
  public static void main(String[] args) {
    // Printing first line and statement purpose of program
    System.out.println(":: Naftalaskuri, 0.1B");
    // Asking user input for a couple parameters
    System.out.println("Pekan rahat oli tiukissa, kun Elina tahtoi rahaa Moskovan torille ja naftaa pitäisi ostaa Ladaan.");
    System.out.print("päivän bensanhinta Eur/Litra (syötä desimaaleina): " + "\t");
    String _GASpricx = Reader.readString();
    // Checking answer has digits or purely by strings.. exceptions are made
    if((boolean)containNumbersOnly(_GASpricx)) {
      // Converting of string value to double
      double _GASprice = new Double(_GASpricx);
      System.out.print("Päivän lompakon sisältö (syötä desimaaleina): " + "\t");
      String _GASwallex = Reader.readString();
      System.out.println("\r");
      // Another checking if input is containing decimals or string
      if((boolean)containNumbersOnly(_GASwallex)) {
        // Converting of string value to double
        double _GASwallet = new Double(_GASwallex);
        // Printing out answer based on amount of money and divede by price of Gas
        double _GASfinal = _GASwallet / _GASprice;
        System.out.println("Pekka saa " + _round.format(_GASwallet) + " Eurolla, about " + _round.format(_GASfinal) + " litraa naftaa Ladaansa");
      } else {
        System.out.println(_errorMSG[0] + _errorMSG[1]);
      }
    } else {
       System.out.println(_errorMSG[0] + _errorMSG[1]);
    }
  }
}
