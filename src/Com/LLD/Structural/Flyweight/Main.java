package Com.LLD.Structural.Flyweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Tree {
    private int x;
    private int y;
    private TreeType treeType;

    Tree(int x, int y,TreeType treeType) {
        this.x =x;
        this.y=y;
        this.treeType=treeType;
    }

    void display() {
        System.out.println(x + " " + y);
    }

}

class TreeType {
    private String name;
    private String color;
    private String texture;

    TreeType(String name , String color, String texture) {
        this.name = name;
        this.color= color;
        this.texture = texture;
    }
}

class Forest {
    List<Tree> trees;

    Forest() {
        this.trees = new ArrayList<>();
    }

    public void plantTree(int x, int y, String name, String color, String texture) {
        Tree tree = new Tree(x, y, TreeFactory.findTreeType(name, color, texture));
        trees.add(tree);
    }

    void print() {
        for(Tree tree : trees) {
            tree.display();
        }
    }
}
class TreeFactory {
    static Map<String , TreeType> cache= new HashMap<>();

    public static  TreeType findTreeType(String name , String color, String texture) {
        String key = name+color+texture;

        if(cache.containsKey(key)) {
            System.out.println("cache activated");
            return cache.get(key);
        }
        TreeType tree = new TreeType(name,color,texture);
        cache.put(key,tree);
        return tree;

    }

}

class Main{
    public static void main(String[] args) {
        Forest forest = new Forest();

        for(int i=0; i<10; i++) {
            forest.plantTree(i,i,"neem","green","light");
        }
        forest.print();
    }
}