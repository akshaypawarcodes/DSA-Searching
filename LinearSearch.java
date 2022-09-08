public class LinearSearch {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6};
//        int num=5;

//        int temp=0;
//        for(int element:arr){
//            if(num == element){
//                System.out.println("present in array");
//                temp=temp+1;
//            }
//        }
//        if(temp == 0){
//            System.out.println("not present in array");
//        }

        String[] str={"akshay","spidy","manu","shorya"};
        String s="Akshay";
        int temp=0;
        for(String e:str){
            if(s.equals(e)){
                System.out.println("present in array");
                temp=temp+1;
            }
        }if(temp== 0){
            System.out.println("not present in array");
        }
    }
}
