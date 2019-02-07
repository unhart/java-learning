// Java-learning
// Anton Hussi :: 17TVDO02 :: 15DAPT232.01
// import java.util.regex.*;
// import java.util.Scanner;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class harj9_4 {
  // variables
  static String _AbsoluteName = "harj9";
  static String _MSG[] = {":: Java-esimerkki 9_4 :: TXT2HTML muuntaja", "Syötä tiedostonnimi", "Tiedosto on olemassa, haluatko poistaa tiedoston", "(y) Poistetaan tiedosto / (anykey) Lisätään tiedostoon", "Tekstitiedosto muunnettu HTML;ksi"};
  static String _MSGe[] = {"Muista syöttää tiedostonnimi", "Tiedosto ei löydy", "Tiedostonluvussa ongelmia", "Virhe tiedostonkäsittelyssä"};

  public static void main(String[] args) throws IOException {
    // Calling of filewrite on the _variable
    // printing out program name and description
    System.out.println(_MSG[0]);
    // User inputs for filename, etc..
    System.out.print(_MSG[1] + ": ");
    String _IOUserInput_filename = Reader.readString();
    // time to make thingies
    // A couple string to get a proper file based on userinput and also extension for it (we're assuming it's txt and it will be converted into html-file)
    String _IOfilenameTXT = _AbsoluteName + "_" + _IOUserInput_filename + ".txt";
    String _IOfilenameHTML = _AbsoluteName + "_" + _IOUserInput_filename + ".html";
    // Checking that our user input is valid and not null
    if(_IOUserInput_filename!= null && ! _IOUserInput_filename.isEmpty()) {
      File _IOcheck = new File(_IOfilenameTXT);
      String _HTML0 = "<html>\r";
            _HTML0 += "<head>\r";
            _HTML0 += "\t<title>" + _IOUserInput_filename + "</title\r";
            _HTML0 += "</head>\r";
            _HTML0 += "<body>\r";
            _HTML0 += "\t<h1>" + _AbsoluteName + "</h1>\r";
      String _HTML1 = "\t<p>";
      String _HTML2 = "</p>\r";
      String _HTML3  = "</body>\r";
             _HTML3 += "</html>";
      // Now we're cechking that file is either existed or action is based what user going to select
      if(_IOcheck.isFile()) {
        // Asking userinput for file deletion or append (in case of append it append all the info, tho it could be writted wihtout them)
        System.out.print(_MSG[2] + System.lineSeparator() + _MSG[3] + ": ");
        String _IOUserInput_existed = Reader.readString();
        // Checking userinput, that is not empty and then valid for options
        if(!_IOUserInput_existed.isEmpty()) {
          if(_IOUserInput_existed.equals("y") || _IOUserInput_existed.equals("Yes")) {
            File _IOdelete = new File(_IOfilenameHTML);
            _IOdelete.delete();
          }
          // we'ere this far with thingie, now we initializing BufferedWriter
          BufferedWriter _IOwrite = new BufferedWriter(new FileWriter(_IOfilenameHTML, true));
          try {
            // Writing intiial html, head, title--thingies
            _IOwrite.write(_HTML0);
            // Timet o ask bufferedRead to read our file which is used to converting txt file to <p>-tags
            try (BufferedReader _IObuffer = new BufferedReader(new FileReader(_IOfilenameTXT))) {
              String _IOconvert;
              // Loop for lines
              while((_IOconvert = _IObuffer.readLine()) != null) {
              // _IOconvert += _IObuffer.readLine();
                // Writing sequence
                if(! _IOconvert.isEmpty()) {
                  try {
                    _IOwrite.write(_HTML1 + _IOconvert + _HTML2);
                    _IOwrite.flush();
                  } catch (IOException e) {
                    System.out.println(_MSGe[2]);
                  }
                } else break;
              }
            }
          // Some exception current not mandled
          } catch (IOException e) {
            System.out.println("tuntematon 2");
          // Nowe ere'e wiriting last part of file and flushing Buffer
          } finally {
            _IOwrite.write(_HTML3);
            _IOwrite.flush();
            // Printing out confirmation message
            System.out.println(System.lineSeparator() + _MSG[4]);
          }
        // Error based on ation if file doesn't exist
        } else {
          System.out.println(_MSGe[1]);
        }
      // User didn't input filename, autoexit
      } else {
        System.out.println(_MSGe[0]);
      }
    }
  }
}


        // } catch (IOException e) {
        //   System.out.println("tuntematon 2" + e.getMessage());
        // } finally { }
      // }


            // Stream<String> _IOstream = Files.lines(Paths.get(_IOfilename));
              // _IOstream.forEach(System.out::Println);
              // _IOstream.filters(s -> s.endswith("/"))
              //       .sorted()
              //       .map(String::toUppercase)
              //       .foreach(System.out::println);
              // try(RandomAccessFile _IOaccess = new RandomAccessFile(new File(_IOfilename), "rw")) {
              //   _IOaccess.seek(0);
              //   _IOaccess.write(_HTMLbody.getBytes());
              //   _IOaccess.writeBytes(update);
              // } catch (IOException e) {
              //   System.out.println("tuntematon 2");
              // }

            //   Files.write(_IOfilenameHTML, _HTML0);
            //   List<String> _IOcontent = lines
            //           .map(line -> _IOcontent.replaceAll(_IOStream, _HTML1 + _IOStream + _HTML2))
            //           .collect(Collectors.toList());
            //   Files.write(_IOfilenameHTML, _IOcontent);
            //   Files.write(_IOfilenameHTML, _HTML3);
            //   System.out.println(System.lineSeparator() + _MSG[4]);
            // } catch (IOException e) {
            //   System.out.println("tuntematon");
            // }
              // Str _IOfileline;
              // while((_IOfineline = _IOread.readline()) != null || ) {
              //
              // }

              // for(Str line; (line = _IOread.readline()) != null;) {
              //
              //
              // }

              // try(Stream<String> _IOstream = Files.lines(Paths.get(_IOfilename))) {
              //   _IOstream.forEeach(System.out::println);
              // }
              //
              // System.out.print(_MSG[2] + ": ");
              // String _IOUserInput_data = Reader.readString();
              // if(_IOUserInput_data.equals("Exit") || _IOUserInput_data.equals("exit")) { break; } else { _IOwrite.newLine(); }
              // _IOwrite.write(_IOUserInput_data);
              // _IOwrite.flush();
            // Catching of exceptiong aka file error
            // } catch (IOException e) {
            //   System.out.println(_MSGe[2]);
            // }
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
          // }
        // }
        // Closing of file or printing error based on error from above
//       } else {
//         System.out.println(_MSGe[1]);
//       }
//       // Argumenting if check fails
//     } else {
//       System.out.println(_MSGe[0]);
//     }
//   }
// }
