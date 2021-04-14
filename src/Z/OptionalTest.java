/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Z;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;


public class OptionalTest {

   
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(16,2,4,12,5,6,24);
        IntSummaryStatistics stats = nums.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println("Max: "+stats.getMax());
        System.out.println("Min: "+stats.getMin());
        System.out.println("Sum: "+stats.getSum());
        System.out.println("Avg: "+stats.getAverage());
        
        foo();
    }
    
    public static void foo() {
        Integer aInt  = 2;
        Integer bInt = null;
        Optional<Integer> a = Optional.ofNullable(aInt);
        Optional<Integer> b = Optional.ofNullable(bInt);
        System.out.println(sum(a, b));
    }
    
    public static int sum(Optional<Integer> a , Optional<Integer> b) {
        if(isPresent(a, b)) 
            return a.get()+b.get();
        return 0;
    }
    
    public static   boolean isPresent(Optional<Integer> a,Optional <Integer> b) {
        if(a.isPresent()&&b.isPresent()) 
            return true;
        return false;
    }
    
    
}
