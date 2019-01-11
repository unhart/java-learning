// Java-learning
// Anton Hussi :: 17TVDO02 :: 15DAPT232.01
// Created at 2019.01.11 :: Update at 2019.01.11
public class harj2_0 {
  /* public static void main(String[] args) {
      int i = 1;
      while(i < 101) {
        System.out.println("Arvo on nyt " + i);
        i++;
      }
      */

  public static void main(String[] args) {
    int luku = 0;
    System.out.println("Syötä arvo: ");
    luku = Reader.readInt();
    // Loop thingie
    for(int i=luku; i <= 100; i++) {
      System.out.println(i);
    }
  }
}
