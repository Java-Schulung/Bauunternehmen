package employees;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Worker extends Employee {
    public Worker(String firstname, String lastname) {
        super(firstname, lastname);
    }

    public String work() {
        new Thread(new Runnable() {
            public void run() {
                try {
                    File sound = new File("sounds/wc3-peon-says-work-work-only-.wav");
                    Clip clip = AudioSystem.getClip();
                    clip.open(AudioSystem.getAudioInputStream(sound));
                    clip.start();
                    Thread.sleep(2000);
                } catch (Exception ex) {
                    System.out.println("work work without sound");
                }
            }
        }).start();
        return "work work";
    }

    /*
    @Override
    public String toString() {
        return super.toString()
                + "\nProfession: " + "Worker";
    }
    */
}
