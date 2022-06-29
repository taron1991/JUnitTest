package calcultion;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Calculate {

    public static void main(String[] args) {
        System.out.println(findMax(new int[]{-12,-3,-34,-4,-2,-11}));
    }

    //method that returns max number
    public static int findMax(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
    //method that returns cube of the given number
    public static int cube(int n){
        return n*n*n;
    }
    //method that returns reverse words
    public static String reverseWord(String str){

        StringBuilder result=new StringBuilder();
        StringTokenizer tokenizer=new StringTokenizer(str," ");

        while(tokenizer.hasMoreTokens()){
            StringBuilder sb=new StringBuilder();
            sb.append(tokenizer.nextToken());
            sb.reverse();

            result.append(sb);
            result.append(" ");
        }
        return result.toString();
    }
}
