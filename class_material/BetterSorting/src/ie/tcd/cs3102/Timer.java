package ie.tcd.cs3102;

public class Timer {
    long start;

    Timer() {
        start = System.currentTimeMillis();
    }

    long duration() {
        return System.currentTimeMillis() - start;
    }
}
