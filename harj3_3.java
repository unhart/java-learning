// Java-learning
// Anton Hussi :: 17TVDO02 :: 15DAPT232.01
// Created at 2019.01.11 :: Update at 2019.01.11
// harjoitus 3_3 : Taulukko
import java.util.Random;

public class harj3_3 {
  // variables
  static String _IntMSG[] = {":: Java-esimerkki 3_3", "Indeksillä", "taulun arvo on"};
  static int _configNULL = 0;
  static int[] _array01 = new int[20];
  static int[] _array02;
  static Random _random = new Random();

  public static void main(String[] args) {
    // punch of variables and user inputs
    // Printing out first information
    System.out.println(System.lineSeparator() + _IntMSG[0]);
    int j = 0;
    // Printing out number of querys based on _ConfigMAX, but via while-loop
    while(j < _array01.length)  {
      System.out.println(_IntMSG[1] + " [" + j + "]" + "\t" +_IntMSG[2] + " " +_random.nextInt(99));
      j++;
    }
    _array02 = _array01.clone();
  }
}
