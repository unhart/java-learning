// Java-learning
// Anton Hussi :: 17TVDO02 :: 15DAPT232.01
// Created at 2019.01.17 :: Update at 2019.01.18
// harjoitus 3_3 : Taulukko
import java.util.Random;
import java.util.Arrays;
import java.util.stream.*;

public class harj3_3 {
  // variables
  // still trying to improve interface msg and make it a bit more elegant.
  static String _lang[][] = {
        { "msg::Header",":: Java-esimerkki 3_3, Tehdään taulukko yksi ja siitä käänteislukuna taulukko 2" },
        { "msg::Table","Taulussa 01","Taulussa 02" },
        { "msg::Index","Indeksillä" },
        { "msg::TableofValue","taulun arvo on" }};
  // static int[][] _settings =  {
  //       { "settings::ArrayLength", 0}};
  static int[] _array01 = new int[20];
  static int[] _array02;
  static Random _random = new Random();

  public static void main(String[] args) {
    // punch of variables and user inputs
    // Printing out first information
    System.out.println(System.lineSeparator() + _lang[0][1]);
    int j = 0;
    // Printing out number of querys based on _settings, but via while-loop
    while(j < _array01.length)  {
      // Filling array with random numbers
      _array01[j] = _random.nextInt(99);
      j++;
    }
    // now we clone the array, tho isn't important
    _array02 = _array01.clone();
    // We use object and stream-class to reversing the order
    Object[] _array02 = IntStream.rangeClosed(1, _array01.length)
      .mapToObj(i -> _array01[_array01.length -i])
      .toArray();
    // Loop for print out both of arrays and respectible values, based on array01-lenght (which dublicated for earlier)
    for(int i = 0; i < _array01.length; i++) {
      System.out.println(_lang[1][1] + " [ " + i + " ] " + _lang[2][1] + ": " + _array01[i] + ",\t" + _lang[1][2] + " [ " + i + " ] " + _lang[2][1] + ": " + _array02[i]);
    }
  }
}
