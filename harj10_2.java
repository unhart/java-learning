// Java-learning
// Anton Hussi :: 17TVDO02 :: 15DAPT232.01
public class harj10_2 {
  // variables
  static String _MSG[] = {":Java-esimerkki 10_2 :: Tuumat senteiksi", "Syötä tuumamitta", "Tuuma on", "cm", "ja", "mm"};
  static String _MSGe[] = {"Syötä numeroina"};

  public static void main(String[] args) {
    // Calling of filewrite on the _variable
    // printing out program name and description
    System.out.println(_MSG[0]);
    // User inputs for filename, etc..
    System.out.print(_MSG[1] + ": ");
    String _UserInput01 = Reader.readString();
    // time to make thingies
    // Checking that our user input is valid and not null
    if(_UserInput01 != null && ! _UserInput01.isEmpty()) {
      double _FormatUserInput = Double.parseDouble(_UserInput01);
      System.out.println(System.lineSeparator() + _FormatUserInput + " " + _MSG[2] + " " + (_FormatUserInput * 2.54) + " " + _MSG[3] + " / " + (_FormatUserInput * 2.54 * 1000) + " " + _MSG[5]);
    } else {
      System.out.println(_MSGe[1]);
    }
  }
}
