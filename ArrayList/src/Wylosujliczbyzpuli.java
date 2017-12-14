import java.util.ArrayList;
import java.util.Random;

public class Wylosujliczbyzpuli {


    public static int[] losuj(int k,int n)
    {
        Random rand = new Random();
        int wylosowane[]=new int [k];
        ArrayList<Integer> pula = new ArrayList<Integer>();
        for (int i=1; i<=n; i++)
        {
            pula.add(i);
        }
        int conteiner= n;
        for(int j=0; j<k; j++)
        {
            int index=rand.nextInt(conteiner);
            wylosowane[j]=pula.get(index);
            pula.remove(index);
            conteiner--;
        }

        return wylosowane;
    }
}
