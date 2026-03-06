package fbs.lg1;

public class Computer {
    private int min = 1;
    private int max = 100;

    public int rateZahl() {
        return (min + max) / 2;
    }

    public void groesser(int rate) {
        min = rate + 1;
    }

    public void kleiner(int rate) {
        max = rate - 1;
    }
}
