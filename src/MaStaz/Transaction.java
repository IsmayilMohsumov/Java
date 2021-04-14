package MaStaz;

import java.util.concurrent.atomic.AtomicInteger;

public class Transaction {
    private final Integer balance =1000;
    private Integer id;
    private static int teamIdCounter = 0;
    private String sourceAccount;
    private String targetAccount;
    private Integer amount;
    private Category category=null;
    private DateOfTranscation date;

    

    public Transaction(String sourceAccount, String targetAccount, Integer amount) {
        this.id = ++teamIdCounter;
        this.sourceAccount = sourceAccount;
        this.targetAccount = targetAccount;
        this.amount = amount;
    }

    public Transaction( String sourceAccount, String targetAccount, Integer amount, Category category, DateOfTranscation date) {
        this.id = ++teamIdCounter;
        this.sourceAccount = sourceAccount;
        this.targetAccount = targetAccount;
        this.amount = amount;
        this.category = category;
        this.date = date;
    }

    public Integer getBalance() {
        return balance;
    }

    
    public static int getTeamIdCounter() {
        return teamIdCounter;
    }

    public static void setTeamIdCounter(int teamIdCounter) {
        Transaction.teamIdCounter = teamIdCounter;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public DateOfTranscation getDate() {
        return date;
    }

    public void setDate(DateOfTranscation date) {
        this.date = date;
    }
    
    
    public int getjobid(){
        return this.id;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSourceAccount() {
        return sourceAccount;
    }

    public void setSourceAccount(String sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    public String getTargetAccount() {
        return targetAccount;
    }

    public void setTargetAccount(String targetAccount) {
        this.targetAccount = targetAccount;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" + "id=" + id + ", sourceAccount=" + sourceAccount + ", targetAccount=" + targetAccount + ", amount=" + amount + '}';
    }
    
    
    
    
    
}
