/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeepayrollmgmt;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;


/**
 *
 * @author
 */
public class db {
    
    Connection conn = null;
    public static Connection java_db(){
        
        try{
            
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("C:\\Users\\Shradhya\\Documents\\NetBeansProjects\\EmployeePayrollMgmt\\mydatabase.sqlite");
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
            
        }
    }    
}
