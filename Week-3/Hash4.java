public class Hash4 {
    static final int SIZE = 10;
    static int[] table = new int[SIZE];

    static void insert(int key) {
        int index = key % SIZE;
        int stepSize = 7 - (key % 7);

        while (table[index] != 0) {
            index = (index + stepSize) % SIZE;
        }
        table[index] = key;
    }

    static void display() {
        for (int i = 0; i < SIZE; i++) {
            System.out.println(i + " -> " + table[i]);
        }
    }

    public static void main(String[] args) {
        insert(5);
        insert(15);
        insert(25);
        insert(35);
        insert(45);
        insert(55);

        display();
    }

    
}
