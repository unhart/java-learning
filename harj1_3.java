// Java-learning
// Anton Hussi :: 17TVDO02 :: 15DAPT232.01
// Created at 2019.01.11 :: Update at 2019.01.12
// Harjoitus 1-3 | Bensaa suonissa
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
// actial class
public class harj1_3 {
  // Variables for class
  static String[] _errorMSG = {"Virhe:", "Annappas decimaaleina", "", "Tarkista syötteesi"};
  private static DecimalFormat _round = new DecimalFormat("#.##");
  // Actual main program
  public static void main(String[] args) {
    // Printing first line and statement purpose of program
    //DecimalFormat _round = new DecimalFormat(".##");
//    DecimalFormatSymbols _symbol = new DecimalFormatSymbols(fi);

    // Calling of imported DecimalFormat-class and "variable" for it
    System.out.println(":: Naftalaskuri, 0.1B");
    System.out.println("Pekan rahat oli tiukissa, kun Elina tahtoi rahaa Moskovan torille ja naftaa pitäisi ostaa Ladaan.");
    // Asking user input for a couple parameters
    System.out.print("Syötä päivän bensanhinta (anna desimaaleina): " + "\t\t\t");
    double _GASprice = Reader.readDouble();
    double _GASprefor = Double.valueOf(_GASprice);
    Integer _GASformaz = Integer.valueOf(_GASprefor.intvalue());
//    Scanner _GASformat = new Scanner(_GASformaz);
    // Checking of user inputs..
    if(_GASformaz == (int)_GASformaz) {
//    if(_GASprice == Double.valueOf(_GASprice)) {
        // user input for radius
        System.out.print("Päivän lompakon sisältö (kokonaislukuna tai desimaaleina): " + "\t");
        double _GASwallet = Reader.readDouble();
        System.out.println("\r");
        if(_GASwallet == Double.valueOf(_GASwallet)) {
          // Printing out answer based on amount of money and divede by price of Gas
          double _GASfinal = _GASwallet / _GASprice;
          System.out.println("Pekka saa " + _round.format(_GASwallet) + " Eurolla, about " + _round.format(_GASfinal) + " litraa naftaa Ladaansa");
        } else {
          System.out.println(_errorMSG[0] + _errorMSG[3]);
        }
    } else {
       System.out.println(_errorMSG[0] + _errorMSG[1]);
    }
  }
}
