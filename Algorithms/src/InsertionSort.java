public class InsertionSort {
    public static void main(String args[]){
        int[] array = {1,14,12,12,1414,11231,12,1,23,23,23,23,23,1,121,2,3,34,34,5,3,4,7};
        int[] sortedarray = Sorted(array);
        for(int a:sortedarray){
            System.out.print(a +",");
        }
    }

    public static int[] Sorted(int[] arr){
        if(arr == null || arr.length == 0){
            return arr;
        }
        for (int i=1; i<arr.length; i++){
            for (int j=i;1<=j;j--){
                if(arr[j]<=arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }
}
