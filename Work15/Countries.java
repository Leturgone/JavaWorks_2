package Work15;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

import javax.swing.*;
import java.awt.*;

public class Countries extends JFrame {
    private JComboBox<String> menuComboBox;// Создание списка для меню
    private JTextArea countryInfoTextArea;//создание области для текста про страну

    public Countries() {
        setTitle("Страны");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        menuComboBox = new JComboBox<>();// Инициализация выпадающего списка
        //Добавление пунктов в список
        menuComboBox.addItem("Australia");
        menuComboBox.addItem("China");
        menuComboBox.addItem("England");
        menuComboBox.addItem("Russia");

        countryInfoTextArea = new JTextArea();//Инициализация облатси с текстом
        countryInfoTextArea.setEditable(false);// Запрет редактирования текстовой области


        menuComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedMenu = (String) menuComboBox.getSelectedItem();//получаем выбранный элемент из списка
                String countryInfo = getCountryInfo(selectedMenu);//вызов функции получения инфы про страну
                countryInfoTextArea.setText(countryInfo);//добавляем инфу в текстовую область
            }
        });

        add(menuComboBox, BorderLayout.NORTH);// Добавление списка в верхнюю часть окна

        add(new JScrollPane(countryInfoTextArea), BorderLayout.CENTER);//добавление текста в центр

        setSize(800, 200);
        setResizable(false);
        setVisible(true);
    }

    private String getCountryInfo(String selectedMenu) {
        String countryInfo = "";

        if (selectedMenu.equals("Australia")) {
            countryInfo = "Австралия, официально Австралийское содружество, " +"\n"+
                    "является суверенной трансконтинентальной страной, включающей материковую часть " +"\n"+
                    "Австралийского континента, остров Тасмания и множество небольших островов. ";
        } else if (selectedMenu.equals("China")) {
            countryInfo = "Китайская Народная Республика (КНР) — государство в Восточной Азии. " +"\n"+
                    "Занимает 4-е место в мире по территории среди государств (9 598 962 км²), уступая России, Канаде и США, " +"\n"+
                    "а по численности населения — 1 411 750 000 жителей (без Тайваня, Гонконга и Макао) — второе после Индии.";
        } else if (selectedMenu.equals("England")) {
            countryInfo = "Англия - страна в составе Соединённого Королевства. Население Англии составляет 84 % от " +"\n"+
                    "общего числа населения Великобритании. Столица — Лондон, крупнейший город Великобритании. ";
        }
        else if(selectedMenu.equals("Russia")){
            countryInfo="Росси́я, или Росси́йская Федера́ция, — государство в Восточной Европе и Северной Азии. " +"\n"+
                    "Россия — крупнейшее государство в мире, её территория в международно " +"\n"+
                    "признанных границах составляет 17 098 246 км²";
        }

        return countryInfo;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Countries();
            }
        });
    }
}

