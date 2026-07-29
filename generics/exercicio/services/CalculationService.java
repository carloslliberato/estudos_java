package generics.exercicio.services;

import java.util.List;


public class CalculationService {
    
    public static <T extends Comparable<T>> T max(List<T> list){
        if(list.isEmpty()){
            throw new IllegalStateException("A lista não pode estar vazia");
        }

        T max = list.get(0);
        for (T p : list) {
            if(p.compareTo(max) > 0){
                max = p;
            }
        }

        return max;
    }


}
