// Java-learning
// Anton Hussi :: 17TVDO02 :: 15DAPT232.01
// Created at 2019.01.11 :: Update at 2019.01.11
// harjoitus 7_2 :: Laske pintala 1
// import java.util.regex.*;
// import java.util.Scanner;
import java.io.*;

public class harj9_1 {
  // variables
  static String _AbsoluteName = "harj9_1";
  static String _MSG[] = {":: Java-esimerkki 9_1 :: Henkilönnimen tallentaminen tiedostoon", "Syötä tiedostonnimi", "Syötä henkilönimi", "Syötä postiosoite", "Syötä puhelinumero"};
  static String _MSGe[] = {"Tiedostonluvussa ongelmia", "Virhe tiedostonkäsittelyssä"};


  public static void main(String[] args) {
    // Calling of filewrite on the _variable
    FileWriter _FILE;

    String _UI[] = new String[4];
    // printing out program name and description
    System.out.println(_MSG[0]);
    // User inputs for filename, etc..
    System.out.print(_MSG[1] + ": ");
    _UI[0] = Reader.readString();
    System.out.print(_MSG[2] + ": ");
    _UI[1] = Reader.readString();
    System.out.print(_MSG[3] + ": ");
    _UI[2] = Reader.readString();
    System.out.print(_MSG[4] + ": ");
    _UI[3] = Reader.readString();
    // time to make thingies
    try {
      _FILE = new FileWriter(_AbsoluteName + _UI[0] + ".txt");
      _FILE.write(_UI[1] + "\r" + _UI[2] + "\r" + _UI[3]);
      _FILE.close();
    } catch (IOException e) {
      System.out.println(_MSGe[1]);
    }
  }
  //   try {
  //     _FILEin = new FileReader(_UI[0] + ".txt");
  //     // Inserting a new name
  //     _FILEbuffer = new BufferedReader(_UIfilename);
  //     while(_FILE == 1) {
  //       _FILEline = "";
  //       try { _fileline = buffer.readLine(); }
  //       catch(IOException e)  { System.out.println(_MSGe[0]); }
  //       if(_FILEline != null)  { System.out.println(_FILEline); }
  //       else                  { _FILEend = true; }
  //
  //     }
  //   }
  //   catch(IOException e) { System.out.println(_MSGe[1]); }
  // }
}
