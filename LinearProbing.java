public class LinearProbing {

    static int size = 10;
    static int[] table = new int[size];

    static void insert(int key) {

        int index = key % size;

        while (table[index] != 0) {
            index = (index + 1) % size;
        }

        table[index] = key;
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