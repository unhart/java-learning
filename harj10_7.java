// Java-learning
// Anton Hussi :: 17TVDO02 :: 15DAPT232.01
// harjoitus 10_6 :: tuumat senteiksi
// import java.math.*;

public class harj10_7 {
  // variables
  static String _MSG[] = {":Java-esimerkki 10_6 :: BS-laskuri 50 alaspäin", "Luku on"};
  static String _MSGe[] = {"Syötä numeroina"};
  static int _Config = 0;

  public static void main(String[] args) {
    // Calling of filewrite on the _variable
    // printing out program name and description
    System.out.println(_MSG[0]);
    // User inputs for filename, etc..
    // time to make thingies
    for(int i = 50; i >= _Config+1; i--) {
      System.out.println(_MSG[1] + " " + (i));
    }
  }
}
