/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessonException;

import java.io.File;
import java.io.FilenameFilter;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Диман
 */
public class Less1 {
    public static void main(String[] args) {
        File dir = new File("C:/");
        
        HashSet<String> exeptions = new HashSet();
        int index=0;
        
        //CustomFilter filter = new CustomFilter("exe");
        
        for (String name: dir.list()) {
            File newFile = new File(dir.getAbsoluteFile() +"\\"+ name);            
            index = name.lastIndexOf(".");
            
          if (newFile.isFile() &&  index != -1){
              exeptions.add(name.substring(index+1, name.length()).toLowerCase());
          }
        }
        System.out.println("Статистика по итогам: ");
        for (String name: exeptions) {
            CustomFilter newfilter = new CustomFilter(name);
            System.out.println("-"+name+": "+ dir.listFiles(newfilter).length);
        }
        
    }
}

class CustomFilter implements FilenameFilter{    
    private String exept;
    
    public CustomFilter(String exept){
        this.exept = exept;
    }
    
    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(exept);
    }
    
}
