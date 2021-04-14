

package SafeME;

public class SenderAccount extends Accounts{

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }
    
    @Override
    void check() {
    }
    
}
