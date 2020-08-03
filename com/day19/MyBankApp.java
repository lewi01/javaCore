package com.day19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyBankApp {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement ;
        ResultSet resultSet = null;

        try{
            connection = DriverManager.getConnection("jdbc:");
            statement = connection.createStatement();

            resultSet = statement.executeQuery("select * from customer");

            while (resultSet.next()){
                System.out.println(resultSet.getString("full_name"));
            }


        } catch (Exception ex){
            ex.printStackTrace();
        } finally {
            if (connection!=null || resultSet!=null){
                try {
                    connection.close();
                    resultSet.close();
                } catch (Exception ex){

                }

            }

        }


    }
}
