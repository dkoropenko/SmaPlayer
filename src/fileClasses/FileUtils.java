/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.swing.JFileChooser;
import javax.tools.FileObject;

/**
 *
 * @author koropenkods
 */
public class FileUtils implements Serializable{
    
    public final static String MP3_FILES_EXP = "mp3";
    public final static String MP3_FILES_DESC = "Музыкальные файлы";
    public final static String PLS_FILES_EXP = "pls";
    public final static String PLS_FILES_DESC = "Файлы плейлиста";
    
    public static void setFileFilter(JFileChooser window, PlayerFileFilter filter){
        window.removeChoosableFileFilter(window.getFileFilter());
        window.setFileFilter(filter);
        window.setSelectedFile(new File(""));
    }
    
    public static String getFileName(String name){
        File file = new File(name);
        String result;
        
        int lastDotIndex = file.getName().lastIndexOf(".");
        result = name.substring(0, lastDotIndex);        
        
        if (result.length() > 30){
            result = result.substring(0, 25) + "...";
        }        
        return result;
    }
    
    public static String getFileExp(String name){
        File file = new File(name);
        String result;
        
        int lastDotIndex = file.getName().lastIndexOf(".");
        
        return result = name.substring(lastDotIndex+1, name.length());
    }
    
    public static void serialize (Object obj, String fileName){
        try{
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.flush();
            oos.close();
            fos.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
    
    public static Object deserialize(String fileName){
        try{
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = (Object) ois.readObject();
            fis.close();
            return obj;
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
        catch (IOException | ClassNotFoundException e){
            System.out.println(e);
        }
        
        return null;
    }
}
