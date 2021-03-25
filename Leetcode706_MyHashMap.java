import java.util.Arrays;

public class Leetcode706_MyHashMap {
    
    private int[] keys;
    private int[] values;
    private static final int SIZE = 13_333;
    private static final int NULL = -1;
    private static final int DELETED = -2;

    Leetcode706_MyHashMap(){
        keys = new int[SIZE];
        values = new int[SIZE];
        Arrays.fill(keys, NULL);
        Arrays.fill(values, NULL);
    }

    void put(int key, int value){
        int temp = hash(key);
        keys[temp] = key;
        values[temp] = value;
    }

    int get(int key){
        return values[hash(key)];
    }

    void remove(int key){
        int temp = hash(key);
        keys[temp] = DELETED;
        values[temp] = DELETED;
    }

    int hash(int key){
        int i = key % SIZE;
        while(keys[i] != key && keys[i] != NULL){
            i = (i + 1) % SIZE;
        }
        return i;
    }
}
