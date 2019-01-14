// Java-learning
// Anton Hussi :: 17TVDO02 :: 15DAPT232.01
// Created at 2019.01.11 :: Update at 2019.01.11
// harjoitus 3_1 : Taulukko

public class harj3_0 {
  static String[] _name = {"Jaakko", "Einari", "Mummo", "Nakke", "Nelli"};
  static int[] _age = {100, 200, 125, 52, 600};
  public static void main(String[] args) {
    // punch of variables and user inputs
    for(int i = 0; i < _name.length; i++) {
      System.out.println("Taulussa on " + _name[i]);

    }

    int j = 0;
    int _value = 0;

    while(j < _age.length) {
      _value = _value + _age [j];
      j++;
    }
    System.out.println("Iät yhteensä " + _value);
  }
}
