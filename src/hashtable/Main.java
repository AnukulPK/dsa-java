package hashtable;

public class Main {
    public static void main(String[] args) {

        HashTable myHashTable = new HashTable();
        myHashTable.set("nails",100);
        myHashTable.set("tiles",50);
        myHashTable.set("lumber",80);

        System.out.println(myHashTable.get("lumber"));
        System.out.println(myHashTable.get("bolts"));
    }


}
