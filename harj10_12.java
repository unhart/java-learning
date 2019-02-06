// Java-learning
// Anton Hussi :: 17TVDO02 :: 15DAPT232.01
import java.io.*;

public class harj10_12 {
  // variables
  static String _MSGa = "harj10_12";
  static String _MSG[] = {":Java-esimerkki 10_12 :: Tekstinluku-bs", "Syötä tiedostonnimi", "Syötä riivimäärä", "Syötä riville numero"};
  static String _MSGe[] = {"Muista syöttää tiedostonnimi", "Tiedostoa ei ole olemassa", "Tiedostonluvussa ongelmia", "Virhe tiedostonkäsittelyssä"};

  public static void main(String[] args) throws IOException {
    // Calling of filewrite on the _variable
    // printing out program name and description
    System.out.println(_MSG[0]);
    // User inputs for filename, etc..
    System.out.print(_MSG[1] + ": ");
    String _IOUserInput_filename = Reader.readString();
    // Checking if userinput is correct and not null, if it's ok -> then continues
    if(_IOUserInput_filename!= null && ! _IOUserInput_filename.isEmpty()) {
      File _IOcheck = new File(_IOUserInput_filename);
      // checking if file existing otherwise printing out error
        if(_IOcheck.isFile()) {
          try (BufferedReader _IObuffer = new BufferedReader(new FileReader(_IOUserInput_filename))) {
            String _IOread;
            while((_IOread = _IObuffer.readLine()) != null) {
              System.out.println(_IOread);
            }
          } catch (IOException e) {
            System.out.println(_MSGe[2]);
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
