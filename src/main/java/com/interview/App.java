package com.interview;

import java.io.PrintStream;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        String x = "Hello World!";
        try (PrintStream out = System.out) {
            out.println(x);
        }
    }
}
