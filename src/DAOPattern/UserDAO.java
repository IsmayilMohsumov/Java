/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAOPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Paris
 */
public class UserDAO implements DAO<User>{
    private List<User> users = new ArrayList<>();

    public UserDAO() {
        users.add(new User("Ismayil","Mohsumov",""));
    }

    @Override
    public User getById(long id) {
        return  users.get((int) id);
    }

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public void add(User user) {
        users.add(user);
    }

    @Override
    public void delete(User t) {
        users.remove(t);
    }

    
    
}
