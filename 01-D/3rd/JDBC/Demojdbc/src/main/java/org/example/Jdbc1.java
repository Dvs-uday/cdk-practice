package org.example;
//import java.util.*;
//import java.lang.*;
//import java.sql.*;
//
//public class Jdbc1{
//    public static void main(String[] args) throws Exception
//    {
//        String url="jdbc:mysql://localhost:3306/uday";
//        String uname="root";
//        String pass="Gnits@01";
//        String query="select sname from students";
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection con =DriverManager.getConnection(url,uname,pass);
//        Statement st=con.createStatement();
//        ResultSet rs=st.executeQuery(query);
//
//        String userdata="";
//        while(rs.next()) {
//            userdata=rs.getInt(1)+ " "+ rs.getString(2);
//
//            System.out.println(userdata);
//        }
//        st.close();
//        con.close();
//
//
//
//    }
//}

import java.sql.*; //importing package

public class Jdbc1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/uday";
        String uname = "root";
        String pass = "Gnits@01";
        String query = "select Rno, sname from students"; // Fetching Rno and sname columns

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //load and register(forname)
            Connection con = DriverManager.getConnection(url, uname, pass); //establishing a connection

            Statement st = con.createStatement();//Data Defination Language (DDL) Statement
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                int rollNumber = rs.getInt("Rno");
                String name = rs.getString("sname");
                String userData = rollNumber + " " + name;

                System.out.println(userData);
            }

            rs.close();
            st.close();
            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC driver not found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQL Exception occurred");
            e.printStackTrace();
        }
    }
}
