/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.excelprueba;

import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
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
        
        Row row = sheet.createRow(0);
        row.createCell(0).setCellValue("Maria Palomeque");
        row.createCell(1).setCellValue(15);
        row.createCell(2).setCellValue("Mujer");
        row.createCell(3).setCellValue(true);
        
        Row rowone = sheet.createRow(1);
        rowone.createCell(0).setCellValue("Jose Duran");
        rowone.createCell(1).setCellValue(25);
        rowone.createCell(2).setCellValue("Masculino");
        rowone.createCell(3).setCellValue(false);

        try {
            FileOutputStream fileout = new FileOutputStream("Excel.xls");
            book.write(fileout);
            fileout.close();
        } catch (Exception e) {
            System.err.println("Genero un error: " + e.toString());
        
        }
       
    }
    
}
