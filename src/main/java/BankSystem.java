
import BusinessLayer.BankAccount;
import BusinessLayer.BankAccountType;
import BusinessLayer.Transaction;
import BusinessLayer.User;
import DataAccess.BankAccountDataManager;
import DataAccess.TransactionDataManager;
import DataAccess.UserDataManager;
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class BankSystem {
    
    public static void main(String[] args) {
        
        BankAccountDataManager bankAccountDm = new BankAccountDataManager();
        TransactionDataManager transDm = new TransactionDataManager();
        UserDataManager userDm = new UserDataManager();
        
        
        User myUser = new User(1, "John", "Kuefler", "jkuefler@pittstate.edu", "password1");
        
        BankAccount myAcount = new BankAccount(101, "My Checking", 100, BankAccountType.CHECKING, 1);
        
        Transaction myTransaction = new Transaction(1, new Date(), -5, "Coffee",101);
        Transaction myTransaction2 = new Transaction(2, new Date(), -3, "Sandwhich",101);

        
        userDm.create(myUser);
        bankAccountDm.create(myAcount);
        transDm.create(myTransaction);
        transDm.create(myTransaction2);
        
        
        // read everything from database, print out to console
        System.out.println("Reading users from db:");
        ArrayList<User> usersFromDatabase = userDm.getAll();
        for (User dbUser : usersFromDatabase) {
            System.out.println(dbUser);
        }
        
        System.out.println("\nReading bank accounts from db:");
        ArrayList<BankAccount> bankAccountsFromDatabase = bankAccountDm.getAll();
        for (BankAccount dbBankAccount : bankAccountsFromDatabase) {
            System.out.println(dbBankAccount);
        }
        
        System.out.println("\nReading transactions from db:");
        ArrayList<Transaction> dbTransactions = transDm.getByBankAccountNumber(101);
        for (Transaction dbTran : dbTransactions) {
            System.out.println(dbTran);
        }
    }
    
}
