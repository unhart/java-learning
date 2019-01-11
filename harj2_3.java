// Java-learning
// Anton Hussi :: 17TVDO02 :: 15DAPT232.01
// Created at 2019.01.11 :: Update at 2019.01.11
// harjoitus 2_3: Seuraavat kymmenen lukua
public class harj2_3 {
  public static void main(String[] args) {
    // punch of variables and user inputs
    int nro_count = 10;
    System.out.print("Syötä arvo: ");
    int nro = Reader.readInt();
    // downgrade harj2_1-filee
    for(int i=nro; i <= nro_count+nro; i++) {
      System.out.println(i);
    }
  }
}
