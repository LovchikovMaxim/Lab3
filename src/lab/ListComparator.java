package lab;

import java.util.*;

public class ListComparator {
    private LinkedList<Integer> lL;
    private ArrayList<Integer> aL;

    public ListComparator() {
        lL = new LinkedList<>();
        aL = new ArrayList<>();
    }

    private double addEvaluationLL(int amount) {
        Random random = new Random();
        long start = System.nanoTime();
        while (lL.size() < amount) {
            lL.add(random.nextInt(1000));
        }
        long end = System.nanoTime();
        return end - start;
    }

    private double addEvaluationAL(int amount) {
        Random random = new Random();
        long start = System.nanoTime();
        while (aL.size() < amount) {
            aL.add(random.nextInt(1000));
        }
        long end = System.nanoTime();
        return end - start;
    }

    private double getEvaluationLL() {
        long start = System.nanoTime();
        for (int i = 0; i < lL.size(); i++) {
            lL.get(i);
        }
        long end = System.nanoTime();
        return end - start;
    }

    private double getEvaluationAL() {
        long start = System.nanoTime();
        for (int i = 0; i < aL.size(); i++) {
            aL.get(i);
        }
        long end = System.nanoTime();
        return end - start;
    }

    private double containsEvaluationLL() {
        long start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            lL.contains(i);
        }
        long end = System.nanoTime();
        return end - start;
    }

    private double containsEvaluationAL() {
        long start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            aL.contains(i);
        }
        long end = System.nanoTime();
        return end - start;
    }

    private double removeEvaluationLL() {
        long start = System.nanoTime();
        while (!lL.isEmpty()) {
            lL.remove(0);
        }
        long end = System.nanoTime();
        return end - start;
    }

    private double removeEvaluationAL() {
        long start = System.nanoTime();
        while (!aL.isEmpty()) {
            aL.remove(0);
        }
        long end = System.nanoTime();
        return end - start;
    }

    public void compare(int amount) {
        System.out.printf("%-15s %-10s %-15s %-15s%n", "Collection", "Method", "Operations", "Time (ns)");

        System.out.printf("%-15s %-10s %-15d %-15.3f%n", 
            "LinkedList", "add", amount, addEvaluationLL(amount));
        System.out.printf("%-15s %-10s %-15d %-15.3f%n", 
            "ArrayList", "add", amount, addEvaluationAL(amount));

        System.out.printf("%-15s %-10s %-15d %-15.3f%n", 
            "LinkedList", "get", amount, getEvaluationLL());
        System.out.printf("%-15s %-10s %-15d %-15.3f%n", 
            "ArrayList", "get", amount, getEvaluationAL());

        System.out.printf("%-15s %-10s %-15d %-15.3f%n", 
            "LinkedList", "contains", amount, containsEvaluationLL());
        System.out.printf("%-15s %-10s %-15d %-15.3f%n", 
            "ArrayList", "contains", amount, containsEvaluationAL());

        System.out.printf("%-15s %-10s %-15d %-15.3f%n", 
            "LinkedList", "remove", amount, removeEvaluationLL());
        System.out.printf("%-15s %-10s %-15d %-15.3f%n", 
            "ArrayList", "remove", amount, removeEvaluationAL());
    }

}