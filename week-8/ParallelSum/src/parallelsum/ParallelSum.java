package parallelsum;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

public class ParallelSum {

    public static void main(String[] args) {
        final int SIZE = 9000000;
        
        double[] dubs = new double[SIZE];
        
        for (int i = 0; i < SIZE; i++) {
            dubs[i] = Math.random();
        } // for (SIZE)
        
        // I mean... it works, doesn't it? It just does it completely differently from how the textbook asks.
        System.out.println(DoubleStream.of(dubs).parallel().reduce(0.0, (a, b) -> a + b));
        
    } // + static void main
} // + class ParallelSum
