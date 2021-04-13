/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.excelprueba;

import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

/**
 *
 * @author crist
 */
public class Main {
    public static void main(String[] args) {
  
        Workbook book = new HSSFWorkbook();
        Sheet sheet = book.createSheet("Hola Java");

        try {
            FileOutputStream fileout = new FileOutputStream("Excel.xls");
            book.write(fileout);
            fileout.close();
        } catch (Exception e) {
            System.err.println("Genero un error: " + e.toString());
        
        }
       
    }
    
}
