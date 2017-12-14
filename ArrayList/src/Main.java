import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wybierz z ilu liczb chcesz losować: ");
        int n = scan.nextInt();
        System.out.println("Wybierz ile liczb chcesz losować z tej puli: ");
        int k = scan.nextInt();
        int[] wylosowane = Wylosujliczbyzpuli.losuj(k,n);
        System.out.println(Arrays.toString(wylosowane));2




        /*  ArrayList<String> wyraz = new ArrayList<String>(20);

        wyraz.add("to");
        wyraz.add("jest");
        wyraz.add("nasza");
        wyraz.add("wspaniala");
        wyraz.add("lista");
        wyraz.add("hehe");

        for(String s: wyraz) System.out.print(s+" ");
        System.out.println();
        wyraz.add(1,"nie");
        wyraz.remove(0);


        for(String s: wyraz) System.out.print(s+" ");
        System.out.println(wyraz.contains("nie"));
        System.out.println(wyraz.contains("niee"));
        System.out.println(wyraz.indexOf("hehe")); */


    }
}
