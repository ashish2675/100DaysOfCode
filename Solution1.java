class Solution1 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        System.out.println(canMakeArithmeticProgression(arr));
    }

    public static boolean canMakeArithmeticProgression(int[] arr) {

        for(int i =0; i< arr.length-1; i++){
            for(int j=i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j, j-1);
                }
                else{
                    break;
                }
            }
        }
//        if(arr.length>=3){
            for(int k = 0; k< arr.length;k++){
                if(arr[k+1] - arr[k] != arr[k+2] - arr[k+1]){
                    return false;
//                }else{
//                    break;
//                }
            }
//        }else if(arr.length<=2){
//            return true;
        }
        return true;
    }
    static void swap(int[]arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}