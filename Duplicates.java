//Find Duplicate elements
//HashSet - no duplicates

import java.util.HashSet;
public class Duplicates {
    public static void main(String[] args){
        int[] arr ={1,2,3,2,4,1};

        HashSet<Integer> unique = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        for(int i: arr){
            if( !unique.add(i) ){
                duplicate.add(i);
            }
        }
        System.out.println("Duplicate elements : "+duplicate);
    }
}
//Time: O(n)
//Space: O(n)
