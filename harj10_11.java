// Java-learning
// Anton Hussi :: 17TVDO02 :: 15DAPT232.01
import java.io.*;

public class harj10_11 {
  // variables
  static String _MSGa = "harj10_11";
  static String _MSG[] = {":Java-esimerkki 10_11 :: Kolmirivilukija", "Syötä tiedostonnimi", "Syötä riivimäärä", "Syötä riville numero"};
  static String _MSGe[] = {"Muista syöttää tiedostonnimi", "Tiedosto on olemassa", "Tiedostonluvussa ongelmia", "Virhe tiedostonkäsittelyssä"};

  public static void main(String[] args) throws IOException {
    // Calling of filewrite on the _variable
    // printing out program name and description
    System.out.println(_MSG[0]);
    // User inputs for filename, etc..
    System.out.print(_MSG[1] + ": ");
    String _IOUserInput_filename = Reader.readString();
    // time to make thingies
    // String _IOfilename = _MSGa + "-" + _IOUserInput_filename;
    String _IOfilename = _IOUserInput_filename;
    // Checking if userinput is correct and not null, if it's ok -> then continues
    if(_IOUserInput_filename!= null && ! _IOUserInput_filename.isEmpty()) {
      File _IOcheck = new File(_IOfilename);
      // checking if file existing otherwise printing out error
        if(!_IOcheck.isFile()) {
          System.out.print(_MSG[2] + ": ");
          int _IOfilename_count = Reader.readInt();
          // time to write thingies on loop or exit/Exit by userinput
          for(int i=1; i<_IOfilename_count+1; i++) {
            try (BufferedWriter _IOwrite = new BufferedWriter(new FileWriter(_IOfilename, true))) {
              System.out.print(_MSG[3] + " [" + (i < 10 ? "0" + i : i) + "]: ");
              String _IOUserInput_data = Reader.readString();
              if(_IOUserInput_data.equals("Exit") || _IOUserInput_data.equals("exit")) { break; } else { _IOwrite.newLine(); }
              _IOwrite.write(_IOUserInput_data);
              _IOwrite.flush();
              // Catching of exceptiong aka file error
              } catch (IOException e) {
                System.out.println(_MSGe[2]);
              }

          }
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
