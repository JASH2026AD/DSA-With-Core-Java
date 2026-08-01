import java.util.LinkedList;

public class ChainingHashTable {

    static int size = 10;
    static LinkedList<Integer>[] table = new LinkedList[size];

    static void insert(int key) {

        int index = key % size;

        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }

        table[index].add(key);
    }

    public static void main(String[] args) {

        insert(23);
        insert(43);
        insert(13);
        insert(25);

        for (int i = 0; i < size; i++) {
            System.out.println(i + " -> " + table[i]);
        }
    }
}