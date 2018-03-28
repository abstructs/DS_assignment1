package task1;

public class TestTiming {
    public static String testDaffy(int n) {
        Stopwatch timer;
        Timing t;
        timer = new Stopwatch();
        //initialize arguments
        timer.start();
        t = new Timing();
        //code to be timed
        t.daffy(n);
        timer.stop();
//        return Double.parseDouble(timer.toString());
        return timer.toString();
    }

    public static String testDonald(int n) {
        Stopwatch timer;
        Timing t;
        timer = new Stopwatch();
        //initialize arguments
        timer.start();
        t = new Timing();
        //code to be timed
        t.donald(n);
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
    }
}