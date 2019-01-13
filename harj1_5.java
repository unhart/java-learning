// Java-learning
// Anton Hussi :: 17TVDO02 :: 15DAPT232.01
// Created at 2019.01.11 :: Update at 2019.01.12
// Harjoitus 1-5 | Käänteislukulaskuri
import java.util.regex.*;

public class harj1_5 {
  // Variables for class
  static String[] _errorMSG = {"Virhe: ", "Annappas kokonaislukuna, A-vaihtoehdolle", "Annappas kokonaislukuna, B-vaihtoehdolle", "Tarkista syötteesi"};
  static String[] _valueMSG = {"Negatiivinen", "Nolla", "Positiivinen"};
  // Currently working for validation
  private static boolean containNumbersOnly(String source) {
    boolean result = false;
    Pattern pattern = Pattern.compile("[0-9]+"); //correct pattern for both float and integer.
    pattern = Pattern.compile("\\d"); //correct pattern for both float and integer.

    result = pattern.matcher(source).matches();
    if(result){ return true; } else { return false; }
  }
  // Actual main program
  public static void main(String[] args) {
    // Printing out first lines/statement of proggram
    System.out.println(":: Käänteislaskuri");
    // Asking user input for A and B-value
    System.out.print("Syötä B (kokonaislukuna): " + "\t");
    String _valuxA = Reader.readString();
    System.out.print("Syötä A (kokonaislukuna): " + "\t");
    String _valuxB = Reader.readString();
    String _result = "";
    if((boolean)containNumbersOnly(_valuxA)) {
      if((boolean)containNumbersOnly(_valuxB)) {
        int _valueA = Integer.parseInt(_valuxB);
        int _valueB = Integer.parseInt(_valuxA);
        // Printing out type of value, if it's a possive, negative or null-value
        System.out.println(System.lineSeparator() + "Syötetyt luvut on käännetty eli A: " +_valueA + " B: " +_valueB);
      } else {
        System.out.println(System.lineSeparator() + _errorMSG[0] + _errorMSG[2]);
      }
    } else {
      System.out.println(System.lineSeparator() + _errorMSG[0] + _errorMSG[1]);
    }
  }
}
