package lt.code.academy.taskTwo;

import java.util.List;

public class MainForest <T extends Tree> {

    public static void main(String[] args) {

        MainForest main = new MainForest();

        List<Birch> birches = List.of(new Birch(), new Birch(), new Birch());

        List<Tree> trees = List.of(new Birch(), new Oak(), new Fir(), new Pine(), new Juniper());

        List<Conifer> conifers = List.of(new Pine(), new Fir(), new Juniper(), new Pine());


        main.mixedForest(trees);
        main.coniferForest(conifers);
        main.birchForest(birches);



    }

    void mixedForest (List<T> trees){
        System.out.println("Mixed forest:");
        for (Tree  tree : trees){
            tree.has();
        }
    }

    void coniferForest (List<T> trees){
        System.out.println("Conifer forest:");
        for (Tree  tree : trees){
            tree.has();
        }
    }

    void birchForest (List<T> trees){
        System.out.println("Birch forest:");
        for (Tree  tree : trees){
            tree.has();
        }
    }






}
