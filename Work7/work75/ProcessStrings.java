package Work7.work75;

public class ProcessStrings implements Strwork{
    @Override
    public int char_calc(String str) {
        char[] array = str.toCharArray();
        return array.length;
    }

    @Override
    public String reverse(String str) {
        char[] array = str.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        return result;
    }

    @Override
    public String nechet_str(String str) {
        char[] array = str.toCharArray();
        String result = "";
        for (int i =1; i<array.length; i=i+2) {
            result = result + array[i];
        }
        return result;
    }
}
