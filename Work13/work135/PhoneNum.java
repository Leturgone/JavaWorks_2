package Work13.work135;

import Work13.work134.Shirt;

import java.util.Scanner;

public class PhoneNum {
    String country_num;
    String ftree;
    String stree;
    String ftwo;
    String stwo;
    public PhoneNum(String addressString) {
        setPhoneFields(addressString);
    }
    public void setPhoneFields(String phone){
        if (phone.length()==12){
            country_num = phone.substring(1,2);
            ftree = phone.substring(2, 5);
            stree = phone.substring(5, 8);
            ftwo = phone.substring(8, 10);
            stwo = phone.substring(10, 12);
        }
        else if (phone.length()==13){
            country_num = phone.substring(1,3);
            ftree = phone.substring(3, 6);
            stree = phone.substring(6, 9);
            ftwo = phone.substring(9, 11);
            stwo = phone.substring(11, 13);
        }
        else if (phone.length()==11){
            country_num = phone.substring(0,1);
            ftree = phone.substring(1, 4);
            stree = phone.substring(4,7 );
            ftwo = phone.substring(7, 9);
            stwo = phone.substring(9, 11);
        }
    }

    @Override
    public String toString() {
        return "Телефонный номер : + "+"<"+country_num+">"+"<"+ftree+">"+"<"+stree+">"+"<"+ftwo+">"+"<"+stwo+">";
    }

    public static void main(String[] args) {
        System.out.println("Введите номер: ");
        Scanner console = new Scanner(System.in);
        String num = console.next();
        PhoneNum phone_form=new PhoneNum(num);
        System.out.println(phone_form);
    }
}