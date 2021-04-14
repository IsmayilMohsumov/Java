/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MaStaz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Paris
 */
public class Database {
    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    public static List<Transaction> getAll() throws ParseException{
        List<Transaction> list =  new ArrayList<>();
        Transaction trans1 = new Transaction("MyAccount", "CoffeShop", -12,new Category("entartaiment"),new DateOfTranscation(format.parse("2009-12-31"),format.parse("2010-12-31")));
        Transaction trans2 = new Transaction("MyAccount", "Lidl", -62,new Category("market"),new DateOfTranscation(format.parse("2009-12-31"),format.parse("2010-12-31")));
        Transaction trans3 = new Transaction("MyAccount", "Carrefour", -2,new Category("market"),new DateOfTranscation(format.parse("2009-12-31"),format.parse("2010-12-31")));
        Transaction trans4 = new Transaction("MyAccount", "Club", -15,new Category("entartaiment"),new DateOfTranscation(format.parse("2009-12-31"),format.parse("2010-12-31")));
        Transaction trans5 = new Transaction("MyAccount", "Metro", -10,new Category("transport"),new DateOfTranscation(format.parse("2009-12-31"),format.parse("2010-12-31")));
        list.add(trans1);
        list.add(trans2);
        list.add(trans3);
        list.add(trans4);
        list.add(trans5);
        return list;
    }
}
