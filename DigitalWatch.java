import java.applet.Applet;
import java.awt.*;
import java.util.Calendar;

public class DigitalWatch extends Applet implements Runnable {
    Thread t = null;
    int hours = 0, minutes = 0, seconds = 0;
    String timeString = "";

    public void init() {
        setBackground(Color.white);
    }

    public void start() {
        t = new Thread(this);
        t.start();
    }

    public void run() {
        try {
            while (true) {
                Calendar cal = Calendar.getInstance();
                hours = cal.get(Calendar.HOUR_OF_DAY);
                if (hours > 12) hours -= 12;
                minutes = cal.get(Calendar.MINUTE);
                seconds = cal.get(Calendar.SECOND);

                timeString = hours + ":" + minutes + ":" + seconds;

                repaint();
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString(timeString, 30, 30);
    }
}
