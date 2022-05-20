class Bubble{
    public void bubbleSort(int arr[]){
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                 if(arr[i]>arr[j]){
                     int temp=arr[i];
                     arr[i]=arr[j];
                     arr[j]=temp;
                 }
            }

        }
        for(int ele:arr){
            System.out.print(ele);
        }

    }
}
public class BubbleSorting {
    public static void main(String[] args) {
        Bubble obj=new Bubble();
        int arr[]={4,2,5,3,7,5,7,9,};
         obj.bubbleSort(arr);
//


    }
}
