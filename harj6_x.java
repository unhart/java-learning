// Java-learning
// Anton Hussi :: 17TVDO02 :: 15DAPT232.01
// Created at 2019.01.11 :: Update at 2019.01.11
// harjoitus 6_1 : HashMap 1
import java.util.Random;
import java.util.Arrays;
import java.util.HashMap;

public class harj6_x {
  // variables
  static String _MSG[] = {":: Java-esimerkki 6x :: HashMap-tehtävä super rounder!"," Syötä seuraavaksi arvo (Luku tai teksti) tai syöttämällä Exit tai exit, poistut ohjelmasta", "Syötä valinta mitä seuraavaksi halutaan tehdä", "1) Tulostan syöttämäni tiedot", "2) Poistan tietyn avaimella olevan HashMapin", "0) Poistun ohjelmasta", "Poistettavissa olevat arvot on", "Syötä poistettava arvo", "Tulostetaan HashMap poistamisen jälkeen", "Poistutaan ohjelmasta", "Syötetty arvo ei vastaa haluttua"};

  static Random _random = new Random();

  public static void main(String[] args) {
    // punch of variables and user inputs
    // Printing out first information
    System.out.println(System.lineSeparator() + _MSG[0] + System.lineSeparator() + _MSG[1]);
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
    System.out.println(System.lineSeparator() + _MSG[2] + System.lineSeparator() + _MSG[3] +  System.lineSeparator() + _MSG[4] + System.lineSeparator() + _MSG[5]);
    int _UserInputOpt = Reader.readInt();
    // (boolean)_UserInputOptAns = _UserInput.compare(1, )
    if((int)_UserInputOpt == 1) {
      // User selection :: Which is printing out userinputted HashMap without modications.
      _MeIndegu.forEach((key,value) -> System.out.println(key + " = " + value));
    } else if ((int)_UserInputOpt == 2) {
      // User selection :: which is basicly delete value from HashMap
      System.out.print(_MSG[5] + " " + _MeIndegu.keySet());
      System.out.println(System.lineSeparator() + _MSG[7] + " ");
      int _UserInputOptAns = Reader.readInt();
      // Checking of user input is bigger then 0, basicly it doesn't check 0, which could be also value but it's OK for here
      if((int)_UserInputOpt != 0) {
        // We remove user input value from HashMap
        _MeIndegu.remove(_UserInputOptAns);
        // Printing information and verify that we have delete value from HashMap
        System.out.println(System.lineSeparator() + _MSG[8] + " ");
        _MeIndegu.forEach((key,value) -> System.out.println(key + " = " + value));
      } else {
        // Printint out error MSG based on that selection isn't corresponding for value
        System.out.println(System.lineSeparator() + _MSG[10]);
      }
    } else if ((int)_UserInputOpt == 0){
      // Printing out error MSG based on value 0, which is exi
      System.out.println(System.lineSeparator() + _MSG[9]);
    } else {
      // PRinting out error MSG based on that value isn't not found from arguement (aka unknown valua)
      System.out.println(System.lineSeparator() + _MSG[10]);
    }
  }
}
