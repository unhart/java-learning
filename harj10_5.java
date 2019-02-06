// Java-learning
// Anton Hussi :: 17TVDO02 :: 15DAPT232.01
// harjoitus 10_5 :: tuumat senteiksi
// import java.math.*;

public class harj10_5 {
  // variables
  static String _MSG[] = {":Java-esimerkki 10_5 :: Kokonaislukulaskuri", "Syötä kokonaisuluku", "Syötetyt luvut on yhteensä"};
  static String _MSGe[] = {"Syötä numeroina"};

  public static void main(String[] args) {
    // Calling of filewrite on the _variable
    // printing out program name and description
    System.out.println(_MSG[0]);
    // User inputs for filename, etc..
    // time to make thingies
    // Checking that our user input is valid and not null
    int _result = 0;
    while((boolean)true) {
      System.out.print(_MSG[1] + ": ");
      int _UserInput01 = Reader.readInt();
      if(_UserInput01 == 0) { break; } else {
        _result = _result+_UserInput01;
      }
    }
    System.out.println(_MSG[2] + " " + _result);
  }
}
