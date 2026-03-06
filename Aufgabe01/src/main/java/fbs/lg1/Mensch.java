package fbs.lg1;

import java.util.Scanner;

public class Mensch {

    private Scanner scanner;

    public Mensch(Scanner scanner) {
        this.scanner = scanner;
    }

    public int rateZahl() {
        System.out.println("Dein Tipp: ");
        return scanner.nextInt();
    }
}
