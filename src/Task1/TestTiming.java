package task1;

import java.math.BigInteger;

public class TestTiming {
    public static String testDaffy(int n) {
        Stopwatch timer;
        timer = new Stopwatch();
        //initialize arguments
        timer.start();
        //code to be timed
        Timing.daffy(n);
        timer.stop();
//        return Double.parseDouble(timer.toString());
        return timer.toString();
    }

    public static String testMickey(int n) {
        Stopwatch timer;
        int[] arr = Timing.randomarr(n);
        timer = new Stopwatch();
        //initialize arguments
        timer.start();
        Timing.mickey(arr);
        //code to be timed
        timer.stop();
//        return Double.parseDouble(timer.toString());
        return timer.toString();
    }

    public static String testMinnie(int n) {
        Stopwatch timer;
        int[] arr = Timing.randomarr(n);
        timer = new Stopwatch();
        //initialize arguments
        timer.start();
        Timing.minnie(arr);
        //code to be timed
        timer.stop();
//        return Double.parseDouble(timer.toString());
        return timer.toString();
    }

    public static String testGoofy(int n) {
        Stopwatch timer;
        int[] arr = Timing.randomarr(n);
        timer = new Stopwatch();
        //initialize arguments
        timer.start();
        Timing.goofy(arr);
        //code to be timed
        timer.stop();
//        return Double.parseDouble(timer.toString());
        return timer.toString();
    }

    public static String testPluto(int n) {
        Stopwatch timer;
        int[] arr = Timing.randomarr(n);
        timer = new Stopwatch();
        //initialize arguments
        timer.start();
        Timing.pluto(arr);
        //code to be timed
        timer.stop();
//        return Double.parseDouble(timer.toString());
        return timer.toString();
    }

    public static String testGyro(int n) {
        Stopwatch timer;
        int[] arr = Timing.randomarr(n);
        timer = new Stopwatch();
        //initialize arguments
        Timing.pluto(arr);

        timer.start();
        Timing.gyro(arr);
        //code to be timed
        timer.stop();
//        return Double.parseDouble(timer.toString());
        return timer.toString();
    }

    public static String testFact(int n) {
    	
    	Stopwatch timer;
        timer = new Stopwatch();
        BigInteger bign = BigInteger.valueOf((int) n);
        //initialize arguments
        timer.start();
        //code to be timed
        Timing.fact(bign.intValue());
        timer.stop();
        //return Double.parseDouble(timer.toString());
        return timer.toString();
        return "";
    }

    public static String testDonald(int n) {
        Stopwatch timer;
        timer = new Stopwatch();
        //initialize arguments
        timer.start();
        //code to be timed
        Timing.donald(n);
        timer.stop();
//        return Double.parseDouble(timer.toString());
        return timer.toString();
    }

    public static void main(String args[]) {
        for(int i = 30; i <= 44; i++) {
            System.out.println(testDaffy(i));
        }

        for(int i = 30; i <= 44; i++) {
            System.out.println(testDonald(i));
        }

        for(int i = 1000; i <= 8192000; i *= 2) {
            System.out.println(testMickey(i));
        }

        for(int i = 1000; i <= 256000; i *= 2) {
            System.out.println(testMinnie(i));
        }

        for(int i = 1000; i <= 256000; i *= 2) {
            System.out.println(testGoofy(i));
        }

        for(int i = 1000; i <= 256000; i *= 2) {
            System.out.println(testPluto(i));
        }

        for(int i = 1000; i <= 256000; i *= 2) {
            System.out.println(testGyro(i));
        }
        
        for(int i = 1000; i <= 64000; i *= 2) {
        	System.out.println(testFact(i));
        }
    }
}