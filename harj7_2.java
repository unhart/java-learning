// Java-learning
// Anton Hussi :: 17TVDO02 :: 15DAPT232.01
// Created at 2019.01.11 :: Update at 2019.01.11
// harjoitus 7_2 :: Laske pintala 1
import java.util.regex.*;
import java.util.Scanner;

public class harj7_2 {
  // variables
  static String _MSG[] = {":: Java-esimerkki 7_2 (Aliohjelmat) :: Alan laskeminen", "Syötä pituus", "Syötä korkeus", "Geometrisen kuvion sivun pituus on", "korkeus on", "pinta-ala on"};
  static String _MSGsi[] = {"m2"};
  static String _MSGe[] = {"Tarkista arvot"};

  private static boolean containNumbersOnly(String source) {
    boolean result = false;
    Pattern pattern = Pattern.compile("[0-9]+.[0-9]+"); //correct pattern for both float and integer.
    pattern = Pattern.compile("\\d+.\\d+"); //correct pattern for both float and integer.

    result = pattern.matcher(source).matches();
    if(result){ return true; } else { return false; }
  }

  private static double _Area(double _length,double _height) {
    return (_length * _height);
  }

  // private static double _AreaSuper(double _length, double _height) {
  //   return ((boolean)containNumbersOnly(_length) && (boolean)containNumbersOnly(_height)) ? (_length * _height) : false;
  // }

  public static void main(String[] args) {

      System.out.println(_MSG[0]);
      System.out.print(_MSG[1] + ": ");
      String _UIlen = Reader.readString();
      Scanner _CHECKlen = new Scanner(_UIlen);
      if(! _CHECKlen.hasNextDouble() || ! _CHECKlen.hasNextBigInteger()) {
        _CHECKlen.close();
        System.out.print(_MSG[2] + ": ");
        String _UIhei = Reader.readString();
        Scanner _CHECKhei = new Scanner(_UIhei);
        if(! _CHECKhei.hasNextDouble() || ! _CHECKhei.hasNextBigInteger()) {
          _CHECKhei.close();
          //
          // _result = new _AreaSuper(_length,_height) ? System.out.println(_MSG[3] + " " + _length   + _MSG[4] + " " + _height + _MSG[5] + " " +_result) : System.out.println(_MSGe[0]);
          // Scanner _Flen = new Scanner(_length);
          // Scanner _Fhei = new Scanner(_height);
          // Checking of user inputs..
          // Checking answer has digits or purely by strings.. exceptions are made
          // Checking of user inputs..
          // if(! _SIformat.hasNextDouble() || ! _SIformat.hasNextBigInteger()

          // if((boolean)containNumbersOnly(_UIlen) && (boolean)containNumbersOnly(_UIhei)) {
            double _FORMATlen = Double.parseDouble(_UIlen);
            double _FORMAThei = Double.parseDouble(_UIhei);
            double _RESULTarea = _Area(_FORMATlen,_FORMAThei);
          // if(_RESULTarea = ) {
            System.out.println(System.lineSeparator() + _MSG[3] + " " + _FORMATlen + " " + _MSG[4] + " " + _FORMAThei + " " + System.lineSeparator() + _MSG[5] + " " +_RESULTarea + _MSGsi[0]);
          // }
        } else {
          System.out.println(_MSGe[0]);
        }
      } else {
      System.out.println(_MSGe[0]);
    }
  }
}
