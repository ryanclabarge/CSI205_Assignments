public class BubbleSort {
    public static void main(String args[]){
        int[] array = {1,2,1,5,1,123,0,1,3,4,123,2,32,3,12,12,2,43,43,3434,5,65,56,56,56,345,34,5};
        bubbleSort(array);
        for (int a:array){
            System.out.print(a+" ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] arr){
        int counter = 0;
        while(counter < arr.length){
            for (int i =1; i < arr.length; i++) {
                if(arr[i] <= arr[i-1]){
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                }
            }
            counter++;
        }
    }
}
