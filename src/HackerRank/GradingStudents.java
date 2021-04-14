/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Paris
 */
public class GradingStudents {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        GradingStudents.gradingStudents(Arrays.asList(4, 73, 67, 38, 33));
        
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        int n = grades.size();
        List<Integer> result = new ArrayList<>();
      
        for (int i = 0; i < n; i++) {
            int elementI = grades.get(i);
            if ((elementI % 5) >= 3 && elementI >= 38) {
                elementI = elementI + (5 - (elementI % 5));
            } else {
                elementI = elementI;
            }
            result.add(elementI);
        }
        System.out.println(result);
        return result;
    }

}
