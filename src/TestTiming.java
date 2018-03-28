public class TestTiming {
    public static void main(String args[]) {
        Stopwatch timer = new Stopwatch();
        //initialize arguments
        timer.start();
        Timing t = new Timing();
        t.daffy(10);
        //code to be timed
        timer.stop();
        System.out.println(timer);
    }
}