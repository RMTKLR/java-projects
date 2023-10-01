import java.util.Random;
import java.lang.Math;

public class Main {
    public static void main(String[] args)
    {
        // first task:
        long[] aod = new long[18];
        int z = 19;
        for (int i = 0; i < 18; i++)
        {
            aod[i] = z;
            if (z >= 2) z--;
        }
//        for (int i = 0 ; i < 18 ; i++)
//        System.out.print(aod[i]+",\t");


        // second task:
        Random random = new Random();
        float[] x = new float[13];

        for (int j = 0; j < 13; j++)
        {
            x[j] = random.nextFloat(-12.0f, 8.0f);
//            System.out.println(x[j]+"\t");
        }


        // third task
        float[][] atd = new float[18][13];
        for (int i = 0; i < 18; i++)
        {
            for (int j = 0; j < 13; j++)
            {
                if (aod[i] == 17){
                    double abs = Math.abs(x[j]);
                    double aE = StrictMath.E;
                    double aPow = Math.pow(aE,abs);
                    double a1 = 1 / aPow;
                    double aSin = Math.asin(a1);
                    atd[i][j] = (float) aSin;
                }
                else if (aod[i] == 2 | aod[i] == 3 | aod[i] == 5 | aod[i] == 7 | aod[i] == 10 | aod[i] == 12 | aod[i] == 14 | aod[i] == 18 | aod[i] == 19)
                    atd[i][j] = (float) Math.log10(Math.exp(Math.acos(1 / Math.pow(StrictMath.E, Math.abs(x[j])))));

                else atd[i][j] = (float) Math.pow(Math.exp(Math.acos(Math.exp(x[j]))) / 0.5, 3);
            }
        }

        // fourth task
        for (int i = 0; i < 18; i++)
        {
            for (int j = 0; j < 13; j++)
            {
                System.out.print(atd[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
