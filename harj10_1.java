// Java-learning
// Anton Hussi :: 17TVDO02 :: 15DAPT232.01
// harjoitus 10_2 :: tuumat senteiksi
// import java.math.*;

public class harj10_1 {
  // variables
  static String _MSG[] = {":Java-esimerkki 10_1 :: Tarkistaa onko syötetty vuosi karkausvuosi", "Syötä vuosiluku", "Vuosi","on karkausvuosi","ei ole karkausvuosi"};
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
      // Once input is verified aka not an empty, we will convert inputted data to Integer
      int _FormatUserInput = Integer.parseInt(_UserInput01);
      // Printing out information regarding argumenting
      System.out.println(System.lineSeparator() + _MSG[2] + " " + _FormatUserInput + " " + (((_FormatUserInput & 3) == 0 && ((_FormatUserInput % 25) != 0 || (_FormatUserInput & 15) == 0)) ? _MSG[3] : _MSG[4]));

      // need to check calendar function
      // Calendar cal = Calendar.getInstance();
      // cal.set(Calendar.YEAR, _FormatUserInput);
      //       System.out.println(System.lineSeparator() + _MSG[3] + " " + (cal.getActualMaximum(Calendar.DAY_OF_YEAR) > 365));
    } else {
      // Printing out informatin regarding input is empty
      System.out.println(_MSGe[1]);
    }
  }
}
