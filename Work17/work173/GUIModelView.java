package Work17.work173;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIModelView extends JFrame {
    private JButton myButton;
    private JLabel myLabel;

    public GUIModelView() {
        setTitle("MVC Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        myButton = new JButton("Нажми на меня!");
        myLabel = new JLabel("Прочитайте что написано на кнопке");

        myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myLabel.setText("Кнопка нажата!!!!");
            }
        });

        getContentPane().add(myButton);
        getContentPane().add(myLabel);

        setLayout(new FlowLayout());
        setSize(350, 200);;
        setVisible(true);
    }

    public void setButtonListener(ActionListener actionListener) {
    }
    public void updateLabel() {
        myLabel.setText("Label updated!");
    }
}
