/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numbertwo;

import java.util.*;

/**
 *
 * @author dudi
 */
class Runner {
    String name;
    int time;

    Runner(String name, int time) {
        this.name = name;
        this.time = time;
    }
}

public class vuRunners {
    public static void main(String[] args) {
        List<Runner> runners = Arrays.asList(
            new Runner("Elena", 341),
            new Runner("Thomas", 273),
            new Runner("Hamilton", 278),
            new Runner("Suzie", 329),
            new Runner("Phil", 445),
            new Runner("Matt", 402),
            new Runner("Alex", 388),
            new Runner("Emma", 275),
            new Runner("John", 243),
            new Runner("James", 334),
            new Runner("Jane", 412),
            new Runner("Emily", 393),
            new Runner("Daniel", 299),
            new Runner("Neda", 343),
            new Runner("Aaron", 317),
            new Runner("Kate", 265)
        );

        // Sort runners based on their time
        runners.sort(Comparator.comparingInt(r -> r.time));

        // Find the fastest and second fastest runners
        Runner fastest = runners.get(0);
        Runner secondFastest = runners.get(1);

        // Print the results
        System.out.println("Fastest runner: " + fastest.name + " with time " + fastest.time + " minutes.");
        System.out.println("Second fastest runner: " + secondFastest.name + " with time " + secondFastest.time + " minutes.");
    }
}