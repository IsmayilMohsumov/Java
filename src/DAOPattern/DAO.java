/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAOPattern;

import java.util.List;

/**
 *
 * @author Paris
 */
public interface DAO<T> {
    
    T getById(long id);
    
    List<T> getAll();
    
    void add(T user);
    
    void delete(T t);
    
    
}
