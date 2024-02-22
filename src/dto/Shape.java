package dto;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Shape{
    public static void main(String[] args) {
        Shape1 staticShape = new Shape1();
        staticShape.draw();

        Shape1 dynamicShape = getRandomShape();
        dynamicShape.draw();

        int[] array = {11, 343,545453,234,12223};
        Arrays.sort(array);
        System.out.println("the sorted array");
        System.out.println(Arrays.toString(array));
        String[] names = {"Joe", "kevin", "john", "Smith"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        ArrayList<String> a = new ArrayList<>();
        a.add("apple");
        a.add("banana");
        a.add("AppPlE");
        Collections.sort(a);
        System.out.println(a);

    }
    static Shape1 getRandomShape() {
        if (Math.random() < 0.5) {
            return new Circle();
        } else {
            return new Square();
        }
    }
}


class Shape1 {
    void draw(){
        System.out.println("Draws a shape");
    }
}
class Circle extends Shape1 {
    void draw(){
        System.out.println("Draws a Cricle");
    }
}
class Square extends Shape1 {
    void draw(){
        System.out.println("Draws a Square");
    }
}
