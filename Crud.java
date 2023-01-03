/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;

import java.sql.ResultSet;

/**
 *
 * @author ASUS
 */
public interface Crud {
    void insertData(String data);
    void updateData(String data,String primary);
    void hapusData(String primary);
    ResultSet getData();
    ResultSet getData(String primary);
}
