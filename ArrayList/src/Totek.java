import java.util.ArrayList;
import java.util.Random;

public class Totek {

    public static int[] losuj(int k, int n)
    {
        Random rand = new Random();
        int[] wylosowane = new int[k];
        ArrayList<Integer> lista=new ArrayList<Integer>(n);

        for (int i=1; i<=n; i++) lista.add(i);
        int conteiner=n;
        for (int j=0; j<k; j++)
        {
            int index = rand.nextInt(conteiner);
            wylosowane[j]=lista.get(index);
            lista.remove(index);
            conteiner--;
        }

        return wylosowane;


    }
}
