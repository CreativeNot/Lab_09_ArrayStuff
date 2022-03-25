import java.util.Random;
import java.util.Scanner;

public class LinearScan
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int[] dataPoints = new int[100];
        int userNum = 0;
        int sum = 0;
        int counter = 0;
        int min = 0;
        int max = 0;

        userNum = getRangedInt(in, "Please enter a number between 1-100",1,100);

        for (int r = 0; r < dataPoints.length; r++)
        {
            dataPoints[r] = rnd.nextInt(101);
        }

        for(int r:dataPoints)
        {
            System.out.printf("%1d" + " | ",r);
        }
        for(int r = 0; r < dataPoints.length; r++)
        {
            if (dataPoints[r] == userNum)
            {
                sum = sum + 1;
            }
        }
        System.out.println("\n" + userNum + " was found " + sum + " times.");

        userNum = getRangedInt(in, "Please enter another value between 1-100",1,100);

        for(int r:dataPoints)
        {
            System.out.printf("%1d" + " | ",r);
        }

        for(int e = 0; e < dataPoints.length; e++)
        {
            if (dataPoints[e] == userNum)
            {
                counter += e + 1;
                break;
            }
        }
        System.out.println("\n" + userNum + " was found at position: " + counter);
        min = dataPoints[0];
        max = dataPoints[0];

        for(int e:dataPoints)
        {
            if(e > max)
            {
                max = e;
            }
            if(e < min)
            {
                min = e;
            }
        }

        System.out.println("The max is: " + max + " , the min is: " + min);
        System.out.println("The average of dataPoints is: " + getAverage(dataPoints));






    }
    /**
     * Makes the user enter a range between two values
     * @param pipe input from user
     * @param prompt "Please give a value within the range of numbers"
     * @param low lowest number in range
     * @param high highest number in range
     * @return Returns the number if it is within the range
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retInt = 0;
        String trash;
        boolean keepGoin = false;

        do
        {
            System.out.print("\n" + prompt + ":");
            if(pipe.hasNextInt())
            {
                retInt = pipe.nextInt();
                if(retInt >= low && retInt <= high)
                {
                    keepGoin = true;
                }
                else
                {
                    System.out.println("\nPlease enter a number between " + low + " and " + high + "!");
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("\n" + trash + " is not a valid input, try again!");
            }

        }
        while(!keepGoin);
        return retInt;

    }
    public static double  getAverage(int values[])
    {
        int sum = 0;
        double avg = 0;
        for(int p:values)
        {
            sum += p;
        }
        avg = (double) sum / values.length;
        return  avg;
    }

}

