package assignment5;

//Write a function to find the second largest number in a given array.
public class Quest35 {
        public static void main(String[] args) {
        int[] arr = {2, 11, 8, 5, 15};

        for(int i=0; i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                     arr[i] = arr[j];
                     arr[j]= temp;

                }
            }
        }
            System.out.println(arr[arr.length-2]);
    }

}
