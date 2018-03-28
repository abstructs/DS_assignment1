package Task1;

public class TestTiming {
    public static Double testDaffy(int n) {
        Stopwatch timer;
        Timing t;
        timer = new Stopwatch();
        //initialize arguments
        timer.start();
        t = new Timing();
        //code to be timed
        t.daffy(n);
        timer.stop();
        return Double.parseDouble(timer.toString());
    }

    public static Double testDonald(int n) {
        Stopwatch timer;
        Timing t;
        timer = new Stopwatch();
        //initialize arguments
        timer.start();
        t = new Timing();
        //code to be timed
        t.donald(n);
        timer.stop();
        return Double.parseDouble(timer.toString());
    }

    public static void main(String args[]) {
        for(int i = 30; i <= 44; i++) {
            System.out.println(testDaffy(i).toString());
        }

        for(int i = 30; i <= 44; i++) {
            System.out.println(testDonald(i).toString());
        }
    }
}