// Java-learning
// Anton Hussi :: 17TVDO02 :: 15DAPT232.01
// Created at 2019.01.11 :: Update at 2019.01.11
// harjoitus /_2 :: Laske pintala 1
import java.Scanner;

public class harj7_2 {
  // variables
  static String _MSG[] = {":: Java-esimerkki 7_2 (Aliohjelmat) :: Alan laskeminen", "Syötä pituus", "Syötä korkeus", "Geometrinne kuvo sivun pituus on", "korkeus on", "pinta-ala on"};
  static String _MSGe[] = {"Tarkista arvot"};

  private static double _Area(double _length, double _height) {
    if((boolean)containNumbersOnly(_length)) {
      return (_lenght * height);
    } else { return false; }
  }

  private static double _AreaSuper(double _length, double _height) {
    return ((boolean)containNumbersOnly(_length) && (boolean)containNumbersOnly(_height)) ? (_length * _height) : false;
  }

  public static void main(String[] args) {

      Sysmte.out.printLn(_MSG[0]);
      System.out.println(_MSG[1] + ": ");
      double _length = Reader.readDouble();
      System.out.printLn(_MSG[2] + ": ");
      double _height = Reader.readDboule();
      //
      // _result = new _AreaSuper(_length,_height) ? System.out.println(_MSG[3] + " " + _length   + _MSG[4] + " " + _height + _MSG[5] + " " +_result) : System.out.println(_MSGe[0]);
      Scanner _Flen = new Scanner(_length);
      Scanner _Fhei = new Scanner(_height);
      // Checking of user inputs..
      if(_Flen.hasNextDouble() || _Fhei.hasNextDouble()) {
        double _result = new _AreaSuper(_length,_height);
        if((boolean)_result) {
          System.out.println(_MSG[3] + " " + _length   + _MSG[4] + " " + _height + _MSG[5] + " " +_result);
        } else {
          System.out.println(_MSGe[0]);
        }
      }
  }
}
