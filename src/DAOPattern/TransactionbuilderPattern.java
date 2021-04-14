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
public class TransactionbuilderPattern {
    private DateTimeBuilderPattern date;
    
    
    public static class Builder
    {
        TransactionbuilderPattern transaction =new TransactionbuilderPattern();

        public Builder() {
        }
        public Builder date(DateTimeBuilderPattern time ){
            transaction.date=time;
            return this;
        }
        public TransactionbuilderPattern build(){
            return transaction;
        }
        
        
    }

    @Override
    public String toString() {
        return "Transaction{" + "date=" + date + '}';
    }
    
    
}
