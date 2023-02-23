package challenge;

import java.util.HashMap;

public class Main {
    public static boolean itemInCommon(int[] array1, int[] array2){
        for(int i =0;i<array1.length;i++){
            for(int j =0;j< array2.length;j++){
                if(array1[i]==array2[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean itemInCommonAlternate(int[] array1, int[] array2){
        HashMap<Integer, Boolean> myHashMap=new HashMap<>();

        for(int i:array1){
            myHashMap.put(i,true);
        }

        for(int j:array2){
            if(myHashMap.get(j)!=null) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array1 = {1,3,5};
        int[] array2 = {2,4,6};

        System.out.println(itemInCommon(array1,array2));

        System.out.println(itemInCommonAlternate(array1,array2));

    }

}
