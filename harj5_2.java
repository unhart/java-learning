// Java-learning
// Anton Hussi :: 17TVDO02 :: 15DAPT232.01
import java.util.*;

public class harj5_2 {
  // variables
  static String _MSG[] = {":: Java-esimerkki 5_1 :: ArrayList, tulostaa ensimmäisen ja viimeisen arvon", "Taulun ensimmäinen arvo on", "Taulun viimeinen arvo on"};

  public static void main(String[] args) {
    // punch of variables and user inputs
    // Printing out first information
    System.out.println(System.lineSeparator() + _MSG[0]);
    // Printing out number of querys based on _ConfigMAX, but via while-loop
    ArrayList<Integer> _Alists = new ArrayList<>();
    while((boolean)true) {
      // _listing = Reader.Reader();
      int _result = Reader.readInt();
      if(_result == -1) {
        break;
      }
      _Alists.add(_result);
    }
    // Printing out first and last value from Array List
    System.out.print(System.lineSeparator() + _MSG[1] + " " + _Alists.get(0) + System.lineSeparator() + _MSG[2] + " " + _Alists.get(_Alists.size()-1) + System.lineSeparator());
  }
}
