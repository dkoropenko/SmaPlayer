/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smaplayer;

import java.io.Serializable;
import smaplayer.gui.MainFrame;
import smaplayer.gui.Playlist;

/**
 *
 * @author Nick
 */
public class SmaPlayer implements Serializable{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        Playlist playlist = new Playlist();        
        MainFrame window = new MainFrame(playlist);        
        window.setVisible(true);
    }
    
}
