/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Panyi
 */
public class Traitement extends JFrame{
    public static void main(String[] args) throws SQLException {
       Authentification login = new Authentification();
       login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       login.setVisible(true);
       login.setLocationRelativeTo(null);
    }
}
