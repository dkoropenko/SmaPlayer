/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileClasses;

import fileClasses.FileUtils;
import java.io.Serializable;

/**
 *
 * @author koropenkods
 */
public class Mp3 implements Serializable{
    
    private String songName;
    private String songPatch;
    
    public Mp3(String name, String patch){
        songName = name;
        songPatch = patch;
    }
    
    public void setSongName(String name){
        songName = name;
    }
    public void setSongPatch(String patch){
        songPatch = patch;
    }
    
    public String getSongName(){
        return songName;
    }
    public String getSongPatch(){
        return songPatch;
    }
    
    public String toString(){
        return FileUtils.getFileName(songName);
    }
}
