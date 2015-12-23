/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smaplayer;

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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Playlist playlist = new Playlist();
        
        MainFrame window = new MainFrame(playlist);        
        window.setVisible(true);
    }
    
}
