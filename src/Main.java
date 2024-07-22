//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {

    }
}
    /*
     //Ass.4   code error  please again visit code and solve them

    public static void trapWater(int height[]){ // re study array topic and solve them
        int n = height.length;
        int trapWater = 0;
        // calculate left max
        int leftMax[] = new  int[n];
        leftMax[0] = height[0];
        for (int i=1; i<leftMax.length; i++) {
            if (leftMax[i] < height[i + 1]) {
                leftMax[i] = height[i + 1];
            }
        }
         // calculate right max
         int rightMax[] = new  int[n];
             rightMax[n-1] = height[n-1];
             for (int i=n-2; i>=0; i--){
                 if(rightMax[i] < height[i-1]){
                     rightMax[i] = height[i];
                 }
             }
             // loop to calculate water level
        for(int i=0; i< height.length; i++){
            int waterLevel += leftMax - rightMax;

            trapWater = Math.max(waterLevel, height);
        }

        return trapWater;
    }
    public static void main(String[] args) {
        int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

    }

}

     */
    /*
    // profit
    public static int stockProfit(int price[]){
        int buyPrice = Integer.MAX_VALUE;
        int  maxProfit = 0;

        for (int i=0; i<price.length; i++){
            if(buyPrice < price[i]){
               int profit = price[i] - buyPrice;
               maxProfit = Math.max(maxProfit, profit);
            }else {
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int price[] = {7, 6, 5, 4, 3, 2};
        System.out.println(stockProfit(price));
    }
}

     */
    /*

    // Question not solve completaly please visit again

    public  static  boolean findTargetafterRotate(int nums[], int target){ // you think how to rotate
        int n = nums.length;
        int temp[] = new int[n];

        for(int i =0; i< nums.length; i++){
            // swap
            temp = nums[i];
            nums[i] = nums[n-1];
            nums[n-1] = temp;

            if(nums[i] == target){
                return true;
            }
        }
       return  false;
    }

    public static void main(String[] args) {
        int nums[] = {0, 1, 2, 4, 5, 6, 7};
        int target = 3;
        System.out.println(findTargetafterRotate(nums, target));
    }
}

     */
   /*
   // ass.1 of arr

    public static  boolean multipleExist(int nums[]) { // t(n) = O(n^2) please optimal solution find after practice
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
                }
            }
        return  false;
    }
    public static void main(String[] args) {
       int nums[]  = {1, 2, 4, 5};
        System.out.println(multipleExist(nums));
     }
    }

    */
    /*
    //  buy and sell stock

    public static  int buyandsellstock(int price[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<price.length; i++){
            if(buyPrice < price[i]){ //profit
                int profit = price[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else {
                buyPrice = price[i];
            }
        }
        return  maxProfit;
    }

    public static void main(String[] args) {
    int price[] = {7, 1, 5, 3, 6, 4};
    System.out.println(buyandsellstock(price));
    }
}

     */
    /*
    // traping rain water


    public static int  trapingrainWater(int height[]){
        //step
        //calc left max boundary
        int n = height.length;
        int leftmax[] = new  int[n];
        leftmax[0] = height[0];
        for(int i=1; i<n; i++){
            leftmax[i] += Math.max(height[i], leftmax[i-1]);
        }

        // calc right max boundary
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for (int i=n-2; i>=0; i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }

        int trapWater = 0;
        // loop to calculate water level
        for(int i=0; i<n; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);

            // trapped water = waterlevel - height
            trapWater += waterlevel - height[i];
        }
        return trapWater;

    }
    public static void main(String[] args) {
        int height[] ={4, 2, 0, 6, 3, 2, 5};
        System.out.println(trapingrainWater(height));

    }
}

     */
    /*
    // calculate sub array sum using kadan algo in linear time

    public  static void kadanSubarraySum3(int number[]){ // tn = O(n)
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i=0; i<number.length; i++){
            cs = cs + number[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Max sub array sum = " + ms);
    }
    public static void main(String[] args) {
        int number[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanSubarraySum3(number);
    }
}
*/
    /*
    public  static  void printSubArraraySum2(int arr[]){// O(n^3)
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i =1 ; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i=0; i<arr.length; i++){
            int start = i;
            for (int j=i; j<arr.length; j++){
                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(maxSum < currSum){
                    maxSum = currSum;
                }

            }

        }
        System.out.println("Total  maxSubArraysum is = "+ maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        printSubArraraySum2(arr);
    }
}

     */
    /*
    public  static  void maxSubArraraySum(int arr[]){  //O(n^3)
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int start = i;
            for (int j=i; j<arr.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum += arr[k];
                }
                System.out.println(currSum); // print sub array

                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Total  maxSubArray is = "+ maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        maxSubArraraySum(arr);
    }
}
*/

    /*
     // print sub array

    public  static  void printSubArraraySum(int arr[]){// O(n^3)
        int ts = 0;
        for(int i=0; i<arr.length; i++){
            int start = i;
            for (int j=i; j<arr.length; j++){
                int end = j;
                for (int k=start; k<=end; k++){
                    System.out.print(arr[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total  SubArray is = "+ ts);
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        printSubArraraySum(arr);
    }
}
*/

    /*
    // pairs array

    public static void pairsiArray(int number[]){
        int tp =0;
        for (int i=0; i<number.length; i++){
            int curr = number[i];
            for (int j =i+1; j<number.length; j++){
                System.out.print("("+ curr +"," + number[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs "+ tp);
    }
    public static void main(String[] args) {
       int number[] ={2, 4, 6, 8, 10};
       pairsiArray(number);
    }
}
*/
    /*
     // reverse array

    public  static void reverseArrray(int number[]){
        int start = 0, end = number.length-1;
        while (start < end){
            // swap
            int temp = number[start];
            number[start] = number[end];
            number[end] = temp;
            start++;
            end--;
        }

    }
    public static void main(String[] args) {
        int number[] ={2 , 4, 6, 8, 10, 12};
        reverseArrray(number);
        for (int i=0; i< number.length; i++){
            System.out.print(number[i]+" ");
        }
    }
}
*/

    /*
    // binary search

    public  static  int binarySearch(int number[], int key){
        int start =0, end = number.length;
        while (start <= end){
            int mid = (start + end)/2;
            if (number[mid] == key){
                return  mid;
            }
            if(key > number[mid] ){
                start = mid+1;
            }
            if(key < number[mid]){
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] ={2, 4, 6, 8, 10, 14}; // sorted order
        int key = 8;
        int index = binarySearch(number, key);
        if(index >= 1){
            System.out.println(" key at index = "+ index);
        }else {
            System.out.println("Key not exist ");
        }
    }
}
*/
    /*
    // find largest number

   public static  int largestNum(int arr[]){
       int largest = Integer.MIN_VALUE;
       for (int i =0; i< arr.length; i++){
           if(largest < arr[i]){
               largest = arr[i];
           }
       }
       return largest;
   }
    public static void main(String[] args) {
        int arr[] = {1, 2, 6, 3,5};
        System.out.println(" largest at number = "+ largestNum(arr));
        }
    }
    */

    /*
    // linear search on array

    public static int linearSearch(int marks[], int key){
        for (int i=0; i<marks.length; i++){
            if(marks[i] == key){
                return  i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
     int marks[] = {1, 5, 6, 7 ,8 ,9,10};
     int key = 10;
     int index = linearSearch(marks, key);
     if(index >= 1){
         System.out.println(" key at index = "+ index);
     }else {
         System.out.println("Key not exist ");
     }
    }
}
*/
    /*
    public  static  void  update(int marks[]){
        for (int i=0; i<marks.length; i++){
            marks[i] += 1;
        }
    }
    public static void main(String[] args) {
      int marks[] = {97, 98, 99};
      update(marks);
      // print mark to check array pass by refrence
        for (int i= 0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);

      //  System.out.println("Length of the Array = "+ marks.length);
       marks[0] = sc.nextInt();
       marks[1] = sc.nextInt();
       marks[2] = sc.nextInt();

        System.out.println("Phy = "+ marks[0]);
        System.out.println("Che = "+ marks[1]);
        System.out.println("Math = "+ marks[2]);

       // marks[2] = 100;
       // System.out.println("Math = "+ marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2] )/ 3;
        System.out.println("Percentage = " + percentage + "%");


     int marks[] = new int[50];
     int marks1[] = {2, 3, 6, 7};
     String mark[] = {"Raj" , "shyam", "Rajesh"};
        System.out.println(marks[0]);
        System.out.println(marks1[0]);
        System.out.println(mark[0]);
    }
   */

