/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import BusinessLayer.User;
import java.util.ArrayList;

/**
 *
 * @author johnk
 */
public class UserDataManager {

    private ArrayList<User> dataStore;
    
    public UserDataManager() {
        this.dataStore = new ArrayList<User>();
    }
    
    public void create(User userToCreate) {
        this.dataStore.add(userToCreate);
    }
    
    public ArrayList<User> getAll() {
        return this.dataStore;
    }
    
    public boolean verifyUsernameAndPassword(String username, String password) {
        // query the database by username, verify that password matches, return true or false
        
        return true;
    }
}
