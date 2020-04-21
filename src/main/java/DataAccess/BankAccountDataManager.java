/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import BusinessLayer.BankAccount;
import java.util.ArrayList;

/**
 *
 * @author johnk
 */
public class BankAccountDataManager {
    
    // this represents a fake database
    private ArrayList<BankAccount> dataStore;
    
    public BankAccountDataManager() {
        this.dataStore = new ArrayList<BankAccount>();
    }
    
    
    public ArrayList<BankAccount> getAll() {
        // query database, e.g. SELECT * FROM BankAccount
        return dataStore;
    }
    
    public void create(BankAccount bankAccountToCreate) {
        // if we were using real databse - INSERT INTO BankAccount ...
        this.dataStore.add(bankAccountToCreate);
    }
}
