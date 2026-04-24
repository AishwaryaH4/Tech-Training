

// HASH COLLISION


public class Hshingg {
    static int tableSize=10;
    static int hashTable[]=new int[tableSize];
    static void insert(int key){
        int hashValue=key%tableSize;
        hashTable[hashValue]=key;
    }
    static void display(){
        for(int i=0;i<tableSize;i++){
            System.out.println(i+" "+hashTable[i]);
        }
    } 
    
    public static void main(String[] args){
        insert(5);
        insert(15);
        insert(25);
        insert(35);
        insert(45);
        insert(55);

        display();
    }
}
