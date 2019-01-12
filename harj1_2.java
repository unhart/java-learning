// Java-learning
// Anton Hussi :: 17TVDO02 :: 15DAPT232.01
// Created at 2019.01.11 :: Update at 2019.01.12
// Harjoitus 1_2 | Ympyrän pinta-ala
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
// actial class
public class harj1_2 {
  // Variables for class
  static String[] _errorMSG = {"Virhe:", "Syötit tekstiä, anna lukuina", "Syötit väärän SI-yksikön", "Syötit väärän mittayksikön"};
  static String[] _SIvalues = {"mm", "millimetri", "cm", "senttimetri", "m", "metri", "km", "kilometri"};
  // Calling of imported DecimalFormat-class and "variable" for it
  private static DecimalFormat _round = new DecimalFormat("#.##");
  // Actual main program
  public static void main(String[] args) {
    // Calling of imported DecimalFormat-class and "variable" for it
    // Printing first line and statement purpose of program
    System.out.println(":: Lasketaan ympyrän ala");
    // user input for radius
    // User input for unit of measurement
    System.out.println("Haluamasi SI-mukainen pituusysikkö, joko lyhennettynät tai kokonaisuutena.");
    System.out.print("Syötä yksikkö: " + "\t\t");
    String _SI = Reader.readString();
    Scanner _SIformat = new Scanner(_SI);
    // Checking of user inputs..
    if(! _SIformat.hasNextDouble() || ! _SIformat.hasNextBigInteger()) {
      if(_SI != null && ! _SI.isEmpty()) {
    //      boolean _SIcheck = Arrays.stream(_SIvalues).anyMatch(_SI::equals);
          // Checking of that SI-unit is allowed on the array
          // TRUE = calculating
          // FALSE = Printing out error-msh
          if(Arrays.stream(_SIvalues).anyMatch(_SI::equals)) {
            // user input for radius
            System.out.print("Syötä säde: " + "\t\t");
            double _radius = Reader.readDouble();
            double _area = Math.PI * (_radius * _radius);
            System.out.println(":: Ympyrän mitat on");
            // Printing out user inpuied radius and then sum of area from it
            System.out.println("Ympyrän säde on: " + "\t" + _round.format(_radius) + " " + _SI);
            System.out.println("Ympyrän pinta-ala on: " + "\t" + _round.format(_area) + " " + _SI + "2");
          } else {
            System.out.println(_errorMSG[0] + _errorMSG[2]);
          }
        } else {
          System.out.println(_errorMSG[0] + _errorMSG[3]);
      }

    } else {
      System.out.println(_errorMSG[0] + _errorMSG[1]);
    }
    _SIformat.close();
    // case didn't work as planned, need to come back and check it at later on
    // switch(_SI) {
    //   case isEmpty():
    //     System.out.println("Syötä mittayksikkö");
    //     break;
    //   case ArrayUtils.contains(_SIvalues, _SI):
    //     // user input for radius
    //     System.out.print("Syötä säde: ");
    //     double _radius = Reader.readDouble();
    //     double _area = Math.PI * (_radius * _radius);
    //     // Printing out user inpuied radius and then sum of area from it
    //     System.out.println("Ympyrän säde on: " + "\t" + _round.format(_radius) + " " + _SI);
    //     System.out.println("Ympyrän pinta-ala on: " + "\t" + _round.format(_area) + " " + _SI + "2");
    //     break;
    // }
  }
}
