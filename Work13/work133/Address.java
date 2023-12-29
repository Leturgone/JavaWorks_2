package Work13.work133;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    public Address(String addressString) {
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
        String[] parts = addressString.split(",");
        if (parts.length >= 1) {
            country = parts[0].trim();
        }
        if (parts.length >= 2) {
            region = parts[1].trim();
        }
        if (parts.length >= 3) {
            city = parts[2].trim();
        }
        if (parts.length >= 4) {
            street = parts[3].trim();
        }
        if (parts.length >= 5) {
            house = parts[4].trim();
        }
        if (parts.length >= 6) {
            building = parts[5].trim();
        }
        if (parts.length >= 7) {
            apartment = parts[6].trim();
        }
    }

    public static void main(String[] args) {
        Address address1 = new Address("Россия, Москва,Москва, Тверская улица, 1, 2, 3, 4");
        AddressB address2 = new AddressB("Россия, Московская область,Москва, Садовая Улица 1, 10, 1, 5");
        Address address3 = new Address("США, Калифорния, Лос-Анджелес, Голливуд бульвар, 20, , 15");
        Address address4 = new Address("Германия, Бавария, Мюнхен, Площадь Мариенплац, 5, , 9");
        System.out.println(address1);

    }
}
