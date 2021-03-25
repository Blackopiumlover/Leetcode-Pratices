import java.util.Arrays;

public class Leetcode705_MyHashSet {

    private int[] data;
    private static final int SIZE = 13_333;
    private static final int NULL = -1;
    private static final int DELETED = -2;

    Leetcode705_MyHashSet(){
        data = new int[SIZE];
        Arrays.fill(data, NULL);
    }
    
    void add(int key){
        data[hash(key)] = key;
    }

    void remove(int key){
        data[hash(key)] = DELETED;
    }

    boolean contains(int key){
        return data[hash(key)] != NULL;
    }

    int hash(int key){
        int i = key % SIZE;
        while(data[i] != key && data[i] != NULL){
            i = (i + 1) % SIZE;
        }
        return i;
    }
}
