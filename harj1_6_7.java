// Java-learning
// Anton Hussi :: 17TVDO02 :: 15DAPT232.01
// Created at 2019.01.11 :: Update at 2019.01.12
// Harjoitus 1-6 | Tulotasolaskuri
import java.util.regex.*;

public class harj1_6_7 {
  // Variables for class
  static String[] _errorMSG = {"Virhe: ", "Syötä ikä, kokonaislukuna", "Syötä palkka kokonaislukuna", "Tarkista syötteesi"};
  static String[] _msg = {"Rikas vanhus", "Köyhä rahjus", "Ei tällä ES-osteta", "Liian nuori tekemään töitä/jollei pappa maksa", "Eläkkeellä", "Perusduunari"};
  // Currently working for validation
  private static boolean containNumbersOnly(String source, boolean args) {
    boolean result = false;
    if((boolean)args) {
      Pattern pattern = Pattern.compile("[0-9]+"); //correct pattern for both float and integer.
      pattern = Pattern.compile("\\d+"); //correct pattern for both float and integer.
      result = pattern.matcher(source).matches();
    } else {
      Pattern pattern = Pattern.compile("[0-9]+.[0-9]+"); //correct pattern for both float and integer.
      pattern = Pattern.compile("\\d+.\\d+"); //correct pattern for both float and integer.
      result = pattern.matcher(source).matches();
    }
    if(result){ return true; } else { return false; }
  }
  // Actual main program
  public static void main(String[] args) {
    // Printing out first lines/statement of proggram
    System.out.println(":: Tulotasolaskuri");
    // Asking user input for Age
    System.out.print("Syötä hakijan ikä: " + "\t");
    String _UIage = Reader.readString();
    if((boolean)containNumbersOnly(_UIage, true)) {
      // Asking user input for Monthly wage and continues
      System.out.print("Syötä kuukausipalkka: " + "\t");
      String _UImonthlypay = Reader.readString();
      if((boolean)containNumbersOnly(_UImonthlypay, false)) {
        int _age = Integer.parseInt(_UIage);
        int _monthly = Integer.parseInt(_UImonthlypay);
        String _result = "";
        // Printing out type of value, if it's a possive, negative or null-value
        if((_age > 40) && (_age < 65) && (_monthly > 20000)) {
        _result = _msg[0];
        } else if ((_age > 40) && (_monthly <= 20000)) {
          _result = _msg[1];
        } else if ((_age > 15) && (_age < 25) && (_monthly <= 10000)) {
          _result = _msg[2];
        } else if ((_age < 15)) {
          _result = _msg[3];
        } else if ((_age > 65)) {
          _result = _msg[4];
        } else {
          _result = _msg[5];
        }
        System.out.println(System.lineSeparator() + _result);
      } else {
        System.out.println(System.lineSeparator() + _errorMSG[0] + _errorMSG[2]);
      }
    } else {
      System.out.println(System.lineSeparator() + _errorMSG[0] + _errorMSG[1]);
    }
  }
}
