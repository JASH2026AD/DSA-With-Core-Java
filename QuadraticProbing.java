public class QuadraticProbing {

    static int size = 10;
    static int[] table = new int[size];

    static void insert(int key) {

        int originalIndex = key % size;
        int i = 0;

        while (i < size) {

            int index = (originalIndex + i * i) % size;

            if (table[index] == 0) {
                table[index] = key;
                return;
            }

            i++;
        }

        System.out.println("Hash table is full!");
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