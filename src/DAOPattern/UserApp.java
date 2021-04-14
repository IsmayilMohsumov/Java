package DAOPattern;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class UserApp {

    private static DAO<User> userDao;

    public static void main(String[] args) {
        userDao = new UserDAO();
        User user1=getUser(0);
        System.out.println(user1);
        
        
        
        TransactionbuilderPattern trans = new TransactionbuilderPattern.Builder()
                .date(new DateTimeBuilderPattern("15May"))
                .build();
        System.out.println(trans);
    }

    private static User getUser(long id) {
        User user = userDao.getById(id);
        return user;
    }
}
