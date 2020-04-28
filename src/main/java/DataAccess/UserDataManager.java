/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import BusinessLayer.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author johnk
 */
public class UserDataManager extends DataManager {
    
    public UserDataManager() {
        super();
    }
    
    public void create(User userToCreate) throws SQLException {
       
        PreparedStatement sqlStatement = super.getConnection()
                .prepareStatement("INSERT INTO BANK_User (firstName, lastName, emailAddress, password) VALUES(?,?,?,?)");
        
        sqlStatement.setString(1, userToCreate.getFirstName());
        sqlStatement.setString(2, userToCreate.getLastName());
        sqlStatement.setString(3, userToCreate.getEmailAddress());
        sqlStatement.setString(4, userToCreate.getPassword());

        sqlStatement.executeUpdate();
    }
    
    
    public ArrayList<User> getAll() throws SQLException {
        PreparedStatement sqlStatement = super.getConnection()
                .prepareStatement("SELECT [userId], [firstName], [lastName], [emailAddress], [password] FROM [BANK_User]");
                
        ArrayList<User> output = new ArrayList<User>();
        
        ResultSet resultSet = sqlStatement.executeQuery();
        
        while (resultSet.next()) {
            User user = new User(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3), resultSet.getString(4), resultSet.getString(5));
            output.add(user);
        }
        
        return output;
    }
    
    
    public boolean verifyUsernameAndPassword(String username, String password) {
        // query the database by username, verify that password matches, return true or false
        
        return true;
    }
}
