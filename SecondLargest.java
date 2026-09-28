//Second Largest element in an Array

public class SecondLargest {
    public static void main(String[] args){
        int[] arr = {10,5,20,8,15};

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if (arr[i]>largest){
                second = largest;
                largest = arr[i];
            }
            else if(arr[i]>second && arr[i] != largest){
                second=arr[i];
            }
        }
        System.out.println("Second Largest Element : " + second);
    }
}

//Time: O(n)
//Space: O(1)