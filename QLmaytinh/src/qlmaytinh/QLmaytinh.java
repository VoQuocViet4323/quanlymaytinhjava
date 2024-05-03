/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qlmaytinh;
import java.sql.*;

public class QLmaytinh {
    public static Connection KetnoiCSDL() throws SQLException{
        Connection kn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlmaytinh", "root", "");
        return kn;
    }
}
