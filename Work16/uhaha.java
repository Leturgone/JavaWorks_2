package Work16;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class uhaha  extends JFrame {
    private JPanel panel;
    private JButton checkButton;


    public uhaha() {
        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        checkButton = new JButton("Нажмите чтобы ухахануть");
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                new GifPrint("https://media.tenor.com/SO4uduvTyaAAAAAd/frog-jumping.gif");
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new URL("https://www.myinstants.com/en/instant/frog-laughing-meme-41734/?utm_source=copy&utm_medium=share"));
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
                Thread.sleep(clip.getMicrosecondLength() / 1000);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        setSize(350, 200);
        panel.add(checkButton);

        add(panel);
        setTitle("ХАХАХАХХАХАХХХХАХАХАХХАХАХХАХАХАХАХХАХАХАХХАХАХАХХАХАХАХХАх");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new uhaha();
    }
}

