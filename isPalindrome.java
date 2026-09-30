//Check if a string is palindrome

public class isPalindrome {
    public static void main(String[] args){
        String s = "madam";

        int left = 0;
        int right = s.length() - 1;

        boolean palindrome = true;

        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                palindrome = false;
                break;
            }
            left++;
            right--;
        }
        if(palindrome){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not palindrome");
        }
    }
}
//Time: O(n)
//Space: O(1)
