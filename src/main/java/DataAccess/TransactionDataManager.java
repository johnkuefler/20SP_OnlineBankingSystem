/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import BusinessLayer.Transaction;
import java.util.ArrayList;

/**
 *
 * @author johnk
 */
public class TransactionDataManager {
    
    private ArrayList<Transaction> dataStore;
    
    public TransactionDataManager() {
        dataStore = new ArrayList<Transaction>();
    }
    
    
    public ArrayList<Transaction> getByBankAccountNumber(int number)
    {
        ArrayList<Transaction> output = new ArrayList<Transaction>();
        
        for (Transaction transaction : dataStore) {
            if (transaction.getAccountNumber() == number) {
                output.add(transaction);
            }
        }
        
        return output;
    }
    
    
    public void create(Transaction transToCreate)
    {
        this.dataStore.add(transToCreate);
    }
}
