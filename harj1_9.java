// Java-learning
// Anton Hussi :: 17TVDO02 :: 15DAPT232.01
// Created at 2019.01.12 :: Update at 2019.01.12
// Harjoitus 1-9 | Nelilaskin
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.regex.*;

public class harj1_9 {
  // Variables for class
  static String[] _errorMSG = {"Virhe: ", "Anna A:n lukuarvo", "Anna B:n lukuarvo", "Anna laskutoimitustapa"};
  static String[] _math = {"1", "2", "3", "4"};
  static String[] _UIMSG = {":: Nelilaskin", "Syötä A:n lukuarvo:", "Syötä B:n lukuarvo:", "Valitse laskutoimitustapa, syötä arvot 1-4", "1) summa", "2) vähennys", "3) jakolasku", "4) kertolasku", "Tulokseksi saatiin:"};
  private static DecimalFormat _round = new DecimalFormat("#.##");
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
    // Printing out first lines/statement of program
    System.out.println(_UIMSG[0]);
    // Asking user input for A
    System.out.print(_UIMSG[1] + " " + "\t");
    String _UIvalueA = Reader.readString();
    if(! _UIvalueA.isEmpty() && _UIvalueA != null && (boolean)containNumbersOnly(_UIvalueA, true)) {
      // Asking user input for B
      System.out.print(_UIMSG[2] + " " + "\t");
      String _UIvalueB = Reader.readString();
      if(! _UIvalueB.isEmpty() && _UIvalueB != null && (boolean)containNumbersOnly(_UIvalueB, true)) {
        // Asking user input of calculation
        System.out.println(_UIMSG[4] + System.lineSeparator() + _UIMSG[5] + System.lineSeparator() + _UIMSG[6] + System.lineSeparator() + _UIMSG[7]);
        System.out.print(_UIMSG[3] + " " + "\t");
        String _UIvalueS = Reader.readString();
        // Validating if input is a decimal
        if((boolean)containNumbersOnly(_UIvalueS, true) && Arrays.stream(_math).anyMatch(_UIvalueS::equals)) {
          // Parsing of string to integer
          int _mathType = Integer.parseInt(_UIvalueS);
          double _valueA = Double.parseDouble(_UIvalueA);
          double _valueB = Double.parseDouble(_UIvalueB);
//          String _mathType = _UIvalues;
          // Printing out type of value, if it's a possive, negative or null-value
          // Printing out result
          double _mathResult = 0;
          String _valueSUM = "";
          // switching based on math type..
          switch(_mathType) {
            case 1: _mathResult = _valueA + _valueB; _valueSUM = "+"; break;
            case 2: _mathResult = _valueA - _valueB; _valueSUM = "-"; break;
            case 3: _mathResult = _valueA / _valueB; _valueSUM = "/"; break;
            case 4: _mathResult = _valueA * _valueB; _valueSUM = "*"; break;

          }
          System.out.println(System.lineSeparator() + _UIMSG[8] + " " + _round.format(_valueA) + " " + _valueSUM + " " + _round.format(+_valueB) + " = " + _round.format(_mathResult));
        } else {
          // Error-msg based on 3rd valiation aka too high or low numberS
          System.out.println(System.lineSeparator() + _errorMSG[0] + _errorMSG[3]);
        }
      // Error-msg based on 2nd validation
      } else {
        System.out.println(System.lineSeparator() + _errorMSG[0] + _errorMSG[2]);
      }
    // Error-msg based on 1st validaiton
    } else {
      System.out.println(System.lineSeparator() + _errorMSG[0] + _errorMSG[1]);
    }
  }
}
