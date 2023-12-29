package Work13.work133;

import java.util.StringTokenizer;

public class AddressB {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    public AddressB(String addressString) {
        setAddressFields(addressString);
    }


    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }

    public void setAddressFields(String addressString) {
            StringTokenizer tokenizer = new StringTokenizer(addressString, ",.;");
            int tokenCount = tokenizer.countTokens();
            if (tokenCount >= 1) {
                country = tokenizer.nextToken().trim();
            }
            if (tokenCount >= 2) {
                region = tokenizer.nextToken().trim();
            }
            if (tokenCount >= 3) {
                city = tokenizer.nextToken().trim();
            }
            if (tokenCount >= 4) {
                street = tokenizer.nextToken().trim();
            }
            if (tokenCount >= 5) {
                house = tokenizer.nextToken().trim();
            }
            if (tokenCount >= 6) {
                building = tokenizer.nextToken().trim();
            }
            if (tokenCount >= 7) {
                apartment = tokenizer.nextToken().trim();
            }
        }

    public static void main(String[] args) {
        AddressB address1 = new AddressB("Россия; Москва; Тверская улица; 1; 2; 3; 4");
        AddressB address2 = new AddressB("Россия. Московская область. Садовая. Улица 1. 10. 1. 5");
        AddressB address3 = new AddressB("США, Калифорния, Лос-Анджелес, Голливуд бульвар, 20, , 15");
        AddressB address4 = new AddressB("Германия, Бавария, Мюнхен, Площадь Мариенплац, 5, , 9");
        System.out.println(address1);

    }
}
