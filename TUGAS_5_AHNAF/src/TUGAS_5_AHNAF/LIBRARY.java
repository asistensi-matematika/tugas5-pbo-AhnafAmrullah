/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS_5_AHNAF;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Ahnaf
 */
public class LIBRARY {

    public LIBRARY() {
    }
    public void info(){
        
    }
     public static void header(String nama_file_txt){
        File file = new File(nama_file_txt);
        String encoding = "utf-8";
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(file), encoding)) {
            int data = isr.read();
            while (data != -1) {
                System.out.print((char) data);
                data = isr.read();
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
