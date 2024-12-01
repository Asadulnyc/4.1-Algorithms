import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static Scanner s;
    public static void main(String[] args) throws FileNotFoundException {
        f = new File("Numbers.txt");
        int odds = odds();
        int evens = evens();
        int twoDigit = twoDigit();
        System.out.println("Odd Numbers: " + odds);
        System.out.println("Even Numbers: " + evens);
        System.out.println("Two Digit Numbers: " + twoDigit);
        System.out.println("Greater than 500 Numbers: " + fiveHundred());
        System.out.println("Greatest Number: " + greatest());
        System.out.println("Least Number: " + least());
        System.out.println("Sum: " + sum());
        System.out.println("Arithmetic Mean Average: " + mean());
        System.out.println("Mode: " + mode());
        System.out.println("Our purpose is to create beauty.");
        s.close();
    }

    public static int odds() throws FileNotFoundException{
        s = new Scanner(f);
        int odds = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 != 0)
                odds++;
        }
        return odds;
    }
    
    public static int evens() throws FileNotFoundException{
        s = new Scanner(f);
        int evens = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 == 0)
                evens++;
        }
        return evens;
    }

    public static int twoDigit() throws FileNotFoundException{
        s = new Scanner(f);
        int twoDigit = 0;
        while (s.hasNext()) {
            if (s.nextInt() > 9 && s.nextInt() < 100)
                twoDigit++;
        }
        return twoDigit;
    }

    public static int fiveHundred() throws FileNotFoundException{
        s = new Scanner(f);
        int fiveHundred = 0;
        while (s.hasNext()) {
            if (s.nextInt() > 500)
                fiveHundred++;
        }
        return fiveHundred;
    }
    
    public static int greatest() throws FileNotFoundException{
        s = new Scanner(f);
        int greatest = s.nextInt();
        while (s.hasNext()) {
            if (s.nextInt() > greatest)
                greatest = s.nextInt();
        }
        return greatest;
    }

    public static int least() throws FileNotFoundException{
        s = new Scanner(f);
        int least = s.nextInt();
        while (s.hasNext()) {
            if (s.nextInt() < least)
                least = s.nextInt();
        }
        return least;
    }
    
    public static int sum() throws FileNotFoundException{
        s = new Scanner(f);
        int sum = 0;
        while (s.hasNext()) {
            sum+= s.nextInt();
        }
        return sum;
    }

    public static double mean() throws FileNotFoundException{
        s = new Scanner(f);
        int length = 0;
        int sum = 0;
        while (s.hasNext()) {
            sum+= s.nextInt();
            length++;
        }
        double mean = (double) sum/length;
        mean = mean*1000;
        mean += 0.5;
        mean = (int) mean;
        mean = (double) mean/1000;
        return mean;
    }

    public static int mode() throws FileNotFoundException{
        s = new Scanner(f);
        int num = 0;
        int tempNum = 0;
        int total = 0;
        int tempTotal = 0;
        while (tempNum < 999) {
            tempTotal = 0;
            Scanner rebound = new Scanner(f);
            while(rebound.hasNext()) {
                if (rebound.nextInt() == tempNum) tempTotal++;
            }
            rebound.close();
            if (tempTotal>total) {
                num = tempNum;
                total = tempTotal;
            }
            tempNum++;
        }
        return num;
    }
}