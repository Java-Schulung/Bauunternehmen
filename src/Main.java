import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        //Tests.testMaterial();
        Tests.testEmployees();
    }
/*
    static {
        new Thread(new Runnable() {
            // The wrapper thread is unnecessary, unless it blocks on the
            // Clip finishing; see comments.
            public void run() {
                try
                {
                    File f = new File("sounds/wc3-peon-says-work-work-only-.wav");
                    Clip clip = AudioSystem.getClip();
                    clip.open(AudioSystem.getAudioInputStream(f));
                    clip.start();
                } catch (Exception exc) {
                    exc.printStackTrace(System.out);
                }
            }
        }).start();
        try {
            Thread.sleep(2000);
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }

 */
}