public class DivisionHashing {
    public static void main(String[] args) {

        int key = 25;
        int tableSize = 10;

        int index = key % tableSize;

        System.out.println("Hash index: " + index);
    }
}