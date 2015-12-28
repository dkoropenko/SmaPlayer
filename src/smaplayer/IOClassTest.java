/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smaplayer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author koropenkods
 */
public class IOClassTest {
    
    public static void main(String[] args){
        
        try{
            BufferedReader in = new BufferedReader(new FileReader("C:/file.txt"));
            in.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Файл не наден");
        }
        catch (IOException e){
            System.out.println("Не могу закрыть поток");
        }
        
        
    }
    
}
