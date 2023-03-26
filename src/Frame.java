import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Frame {
    public void frame(){
        Date start = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Actual time: " + formatter.format(start));
        JFrame f = new JFrame();
        f.setSize(200, 200);
        f.setLocation(200, 200);
        Label l = new Label();
        f.add(l);
        f.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                Date end = new Date();
                SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss");
                System.out.println("After releasing key : " + f.format(end));
                long diff = end.getTime() - start.getTime();
                String TimeTaken = String.format("[%s] hours : [%s] mins : [%s] secs",
                        Long.toString(TimeUnit.MILLISECONDS.toHours(diff)),
                        TimeUnit.MILLISECONDS.toMinutes(diff),
                        TimeUnit.MILLISECONDS.toSeconds(diff));
                System.out.println(String.format("Time taken %s", TimeTaken));

            }
        });
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
    }
}
