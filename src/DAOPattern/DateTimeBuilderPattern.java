/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAOPattern;

/**
 *
 * @author Paris
 */
public class DateTimeBuilderPattern {
    private String time;

    public DateTimeBuilderPattern(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "DateTime{" + "time=" + time + '}';
    }
    
}
