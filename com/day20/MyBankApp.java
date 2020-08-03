package com.day20;

import java.sql.*;
import java.util.Scanner;

public class MyBankApp {
    private static final Scanner scanner=new Scanner(System.in);
    public static final String DB_NAME="MyDataBase.db";
    public static final String CONNECTION_STRING="jdbc:mysql:\\localhost:3306\\mydatabase?user=root"+ DB_NAME;
    public static final String TABLE_CONTACTS="customer";
    public static final String COLUMN_NAME="name";
    public static final String COLUMN_ADDRESS="address";
    public static final String COLUMN_MOBILE_NUMBER="mobile_number";
    public static final String  COLUMN_PIN="pin";

    public static final String  TABLE_ACCOUNT="account";
    public static final String  COLUMN_NATIONAL_ID="national_id";
    public static final String  COLUMN_BALANCE="balance";
    public static final String  COLUMN_ACCOUNT_TYPE="account_type";


    public static void main(String[] args) {
        try{
            Connection conn = DriverManager.getConnection(CONNECTION_STRING);
            Statement statement =conn.createStatement();

            statement.execute("DROP TABLE IF EXISTS TABLE_CONTACTS");

            statement.execute("CREATE TABLE IF NOT EXISTS TABLE_CONTACTS"+
                    "("+COLUMN_NAME+"text"+
                    COLUMN_ADDRESS+"text"+
                    COLUMN_MOBILE_NUMBER+"integer"+
                    COLUMN_PIN+"integer"+
                    ")");

//            statement.execute("INSERT INTO "+TABLE_CONTACTS +
//                    "("+COLUMN_NAME+","+
//                    COLUMN_ADDRESS+","+
//                    COLUMN_MOBILE_NUMBER+","+
//                    COLUMN_PIN+")"+
//                    "VALUES('luis','kisumu',1234456,1254)");
//            statement.execute("DROP TABLE IF EXISTS TABLE_ACCOUNT");
//
//            statement.execute("CREATE TABLE IF NOT EXISTS TABLE_ACCOUNT"+
//                    "("+COLUMN_NATIONAL_ID+"integer"+
//                    COLUMN_BALANCE+"double"+
//                    COLUMN_ACCOUNT_TYPE+"text"+
//                    ")");
            PreparedStatement preparedStatement;
            System.out.println("Enter Name");
            String name=scanner.next();

            System.out.println("Enter address");
            String idNumber=scanner.next();

            System.out.println("Enter mobile number");
            int num=scanner.nextInt();
            System.out.println("Enter  pin");
            int num1=scanner.nextInt();


            preparedStatement = conn.prepareStatement("INSERT INTO TABLE_CONTACTS(COLUMN_NAME,COLUMN_ADDRESS,COLUMN_MOBILE_NUMBER, COLUMN_PIN) " +
                    "values(?,?,?,?)");
            preparedStatement.setString(1,COLUMN_NAME);
            preparedStatement.setString(2,COLUMN_ADDRESS);
            preparedStatement.setString(3,COLUMN_MOBILE_NUMBER);
            preparedStatement.setString(4,COLUMN_PIN);
            preparedStatement.executeUpdate();

            ResultSet resultSet=statement.executeQuery("SELECT * FROM "+ TABLE_CONTACTS);
            while (resultSet.next()){
                System.out.println(resultSet.getString(COLUMN_NAME)+"\t"+
                        resultSet.getInt(COLUMN_ADDRESS)+"\t"+
                        resultSet.getString(COLUMN_MOBILE_NUMBER)+"\t"+
                        resultSet.getInt(COLUMN_PIN));
            }
            resultSet.close();
            statement.close();
            conn.close();
        }catch (SQLException e){
            System.out.println("something went wrong :"+ e.getMessage());
            e.printStackTrace();
        }
    }

}
