package Work13.work132;

public class Person {
    private String lastName;
    private String firstName;
    private String patronymic;

    public Person(String lastName) {
        this.lastName = lastName;
    }
    public Person(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Person(String lastName, String firstName, String patronymic) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    public String getFullName() {
        StringBuilder fullName = new StringBuilder();

        if (lastName != null) {
            fullName.append(lastName);
            if (firstName != null) {
                fullName.append(" ").append(firstName.charAt(0)).append(".");
                if (patronymic != null) {
                    fullName.append(patronymic.charAt(0)).append(".");
                }
            }
        }

        return fullName.toString();
    }
    public static void main(String[] args) {
        Person person = new Person("Иванов");
        Person person1 =new Person("Иванов", "Иван", "Иванович");
        String fullName = person.getFullName();
        String fullName1 = person1.getFullName();
        System.out.println(fullName);
        System.out.println(fullName1);
    }
}
