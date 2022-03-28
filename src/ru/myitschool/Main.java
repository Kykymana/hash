package ru.myitschool;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

class MySet{
    ArrayList<Integer> set = new ArrayList<Integer>();
    MySet(){}
    boolean contains(int n){
        if (set.contains(n) == true){
            return true;
        }
        else {
            return false;
        }
        }
    void remove(int n){
        set.remove(set.indexOf(n));
    }
    void add(int n){
        if (!set.contains(n)){
            this.set.add(n);
        }
    }

    @Override
    public String toString() {
        return String.valueOf(set);
    }
}

class Test{
    int a, b;

    public Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return a == test.a && b == test.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}

public class Main {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.
    }
}
