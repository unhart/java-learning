// Java-learning
// Anton Hussi :: 17TVDO02 :: 15DAPT232.01
import java.util.Random;
import java.util.HashMap;

public class harj6_1 {
  // variables
  static String _MSG[] = {":: Java-esimerkki 6-1 :: HashMap 1", "Seuraavat arvot löytyvät HashMapissa"};
  static Random _random = new Random();

  public static void main(String[] args) {
    // punch of variables and user inputs
    // Printing out first information
    System.out.println(System.lineSeparator() + _MSG[0]);
    // Printing out number of querys based on _ConfigMAX, but via while-loop
    HashMap<Integer, String> _MeIndegu = new HashMap<Integer, String>();
    // Starting to ask random values for HashMap and also randomnly putting out numbers between 1 to 99
    while((boolean)true) {
      String _UserInput = Reader.readString();
      // if(_UserInput == "Exit" || _UserInput == "exit") {
      if(_UserInput.equals("Exit") || _UserInput.equals("exit")) { break;}
      _MeIndegu.put(_random.nextInt(99), _UserInput);
    }
    // Printing out HashMap crap
    System.out.println(System.lineSeparator() + _MSG[1]);

    // (boolean)_UserInputOptAns = _UserInput.compare(1, )
    _MeIndegu.forEach((key,value) -> System.out.println(key + " = " + value));
  }
}
