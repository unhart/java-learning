// Java-learning
// Anton Hussi :: 17TVDO02 :: 15DAPT232.01
// Created at 2019.01.11 :: Update at 2019.01.12
// Harjoitus 1-4 | Ehtorakenne
import java.util.regex.*;

public class harj1_4 {
  // Variables for class
  static String[] _errorMSG = {"Virhe: ", "Annappas kokonaislukuna", "", "Tarkista syötteesi"};
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
    System.out.println(":: Kokonaisluku bs-laskuri");
    // Asking user input
    System.out.print("Syötä kokonaisluku: " + "\t");
    String _valux = Reader.readString();
    String _result = "";
    if((boolean)containNumbersOnly(_valux)) {
      int _value = Integer.parseInt(_valux);
      if(_value < 0) {_result = _valueMSG[0];
      } else if(_value == 0) {_result = _valueMSG[1];
      } else { _result = _valueMSG[2]; }
      // Printing out type of value, if it's a possive, negative or null-value
      System.out.println(System.lineSeparator() + "Syötetty luku on " + _result);
    } else {
      System.out.println(System.lineSeparator() + _errorMSG[0] + _errorMSG[1]);
    }
  }
}
