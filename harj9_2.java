// Java-learning
// Anton Hussi :: 17TVDO02 :: 15DAPT232.01
// Created at 2019.01.11 :: Update at 2019.01.11
// harjoitus 7_2 :: Laske pintala 1
// import java.util.regex.*;
// import java.util.Scanner;
import java.io.*;

public class harj9_2 {
  // variables
  static String _AbsoluteName = "harj9_2";
  static String _MSG[] = {":: Java-esimerkki 9_2 :: Runorekaattori", "Syötä tiedostonnimi", "Syötä runo, rivi kerralla"};
  static String _MSGe[] = {"Muista syöttää tiedostonnimi", "Tiedosto ei ole olemassa", "Tiedostonluvussa ongelmia", "Virhe tiedostonkäsittelyssä"};

  public static void main(String[] args) throws IOException {
    // Calling of filewrite on the _variable
    // printing out program name and description
    System.out.println(_MSG[0]);
    // User inputs for filename, etc..
    System.out.print(_MSG[1] + ": ");
    String _IOUserInput_filename = Reader.readString();
    // time to make thingies
    String _IOfilename = _AbsoluteName + "_" + _IOUserInput_filename + ".txt";
    // Checking if userinput is correct and not null, if it's ok -> then continues
    if(_IOUserInput_filename!= null && ! _IOUserInput_filename.isEmpty()) {
      File _IOcheck = new File(_IOfilename);
      // checking if file existing otherwise printing out error
        if(_IOcheck.isFile()) {
          // time to write thingies on loop or exit/Exit by userinput
          while((boolean)true) {
            // Writing file according user input
            // BufferedWriter _IOwrite;
            try (BufferedWriter _IOwrite = new BufferedWriter(new FileWriter(_IOfilename, true))) {
              System.out.print(_MSG[2] + ": ");
              String _IOUserInput_data = Reader.readString();
              if(_IOUserInput_data.equals("Exit") || _IOUserInput_data.equals("exit")) { break; } else { _IOwrite.newLine(); }
              _IOwrite.write(_IOUserInput_data);
              _IOwrite.flush();
            // Catching of exceptiong aka file error
            } catch (IOException e) {
              System.out.println(_MSGe[2]);
            }
            // somne snippets for later use, changes, etc...
            // finally {
            //   try(Stream<String> _IOtrim = Files.lines(Paths.get(_IOfilename))) {
            //     _IOtrim.filter(line -> !line.trim().equals("")).forEach(System.out::printLn);
            //     _IOwrite.close();
            //   } catch (IOException e) {
            //     System.out.println("testi");
            //   }
            // }

              // if(_IOwrite != null) try {
              // } finally {
                // _IOwrite.close();
              // } catch (IOException ioe2) {}
          }
        // }
        // Closing of file or printing error based on error from above
      } else {
        System.out.println(_MSGe[1]);
      }
      // Argumenting if check fails
    } else {
      System.out.println(_MSGe[0]);
    }
  }
}
