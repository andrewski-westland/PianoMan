import sun.audio.AudioStream;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import java.io.File;
import javax.swing.JOptionPane;
import java.io.FileInputStream;

class Tone{
  public static void main(String[] args){
    playMusic("C:\MusicMan");
  }
  public static void makeMusic(String filepath){
    InputStream music;
    try;
    {
      music = new FileInputStream(new File(filepath));
      AudioStream audios = new AudioStream(music);
      AudioPlayer.player.start(audios);
    }
    catch(Exception e)
    {
      JOptionPane.showMessageDialog(null, "Error");
    }
  }
}
