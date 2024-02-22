package dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class compadCopare {
    public static void main(String[] args) {
        ArrayList<Author> authorArrayList = new ArrayList<>();
        authorArrayList.add(new Author("a","a","b"));
        authorArrayList.add(new Author("a","b","c"));
        authorArrayList.add(new Author("a","c","d"));
        authorArrayList.add(new Author("a","d","e"));
        Collections.sort(authorArrayList);
        for(Author a: authorArrayList) {
            System.out.println(a.firstName + " " + a.lastName + " " + a.bookName);
        }

    }
}
class Author implements Comparable<Author>{
    String firstName;
    String lastName;
    String bookName;

    public Author(String firstName, String lastName, String bookName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bookName = bookName;
    }

//    @Override
//    public int comapreTo (Author o) {
//        return this.lastName.compareTo(o.lastName);
//    }

    @Override
    public int compareTo(Author o) {
        return 0;
    }
}