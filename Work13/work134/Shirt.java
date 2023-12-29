package Work13.work134;

import Work13.work133.Address;
import Work13.work133.AddressB;

public class Shirt {
    String article;
    String type;
    String color;
    String size;
    public Shirt(String addressString) {
        setShirtFields(addressString);
    }
    public void setShirtFields(String addressString) {
        String[] parts = addressString.split(",");
        if (parts.length >= 1) {
            article = parts[0].trim();
        }
        if (parts.length >= 2) {
            type = parts[1].trim();
        }
        if (parts.length >= 3) {
            color = parts[2].trim();
        }
        if (parts.length >= 4) {
            size = parts[3].trim();
        }
    }

    @Override
    public String toString() {
        return "Футболка" + '\n'+
                " Артикул='" + article + '\n' +
                " Тип='" + type + '\n' +
                " Цвет='" + color + '\n' +
                " Размер='" + size + '\n';
    }
    public static void main(String[] args) {
        String[] shirts= new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        for(int i=0;i< shirts.length;i++){
            Shirt shirt=new Shirt(shirts[i]);
            System.out.println(i +" "+ shirt);
        }
    }
}
