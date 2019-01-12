// Java-learning
// Anton Hussi :: 17TVDO02 :: 15DAPT232.01
// Created at 2019.01.11 :: Update at 2019.01.11
// harjoitus 2_2: sata satunnaislukua
public class harj2_2 {
  public static void main(String[] args) {
    // punch of variables and user inputs
    System.out.print("Syötä montako kertaa haluat tulostaa tekstin: ");
    int var_count = Reader.readInt();
    System.out.print("Syötä tulostettava teksti: ");
    String var_string = Reader.readString();

    int i = 0;
    while(i < var_count) {
        System.out.println(var_string);
        i++;
    }
  }
}
