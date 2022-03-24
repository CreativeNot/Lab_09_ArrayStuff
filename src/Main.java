import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
        Random rnd = new Random();

        int[] dataPoints = new int[100];
        int min = dataPoints[0];
        int max = dataPoints[0];
        double avg = 0;
        int sum = 0;


        for (int r = 0; r < dataPoints.length; r++)
        {
            dataPoints[r] = rnd.nextInt(101);
        }

        for(int r:dataPoints)
        {
            System.out.printf("%1d" + " | ",r);
        }

        for(int r:dataPoints)
        {
            sum += r;
        }
        avg = sum / 100;
        System.out.println("\nThe average of the random data set is: " + avg);





    }
}
