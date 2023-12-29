package Work19.work191;

import Work17.work173.GUIModel;
import Work17.work173.GUIModelControler;
import Work17.work173.GUIModelView;

import java.util.Scanner;

public class INNChek {
    public boolean checkINNValidity(String inn){
        String[] inn_list= new String[]{"123456789123","123456099123","908436789123"};
        for(int i=0;i<inn_list.length;i++){
            if (inn_list[i].equals(inn)){
                return true;
            }
        }
        return false;
    }
    public void chek_inn(){
        try {
            // Запрос ФИО и номера ИНН пользователя
            System.out.println("Введите имя пользователя");
            Scanner in = new Scanner(System.in);
            String fullName = in.nextLine();
            System.out.println("Введите ИНН");
            String inn = in.nextLine();

            // Проверка действительности ИНН
            boolean isValidINN = checkINNValidity(inn);

            if (isValidINN) {
                // Продолжение оформления заказа
                System.out.println("Заказ оформлен");
            } else {
                throw new Exception("Недействительный номер ИНН");
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        INNChek innChek=new INNChek();
        innChek.chek_inn();
    }

}
