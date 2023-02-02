package lt.code.academy.taskThree;

import java.util.ArrayList;
import java.util.List;

public class MapAs <K, V>{

    List<Pair> pairs = new ArrayList<>();

    void put(K k, V v){
        Pair pair = new Pair<>(k, v);
        this.pairs.add(pair);
    }

    V get (K k){
        List <Pair> list = this.pairs;
        for (Pair pair : list){
            if (pair.key.equals(k))
                return (V)pair.getValue();
        }
        return null;
    }

}
