
public class BinarySearch {
    public static void main(String[] args) {

        int[] arr={10,12,13,24,35,46,55,57,60,61};
        int key=13;
        int start=0;
        int end=arr.length-1;
        int mid=start+(end-start)/2;

       while(start<=end){
           if(arr[mid] == key){
               System.out.println(key+" is present in array at "+mid+" position");
               break;
           }else if (arr[mid]<key){
               start=mid+1;
           }else {
               end=mid-1;
           }
           mid=start+(end-start)/2;
       }
       if(start>end){
           System.out.println("not present in array");
       }

    }
}
