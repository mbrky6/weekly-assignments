package parallelsum;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class ParallelAdd {
    private double[] list;
    
    public static double parallelSum(double[] list) {
        return(DoubleStream.of(list).parallel().reduce(0.0, (a, b) -> a + b));
        
    } // + static double parallelSum
} // + class ParallelAdd
