/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smaplayer;

/**
 *
 * @author koropenkods
 */
public class Mp3Container {
    private String songName;
    private String songPatch;
    
    
    public Mp3Container(String name, String patch){
        songName = name;
        songPatch = patch;
    }
    
    public String getName(){
        return songName;
    }
    
    public String getPatch(){
        return songPatch;
    }
    
    public boolean searchSongToName(String name){
        if (name != null && songName.toLowerCase().equals(name.toLowerCase()))
            return true;
        else
            return false;
    }
    
        public boolean searchSongToPatch(String patch){
        if (patch != null && songPatch.toLowerCase().equals(patch.toLowerCase()))
            return true;
        else
            return false;
    } 
}
