// Java-learning
// Anton Hussi :: 17TVDO02 :: 15DAPT232.01
// Created at 2019.01.11 :: Update at 2019.01.11
// harjoitus 7_2 :: Laske pintala 1
// import java.util.regex.*;
// import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.io.*;

public class harj9_3 {
  // variables
  static String _MSG[] = {":: Java-esimerkki 9_3 :: Lukusydeemi", "Syötä tiedostonnimi, esim (teksti.txt)", "Tiedosto nimeltä","sisältää seuraavat rivit"};
  static String _MSGe[] = {"Muista syöttää tiedostonnimi", "Tiedosto on olemassa", "Tiedostonluvussa ongelmia", "Virhe tiedostonkäsittelyssä"};

  public static void main(String[] args) throws IOException {
    // Calling of filewrite on the _variable
    // printing out program name and description
    System.out.println(_MSG[0]);
    // User inputs for filename, etc..
    System.out.print(_MSG[1] + ": ");
    String _IOUserInput_filename = Reader.readString();
    // time to make thingies
    String _IOfilename = _IOUserInput_filename;
    // Checking if userinput is correct and not null, if it's ok -> then continues
    if(_IOUserInput_filename!= null && ! _IOUserInput_filename.isEmpty()) {
      // File _IOcheck = new File(_IOfilename);
      // checking if file existing otherwise printing out error
      try(FileInputStream _IOcheck = new FileInputStream(new File(_IOfilename))) {
        List<String> _IOfile = new ArrayList<>();
        // We start to read file and inserting it to collector/array
        try (BufferedReader _IOreader = Files.newBufferedReader(Paths.get(_IOfilename))) {
          _IOfile = _IOreader.lines().collect(Collectors.toList());
        } catch (IOException e) {
          System.out.println(_MSGe[2]);
        }
        // Printing out list
        System.out.println(System.lineSeparator() + _MSG[2] + " " +_IOfilename + " " + _MSG[3]);
        _IOfile.forEach(System.out::println);
      // Arugementing if something fail during read
      } catch (IOException e) {
        System.out.println(_MSGe[1]);
      }
      // Argumenting if check fails
    } else {
      System.out.println(_MSGe[0]);
    }
  }
}
