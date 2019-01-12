// Java-learning
// Anton Hussi :: 17TVDO02 :: 15DAPT232.01
// Created at 2019.01.11 :: Update at 2019.01.12
import java.text.DecimalFormat;
import java.util.Arrays;
// actial class
public class harj1_2 {
  // Calling of imported DecimalFormat-class and "variable" for it
  private static DecimalFormat _round = new DecimalFormat(".##");
  // Actual main program
  public static void main(String[] args) {
    // Printing first line and statement purpose of program
    System.out.println(":: Lasketaan ympyrän ala");
    // user input for radius
    // User input for unit of measurement
    System.out.print("Syötä haluamasi SI-mittayksikkö, esimerkiksi mm, metri tai km: ");
    String _SI = Reader.readString();
    String[] _SIvalues = {"mm", "millimetri", "senttimetri", "cm", "m", "metri", "km", "kilometri"};
    // Checking of user inputs..
    switch(_SI) {
      case isEmpty():
        System.out.println("Syötä mittayksikkö");
        break;
      case ArrayUtils.contains(_SIvalues, _SI):
        // user input for radius
        System.out.print("Syötä säde: ");
        double _radius = Reader.readDouble();
        double _area = Math.PI * (_radius * _radius);
        // Printing out user inpuied radius and then sum of area from it
        System.out.println("Ympyrän säde on: " + "\t" + _round.format(_radius) + " " + _SI);
        System.out.println("Ympyrän pinta-ala on: " + "\t" + _round.format(_area) + " " + _SI + "2");
        break;
    }
    // if(_SI != null && !_SI.isEmpty()) {
    //   if(S)
    //   // user input for radius
    //   System.out.print("Syötä säde: ");
    //   double _radius = Reader.readDouble();
    //   double _area = Math.PI * (_radius * _radius);
    //   // Printing out user inpuied radius and then sum of area from it
    //   System.out.println("Ympyrän säde on: " + "\t" + _round.format(_radius) + " " + _SI);
    //   System.out.println("Ympyrän pinta-ala on: " + "\t" + _round.format(_area) + " " + _SI + "2");
    // } else {
    //   System.out.println("Metsään meni");
    // }
  }
}
