/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileClasses;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author koropenkods
 */
public class PlayerFileFilter extends FileFilter {
    
    private String expansion;
    private String description;
    
    public PlayerFileFilter (String expansion, String description){
        this.expansion = expansion;
        this.description = description;
    }

    @Override
    public boolean accept(File f) {
        return f.isDirectory() || f.getName().endsWith(expansion);
    }

    @Override
    public String getDescription() {
        return description +" *."+ expansion;
    }
    
}
