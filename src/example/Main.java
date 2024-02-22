package example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("Strawberry");
        System.out.println(fruits);

        System.out.println(fruits.get(0));
        System.out.println(fruits.get(1));
        System.out.println(fruits.get(2));

        System.out.println(fruits.set(2, "apple"));
        System.out.println(fruits.set(1, "banana"));
        System.out.println(fruits.set(0, "Strawberry"));

        fruits.remove((Integer)1);
        System.out.println(fruits);

        fruits.remove("apple");
        System.out.println(fruits);

        System.out.println(fruits.size());
        System.out.println(fruits.remove("banana"));
        System.out.println(fruits.size());

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("Strawberry");

        for(int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i) + " ");
        }

        for(int i = 0; i < fruits.size(); i++) {
            fruits.remove(Integer.valueOf(3));
        }

        System.out.println(fruits);
        Collections.sort(fruits);
        System.out.println(fruits);

        uniqueInt();
    }

    public static void uniqueInt() {
        Scanner console = new Scanner(System.in);
        int input;
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter digit");
            input = console.nextInt();
            if (integers.contains(input)){
                integers.add(input);
            }
        }
        Collections.sort(integers);
        System.out.println(integers);
    }
}