package Work21.work201;
import Work20.work203.GenericClass;

import java.util.ArrayList;
import java.util.List;
public class MassToList {
    public static <T> List<T> masstolist(T[] array){
        List <T> list = new ArrayList<>();
        for(int i =0;i< array.length;i++){
            list.add(array[i]);
        }
        return list;
    }
    public static void main(String[] args) {
        Integer[] array={1,2,3,4,5,};
        List<Integer> intList=MassToList.masstolist(array);
        System.out.println("Integer List: " + intList);
    }
}

