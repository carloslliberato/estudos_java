package generics.introducao;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

    private List<T> list = new ArrayList<>();

    public void addValue(T value){
        list.add(value);
    }

    public T first(){
        if(list.isEmpty()){
            throw new IllegalStateException("Lista esta vazia");
        }
        return list.getFirst();
    }

    public void print(){
        for(T value : list){
            System.out.println(value);
        }
    }
}
