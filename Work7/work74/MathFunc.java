package Work7.work74;

public class MathFunc implements  MathCalculable {
    @Override
    public double degree(double number,int degree) {
        double temp=number;
        for(int i = 1;i<degree;i++){
            number*=temp;
        }
        return number;
    }
    public double find_S(double R){
        return PI*degree(R,2);
    }
}
