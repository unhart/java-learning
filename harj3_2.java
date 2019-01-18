// Java-learning
// Anton Hussi :: 17TVDO02 :: 15DAPT232.01
// Created at 2019.01.11 :: Update at 2019.01.11
// harjoitus 3_2 : Taulukon keskiarvo ja summma
import java.util.Random;
import java.lang.Math;

public class harj3_2 {
  // variables
  static String _IntMSG[] = {":: Java-esimerkki 3_2", "Indeksillä", "taulun arvo on", "Taulukon summa on", "Taulukon keskiarvo on"};
  static int _configNULL = 0;
  static int[] _configMAX = new int[20];
  static Random _random = new Random();
  public static void main(String[] args) {
    // punch of variables and user inputs
    // Printing out first information
    System.out.println(_IntMSG[0] + " " + _IntMSG[3]);
    // Printing out number of querys based on _ConfigMAX, but via for-loop
    int j = 0;
    int _result = 0;
    // Printing out number of querys based on _ConfigMAX, but via while-loop
    while(j < _configMAX.length)  {
      int _randomNumber = _random.nextInt(99);
      System.out.println(_IntMSG[1] + " [" + j + "]" + "\t" +_IntMSG[2] + " " + _randomNumber);
      _result = _result + _randomNumber;
      j++;
    }
    // Printing out final answer along the sum of array and average from it
    System.out.println(_IntMSG[3] + "\t" +_result + System.lineSeparator() + _IntMSG[4] + "\t" + Math.round(_result / _configMAX.length));
  }
}
