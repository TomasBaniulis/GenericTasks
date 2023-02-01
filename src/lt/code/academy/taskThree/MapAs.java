package lt.code.academy.taskThree;

import java.util.List;

public class MapAs <K, V>{

    List<Pair> pairs;

    public MapAs(List<Pair> pairs) {
        this.pairs = pairs;
    }

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
