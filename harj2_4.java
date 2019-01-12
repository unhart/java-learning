// Java-learning
// Anton Hussi :: 17TVDO02 :: 15DAPT232.01
// Created at 2019.01.11 :: Update at 2019.01.11
// harjoitus 2_4 : Luvun toisto
public class harj2_4 {
  public static void main(String[] args) {
    // punch of variables and user inputs
    System.out.print("Syötä luku väliltä 1-5: ");
    int nro = Reader.readInt();
    // downgrade harj2_1-filee
    if(nro > 1 && nro < 5) {
      int i = 1;
      while(i < 101) {
        System.out.println("Arvo on nyt " + i);
        i++;
      }

      while(i < 5) {
        System.out.println("Arvo on " + i);
        i++;
      }
    } else {
      System.out.println("Arvo ei ole väliltä 1-5");
      return;
    }

    while(i < 100) {
      System.out.print("Syötä arvo: ");
      int nro = Reader.readInt();
      if(nro >)
    }
  }
}
