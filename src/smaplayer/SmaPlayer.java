/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smaplayer;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import smaplayer.gui.MainFrame;
import smaplayer.gui.Playlist;

/**
 *
 * @author Nick
 */
public class SmaPlayer {
    
    private static ArrayList<Mp3Container> pl;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        pl = new ArrayList<>();
        
        pl.add(new Mp3Container("Rob", "D:/"));
        pl.add(new Mp3Container("Bob", "E:/"));
        pl.add(new Mp3Container("Sob", "D:/"));
        pl.add(new Mp3Container("Pob", "C:/"));
        pl.add(new Mp3Container("Pob", "C:/"));
        
        for (int i = 0; i < pl.size(); i++) {
            if(pl.get(i).searchSongToName("Bob")){
                System.out.println("Search to name: "+ pl.get(i).getName());
            }            
                        
            if(pl.get(i).searchSongToPatch("D:/")){
                System.out.println("Search to patch D:/ : "+ pl.get(i).getName());
            } 
        }
        
        //Playlist playlist = new Playlist();        
        //MainFrame window = new MainFrame(playlist);        
        //window.setVisible(true);
    }
    
}
