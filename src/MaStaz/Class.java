package MaStaz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Class {
private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
private static Integer totalAmount =0;
    public static void main(String[] args) throws ParseException {

        
        
        Date date = format.parse("2009-12-31");
        Date date2 = format.parse("2009-12-31");
        
        
//        Transaction trans = TransactionDAO.getTransaction("");
        Class.getBalanceByCategoryInPeriod( "market", date, null);
    }

    public static void getBalanceByCategoryInPeriod( String category, Date startTime, Date endTime) throws ParseException {
        List<Transaction> list =TransactionDAO.getTransaction(category, startTime);
        if(list.isEmpty()){
            System.out.println("Sorry we could not find any data...s");
        }else{
             Iterator<Transaction> iterator = list.iterator();
        
        while(iterator.hasNext()){
            Transaction transaction = iterator.next();
            printTransaction(transaction);
            System.out.println("Total amount:" + totalAmount);
        }
        }
            
        
        
    }
    public static void printTransaction(Transaction transaction){
        
        System.out.println("Dear Customer on "+transaction.getDate().getStartTime() + "\n"
                + "Target Account : " + transaction.getTargetAccount() +"\n"
                + "Amount : " + transaction.getAmount());
        totalAmount += transaction.getAmount();
        System.out.println("");
    }

}
