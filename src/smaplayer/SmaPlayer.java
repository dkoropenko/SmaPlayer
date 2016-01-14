/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smaplayer;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;


public class SmaPlayer{
    private String playedSong;
    private double volumeValue;
    
    private BasicPlayer player = new BasicPlayer();
    private JLabel songName;
    private JLabel songTime;
    
    public String getPlayedSongName(){
        return this.playedSong;
    }
    
    public void setLabelName(JLabel label){
        this.songName = label;
    }
        
    public void play(String patch){
        try {            
            if (playedSong != null && player.getStatus() == BasicPlayer.PAUSED){
                player.resume();
                return;
            }
            
            playedSong = patch;
            File mp3 = new File(playedSong);
            
            Mp3 song = new Mp3(mp3.getName(), mp3.getPath());
            songName.setText(song.toString());
            
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
    
    public void setVolume(int currentVolume, int maxVolume){
        this.volumeValue = (double) currentVolume;
        
        try {
            if (currentVolume == 0)
                player.setGain((double) currentVolume);
            else
                player.setGain(calcVolume(currentVolume, maxVolume));
        } catch (BasicPlayerException ex) {
            Logger.getLogger(SmaPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int getVolume(){
        return (int)this.volumeValue;
    }
    
    private double calcVolume(int currentVolume, int maxVolume){
        double result = (double) currentVolume/maxVolume;
        return result;
    }
    
    public void changePan(int panValue){
        double result = (double) panValue;
        try {
            if (panValue >= 100){
                result = (result - 100)/100;
            }
            else{
                result = -(100 - result)/100;
            }
            
            player.setPan(result);
        } catch (BasicPlayerException ex) {
            Logger.getLogger(SmaPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
