package Work6.work611;

public class TemConvert implements Convertable{
    public TemConvert(){};
    @Override
    public void convert(double a) {
        double F= ((double) 9 /5)*a +32;
        double K=a+273;

        System.out.println("По Фаренгейту: " + F);
        System.out.println("По Кельвину: " + K);
    }
}
