// Java-learning
// Anton Hussi :: 17TVDO02 :: 15DAPT232.01
// Created at 2019.01.17 :: Update at 2019.01.18
// harjoitus 3_3 : Taulukko
import java.util.Arrays;

public class harj3_4 {
  // variables
  // still trying to improve interface msg and make it a bit more elegant.
  static String _lang[][] = {
        { "msg::Header",":: Java-esimerkki 3_4, Kysytään käyttäjältä arvo, joka syötetään viidesti taulukkoon ja lopuksi tulostetaan taulukko" },
        { "msg::UserInput","Syötä arvo (kokonaisluku)" },
        { "msg::Array","Taulussa on seuraavanlaisesti..", "Indeksillä", "taulun arvo on" }};
  // static int[][] _settings =  {
  //       { "settings::ArrayLength", 0}};
  static int[] _array01 = new int[5];

  public static void main(String[] args) {
    // punch of variables and user inputs
    // Printing out first information
    System.out.println(System.lineSeparator() + _lang[0][1]);
    int j = 0;
    // Printing out number of querys based on _settings, but via while-loop
    while(j < _array01.length)  {
      // Filling array with random numbers
      System.out.print(_lang[1][1] + " = ");
      _array01[j] = Reader.readInt();
      j++;
    }
    // Loop for print out both of arrays and respectible values, based on array01-lenght (which dublicated for earlier)
    System.out.println(System.lineSeparator() + _lang[2][1]);
    for(int i = 0; i < _array01.length; i++) {
      System.out.println(_lang[2][2] + " [" + i + "] " + _lang[2][3] + ": " + _array01[i]);
    }
  }
}
