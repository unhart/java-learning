// Java-learning
// Anton Hussi :: 17TVDO02 :: 15DAPT232.01
// Created at 2019.01.11 :: Update at 2019.01.11
// harjoitus 2_1: sata satunnaislukua
public class harj2_1 {
  public static void main(String[] args) {
    // punch of variables and user inputs
    System.out.print("Syötä laskettavien lukujen määrä: ");
    int nro_count = Reader.readInt();
    System.out.print("Syötä arvo: ");
    int nro = Reader.readInt();
    System.out.print("Syötä arvoasteikko: ");
    int nro_scale = Reader.readInt();
    // Loop thingie, based on input nro + total number of loops,
    // if user input 100 for count and input 25 as number: it will counting numbers between 25 to 125
    for(int i=nro; i <= nro_count+nro; i++) {
      int RandomNumber = (int)(Math.random() * (nro_scale));
      System.out.println(RandomNumber);
    }
  }
}
