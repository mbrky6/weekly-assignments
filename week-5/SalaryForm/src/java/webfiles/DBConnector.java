package webfiles;

import java.sql.*;
import java.util.LinkedList;

public class DBConnector {
    private String url;
    private String username;
    private String password;

    public DBConnector() {
    } // + DBConnector (empty)

    public DBConnector(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    } // + DBConnector
    
    public int addData(String table, String[] fields, Object[] values) {
        // insert into salary (firstName, lastName, salary, rank) Values ("", "" , , "");
        String insertQuery = "INSERT INTO " + table + "(";
        int result = -99;
        
        for (int i = 0; i < fields.length; i++) {
            insertQuery += fields[i];
            if (i < fields.length - 1) {
                insertQuery += ",";
            } // if
            else {
                insertQuery += ")";
            } // else
        } // for
        
        insertQuery += " VALUES(";
        
        for (int i = 0; i < values.length; i++) {
            try {
                int temp = (int)values[i];
                insertQuery += temp;
            } // try
            catch (Exception e) {
                insertQuery += "\"" + values[i] + "\"";
            } // catch
            
            if (i < values.length - 1) {
                insertQuery += ",";
            } // if
            else {
                insertQuery += ");";
            } // else
        } // for
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            result = stmt.executeUpdate(insertQuery);
            stmt.close();
            conn.close();
            System.out.println("Successfully connected to database");
        } // try
        catch (Exception e){
            System.out.println("Unable to connect to database");
            System.out.println(e);
        } // catch Exception
        
        System.out.println(insertQuery);
        return result;
    } // + int addData
    
    public LinkedList<Record> collectData(String table, String[] fields, String condition) {
        // SELECT Field, Field, etc FROM Table WHERE Condition
        LinkedList<Record> list = new LinkedList<>();
        String selectQuery = "SELECT ";
        
        for (int i = 0; i < fields.length; i++) {
            selectQuery += fields[i];
            if (i < fields.length - 1) {
                selectQuery += ",";
            } // if
            else {
                selectQuery += " FROM ";
            } // else
        } // for
        
        selectQuery += table;
        
        if (!condition.equals("")) {
            selectQuery += " WHERE ";
            selectQuery += condition + ";";
        } // if (condition exists)
        
        
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery(selectQuery);
            
            while (results.next()) {
                Record temp = new Record();
                temp.setId(results.getInt(1));
                temp.setFirstName(results.getString(2));
                temp.setLastName(results.getString(3));
                temp.setSalary(results.getInt(4));
                temp.setRank(results.getString(5));
                list.add(temp);
            } // while (still more results)
            
            stmt.close();
            conn.close();
            
        } // try
        catch (Exception e){
            System.out.println("Unable to connect to database");
            System.out.println(e);
        } // catch Exception
        
        System.out.println(selectQuery);
        return list;
    } // + LinkedList<Record> collectData
    
} // + class DBConnector