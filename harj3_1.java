// Java-learning
// Anton Hussi :: 17TVDO02 :: 15DAPT232.01
// Created at 2019.01.11 :: Update at 2019.01.11
// harjoitus 3_1 : Taulukko
import java.util.Random;

public class harj3_1 {
  // variables
  static String _IntMSG[] = {":: Java-esimerkki 3_1", "Indeksillä", "taulun arvo on", "For-loopilla", "While-loopilla"};
  static int _configNULL = 0;
  static int[] _configMAX = new int[20];
  static Random _random = new Random();

  public static void main(String[] args) {
    // punch of variables and user inputs
    // Printing out first information
    System.out.println(_IntMSG[0] + " " + _IntMSG[3]);
    // Printing out number of querys based on _ConfigMAX, but via for-loop
    for(int i = _configNULL; i < _configMAX.length; i++) {
      System.out.println(_IntMSG[1] + " [" + i + "]" + "\t" +_IntMSG[2] + " " +_random.nextInt(99));
    }
    System.out.println(System.lineSeparator() + _IntMSG[0] + " " + _IntMSG[4]);
    int j = 0;
    // Printing out number of querys based on _ConfigMAX, but via while-loop
    while(j < _configMAX.length)  {
      System.out.println(_IntMSG[1] + " [" + j + "]" + "\t" +_IntMSG[2] + " " +_random.nextInt(99));
      j++;
    }
  }
}
