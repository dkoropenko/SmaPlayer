/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smaplayer;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;


public class SmaPlayer{
    private String playedSong;
    private double volumeValue = 50;
    
    private BasicPlayer player = new BasicPlayer();
        
    public void play(String patch){
        try {            
            if (playedSong != null && player.getStatus() == BasicPlayer.PAUSED){
                player.resume();
                return;
            }
            
            playedSong = patch;
            File mp3 = new File(playedSong);
            
            player.open(mp3);
            player.play();
            player.setGain(volumeValue);
            
        } catch (BasicPlayerException ex) {
            Logger.getLogger(SmaPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    
    public void pause(){
        try {
            if (player.getStatus() == BasicPlayer.PLAYING)
                player.pause();
        } catch (BasicPlayerException ex) {
            Logger.getLogger(SmaPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void stop(){
        try {
            player.stop();
        } catch (BasicPlayerException ex) {
            Logger.getLogger(SmaPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setVolume(int currentVolume){
        this.volumeValue = (double) currentVolume;
    }
}
