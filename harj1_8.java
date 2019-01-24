// Java-learning
// Anton Hussi :: 17TVDO02 :: 15DAPT232.01
// Created at 2019.01.12 :: Update at 2019.01.12
// Harjoitus 1-9 | Oppilaan arvosana-laskuri perustuen pistemäärään.
import java.util.regex.*;

public class harj1_8 {
  // Variables for class
  static String[] _errorMSG = {"Virhe: ", "Anna oppilaan nimi", "Syötä pistemäärä kokonaislukuna", "Tarkista syötteesi", "Annettu pistemäärä on yli 40"};
  static String[] _averageMSG = {"0", "1", "2", "3"};
  static String[] _UIMSG = {":: Oppilaan kesiarvo laskuri, arvoasteikolla 0 - 3", "Syötä oppilaan nimi:", "Syötä oppilaan kokeen pistemäärä:", "Oppilas:", "Sai arvosanakseen:", "pistemäärällä", "/", "40"};
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
    System.out.println(_UIMSG[0]);
    // Asking user input for Age
    System.out.print(_UIMSG[1] + " " + "\t\t");
    String _UIname = Reader.readString();
    if(! _UIname.isEmpty() && _UIname != null && ! (boolean)containNumbersOnly(_UIname, true)) {
      // Asking user input for Monthly wage and continues
      System.out.print(_UIMSG[2] + " " + "\t");
      String _UIaverage = Reader.readString();
      // Validating if input is a decimal
      if((boolean)containNumbersOnly(_UIaverage, true)) {
        // Parsing of string to integer
        int _average = Integer.parseInt(_UIaverage);
        String _result = "";
        // Printing out type of value, if it's a possive, negative or null-value
        if(_average == 0 && _average <= 40) {
          // checking of values, based on exercise
          if((_average >= 0) && (_average <= 10)) {
            _result = _averageMSG[0];
          } else if ((_average > 11) && (_average <= 20)) {
            _result = _averageMSG[1];
          } else if ((_average > 21) && (_average <= 30)) {
            _result = _averageMSG[2];
          } else {
            _result = _averageMSG[3];
          }
          // Printing out result
          System.out.println(System.lineSeparator() + _UIMSG[3] + " " + _UIname + " " + _UIMSG[4] + " " + _result);
          System.out.println(_UIMSG[4] + " " + _result + System.lineSeparator() + _UIMSG[5]  + " " +_average + _UIMSG[6  ] + _UIMSG[7]);
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
