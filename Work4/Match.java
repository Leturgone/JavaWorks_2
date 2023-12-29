package Work4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Match extends JFrame {

    //СОЗДАНИЕ КНОПОК
    JButton Real_Madrid_but = new JButton("Real Madrid");
    JButton AC_Milan_but= new JButton("AC Milan");

    //СОЗДАНИЕ НАДПИСЕЙ
    JLabel Result_lab=new JLabel("Result: 0 X 0");
    JLabel Scorer_lab=new JLabel("Last Scorer: N/A");
    JLabel Winner_lab=new JLabel("Winner: DRAW");

    private void update_Winnner(int firstNum, int secondNum) {
        if (firstNum>secondNum){
            Winner_lab.setText("Winner: Real_Madrid");
        }
        else if (firstNum<secondNum) {
            Winner_lab.setText("Winner: АC Milan");
        }
        else if (firstNum==secondNum){
            Winner_lab.setText("Winner: DRAW");
        }
    }
    Match(){
        super("AC Milan vs Real Madrid");                     //название окна
        JPanel panel = new JPanel();
        add(panel);
        panel.setLayout(new FlowLayout());                        //режим окна
        setSize(600,350);                           //размер окна
        //panel.add(Real_Madrid_but,BorderLayout.EAST);            //добавление кнопки
        //panel.add(AC_Milan_but,BorderLayout.WEST);

        //РАСПОЛОЖЕНИЕ ЭЛЕМЕНТОВ
        setLayout(null);
        setResizable(false);
        Result_lab.setBounds(250,60,100,100);
        Real_Madrid_but.setBounds(0,0,115,350);
        AC_Milan_but.setBounds(480,0,115,350);
        Scorer_lab.setBounds(245,20,150,100);
        Winner_lab.setBounds(245,100,150,100);
        //panel.add(Result_lab,BorderLayout.CENTER);
        //panel.add(Scorer_lab,BorderLayout.CENTER);
        //panel.add(Winner_lab,BorderLayout.CENTER);
        //setVisible(true);                                       //сделать все видимыv


        //ДОБАВЛЕНИЕ В ОКНО
        add(Result_lab);
        add(Real_Madrid_but);

        add(AC_Milan_but);
        add(Scorer_lab);
        add(Winner_lab);
        //ФУНКЦИОНАЛ КНОПОЧЕК

        Real_Madrid_but.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                /* разбиваем текст в JLabel по пробелам с помощью метода split(" "), а затем выбирает второй
                элемент (индекс 1) из полученного массива строк. Далее, метод parseInt() используется
                для преобразования выбранной строки в целочисленное значение.
                Полученное значение присваивается переменной firstNum.*/

                int firstNum = Integer.parseInt(Result_lab.getText().split(" ")[1]);
                int secondNum=Integer.parseInt(Result_lab.getText().split(" ")[3]);
                Result_lab.setText("Result: " + (firstNum + 1) + " X "+(secondNum));
                update_Winnner(firstNum+1,secondNum);
                Scorer_lab.setText("Last Scorer: Real Madrid");
            }
        });

        AC_Milan_but.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int firstNum = Integer.parseInt(Result_lab.getText().split(" ")[1]);
                int secondNum=Integer.parseInt(Result_lab.getText().split(" ")[3]);
                Result_lab.setText("Result: " + (firstNum ) + " X "+(secondNum+1));
                update_Winnner(firstNum,secondNum+1);
                Scorer_lab.setText("Last Scorer: АC Milan");

            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



    public static void main(String[]args) {
        new Match().setVisible(true);
    }
}
