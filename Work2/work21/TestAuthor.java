package Work2.work21;

public class TestAuthor {
    public static void main(String[] args){
        Author n1= new Author("Bulgakov","bulgakov@gmail.com",'M');
        Author n2= new Author("Lermontov","bulgakov@gmail.com",'h');
        Author n3= new Author("Cvetaeva","cvetaeva@gmail.com",'F');
        n2.setEmail("lermontov.com");
        System.out.println(n2.getEmail());
        System.out.println(n2.getGender());
        System.out.println(n2.getName());
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }
}
