/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LambdaExpression;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static javafx.scene.input.KeyCode.C;

/**
 *
 * @author Paris
 */
public class Main {

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(4, 5, 6, 7, 8);
        values.forEach(i -> System.out.println(i));

        Map<String, String> map = new HashMap<String, String>();

        map.put("A", "Alex");
        map.put("B", "Brian");
        map.put("C", "Charles");

        map.forEach((k, v)-> System.out.println("Key = " + k + ", Value = " + v));

    }
}
