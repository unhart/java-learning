// Java-learning
// Anton Hussi :: 17TVDO02 :: 15DAPT232.01
// import java.Array;
import java.util.*;

public class harj10_8 {

  // variables
  static String _MSG[] = {":Java-esimerkki 10_8 :: ArrayList ja listan pienin numero", "Syötä kokonaisluvut ja muista erotella ne [,]","Pienin luku on"};
  static String _MSGe[] = {"Syötä numeroina"};

  public static void main(String[] args) {
    // Calling of filewrite on the _variable
    // printing out program name and description

    System.out.println(_MSG[0]);
    System.out.print(_MSG[1] + ": ");
    List<String> _UserInputArray = Arrays.asList(Reader.readString().split(","));
    List<Integer> _UserInputArray2 = Arrays.asList(10,5,2,12,20,30,60,100);
    System.out.println(_UserInputArray);
    // Working not as grease since problem is a string array and collections is unable sort it out
    Collections.sort(_UserInputArray);
    System.out.println(_MSG[2] + ": " + _UserInputArray.get(0));
    // Working as grease
    Collections.sort(_UserInputArray2);
    System.out.println(_MSG[2] + ": " + _UserInputArray2.get(0));
  }
}
