import java.util.Random;
import java.util.Scanner;

public class uzd2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int skaitlisKoJamin = rand.nextInt(20);
        skaitlisKoJamin++;
        int skaitlis;

        System.out.println("Tev ir viena iespēja uzminēt skaitli no 1 līdz 20!");
        System.out.println("Ievadi savu skaitli!");
        skaitlis = sc.nextInt();

        if (skaitlisKoJamin == skaitlis) {
            System.out.println("Tu uzminēji skaitli");
        } else if (skaitlisKoJamin > skaitlis) {
            System.out.println("Skaitlis bija lielāks ");
        } else if (skaitlisKoJamin < skaitlis) {
            System.out.println("Skaitlis bija mazāks" );
        } 

        System.out.println("Skaitlis bija " + skaitlisKoJamin);
    }
}