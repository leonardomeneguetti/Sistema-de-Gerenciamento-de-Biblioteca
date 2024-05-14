package controller;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public final class DataBaseConnection {
    private Connection connection = null;
    private Statement statement = null;
    private ResultSet resultSet = null;
    private ResultSetMetaData metaData = null;
    
    private final String url = AppConfig.getUrl();
    private final String user = AppConfig.getUser();
    private final String password = AppConfig.getPassword();
    
    private static DataBaseConnection singleton = new DataBaseConnection();
    
    private DataBaseConnection() {
        
    }
    
    public static DataBaseConnection getInstance() {
        return singleton;
    }

    public Connection getConnection() {
        return connection;
    }

    public Statement getStatement() {
        return statement;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public ResultSetMetaData getMetaData() {
        return metaData;
    }
    
    public void connect() throws Exception {
        if (connection == null) {
            connection = DriverManager.getConnection(url, user, password);
        }        
    }
    
    public void createStatement() throws Exception {
        if (connection == null) {
            connect();
        }
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    }
    
    public void executeQuery(String query) throws Exception {
        if(statement == null) {
            createStatement();
        }
        
        resultSet = statement.executeQuery(query);
        metaData = resultSet.getMetaData();
    }
    
    public boolean executeSQL(String sql) throws Exception {
        if(statement == null) {
            createStatement();
        }
        return statement.execute(sql);
    }
    
    public void disconnect() throws Exception {
        if(resultSet != null) {
            resultSet.close();
        }
        if(statement != null) {
            statement.close();
        }
        if (connection != null) {
            connection.close();
        }
        resultSet = null;
        statement = null;
        connection = null;
    }
}