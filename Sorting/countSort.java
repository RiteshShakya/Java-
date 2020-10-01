public class countSort {
    public static void main(String[] args) {
        int arr[] = {3,4,6,1,2,5,9};
        sort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sort(int arr[]){
        char[] output = new char[arr.length];
        int count[] = new int[256];
        for(int i=0;i<256;i++){
            count[i] = 0;
        }
        for(int i=0;i<arr.length;i++){
            ++count[arr[i]];
        }

        for(int i=1;i<=255;i++){
            count[i]+=count[i-1];
        }
        for(int i=arr.length-1;i>=0;i--){
            output[count[arr[i]]-1] = (char)arr[i];
            --count[arr[i]];
        }

        for(int i=0;i<arr.length;i++){
            arr[i] = output[i];
        }
    }
}
