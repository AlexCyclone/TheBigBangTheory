package com.gmail.babanin.aleksey;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Deque<String> colaQueue = new ArrayDeque<>();
        
        initializeQueue(colaQueue);
        
        System.out.println("Quelle:");
        System.out.println(colaQueue + System.lineSeparator());
        
        System.out.print("Input cola classes:");
        int n = sc.nextInt();
        
        doubleColaMachine(colaQueue, n);
        
        System.out.println("Now quelle:");
        System.out.println(colaQueue);
    }
    
    public static void initializeQueue(Deque<String> colaQueue) {
        colaQueue.addLast("Sheldon");
        colaQueue.addLast("Leonard");
        colaQueue.addLast("Volovitc");
        colaQueue.addLast("Kutrapalli");
        colaQueue.addLast("Penny");
    }
    
    public static void doubleColaMachine(Deque<String> colaQueue, int n) {
        for (int i = 0; i < n; i += 1) {
            colaQueue.addLast(colaQueue.peekFirst());
            colaQueue.addLast(colaQueue.pollFirst());
        }
    }
}
