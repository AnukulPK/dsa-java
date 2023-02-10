package hashtable;

public class Main {
    public static void main(String[] args) {

        HashTable myHashTable = new HashTable();
        myHashTable.set("nails",100);
        myHashTable.set("tiles",100);
        myHashTable.set("lumber",100);

        myHashTable.set("bolts",100);
        myHashTable.set("screws",100);
        myHashTable.printTable();
    }


}
