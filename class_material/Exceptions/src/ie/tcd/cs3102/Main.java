package ie.tcd.cs3102;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            m1();
        } catch (Exception e) {
            // Ignore error!
            System.err.println(e);
        } finally {
            System.out.println("Always called!!!");
        }
    }

    static void m1() throws Exception {
        m2();
        throw new Exception("CS3102 Java Class!");
    }

    static void m2() {
        m3();
        int[] arr = new int[1];
        arr[1] = 0;
    }

    static void m3() {
        int[] arr = new int[1];
        //arr[1] = 0;
        try {
            new FileReader("does-not-exist.txt");
        } catch (FileNotFoundException e) {
            System.err.println(e);
        }
        m4();
    }

    static void m4() {
        System.out.println("In m4()");
    }
}
