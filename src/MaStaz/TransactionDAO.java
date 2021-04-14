/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MaStaz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TransactionDAO {
private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    public static void main(String[] args) throws ParseException {
//        List<Transaction> list = Database.getAllTranscation();

//        System.out.println(Database.getTransaction());
        System.out.println(TransactionDAO.getTransaction("market",format.parse("2009-12-31")));;

    }

    public static List<Transaction> getTransaction(String category,Date startTime) throws ParseException {
        List<Transaction> listOfChoosen = new ArrayList<>();
        List<Transaction> list =Database.getAll();
        Iterator<Transaction> iterator = list.iterator();
        
        while(iterator.hasNext()){
            Transaction transaction = iterator.next();
            if(transaction.getCategory().getCategory().equalsIgnoreCase(category) && transaction.getDate().getStartTime().equals(startTime)){
                listOfChoosen.add(transaction);
            }
            
        }
        
        
        return listOfChoosen;
    }

    
}
