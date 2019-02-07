// Java-learning
// Anton Hussi :: 17TVDO02 :: 15DAPT232.01
public class harj10_3 {
  // variables
  static String[] _MSG = {":Java-esimerkki 10_3 :: BS-laskuri 50 alaspäin",
                          "Mitä alueelta halutaan lukuja näyttää",
                          "1) alueelta 0 - 100",
                          "11) alueelta 0 - 100, jaeteltuna 3:lla",
                          "2) alueelta 100 - 10000",
                          "3) alueelta 10000 - 1000000",
                          "anykey) Poistuu",
                          "Luku on"};
  // static String _uiTitle, _uiDescription, _uiInputAsking, _uiInputChoice01, _uiInputChoice02, _uiInputChoice03;
  // static String _uiTitle = ":Java-esimerkki 10_3";
  static String _MSGe[] = {"Hyvästi"};
  static int _Config = 1000000;

  public static void main(String[] args) {
    // Calling of filewrite on the _variable
    // printing out program name and description
    System.out.println(_MSG[0]);
    // User inputs for filename, etc..
    // time to make thingies
    System.out.println(_MSG[1] + System.lineSeparator() + _MSG[2] + System.lineSeparator() + _MSG[3] + System.lineSeparator() + _MSG[4] + System.lineSeparator() + _MSG[5] + ": ");
    int _UserInput01 = Reader.readInt();
    for(int i = 0; i < _Config; i++) {
      // User decided to go with option 1
      if((int)_UserInput01 == 1) {
        if(i%2 == 0 && i <= 100) {
          System.out.println(_MSG[7] + " " + (i));
        }
      // User wanna go with option 11
      }else if ((int)_UserInput01 == 11) {
        if(i % 3 == 0 && i <= 100) {
          System.out.println(_MSG[7] + " " + (i));
        }
      // User decided to go with option 2
      } else if ((int)_UserInput01 == 2) {
        if(i >= 100 && i % 100 == 0 && i <= 1000) {
          System.out.println(_MSG[7] + " " + (i));
        }
        if(i >= 1000 && i % 1000 == 0 && i <= 10000) {
          System.out.println(_MSG[7] + " " + (i));
        }
      } else if ((int)_UserInput01 == 3) {
        if(i >= 10000 && i % 10000 == 0 && i <= 100000) {
          System.out.println(_MSG[7] + " " + (i));
        }
        // There is a bug on the code.. some reason it's unable to go all way up to 1 mil.
        if(i >= 100000 && i % 100000 == 0 && i <= 1000000) {
          System.out.println(_MSG[7] + " " + (i));
        }

      }
    }
    // } else {
    //   System.out.println(_MSGe[0]);
    // }
  }
}
