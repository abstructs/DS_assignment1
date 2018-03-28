package Task1;

public class TestTiming {
    public static void main(String args[]) {
        Stopwatch timer;
        Timing t;
        timer = new Stopwatch();
        //initialize arguments
        timer.start();
        t = new Timing();

        //code to be timed
        t.daffy(10);

        timer.stop();
        System.out.println(timer);
    }
}