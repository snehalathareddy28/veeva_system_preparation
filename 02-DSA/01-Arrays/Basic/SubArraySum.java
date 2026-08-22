//Continuous Subarrays Sum Equals K
//Find the total number of continuous subarrays whose sum equals K.
//Input: nums = [1,2,3], k = 3
//Output: 2
//Explanation: Both the contiguous subarray [1,2] and the single-element subarray [3] sum perfectly to the target of 3.

import java.util.*;

class SubArraySum{

public static int countval(int arr[],int target){
int count = 0;
HashMap<Integer,Integer> hm = new HashMap<>();
int n = arr.length;
for(int i=0;i<n;i++){
int val = target-arr[i];

if(hm.containsKey(val)){
count++;
}

hm.put(arr[i],hm.get(i));
}

return count;
}

public static void main(String...args){

Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
int target = sc.nextInt();
int arr[] = new int[n];
for(int i=0;i<n;i++){
arr[i] = sc.nextInt();
}
System.out.println(countval(arr,target));
}
}

