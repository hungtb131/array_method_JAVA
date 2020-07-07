package array_method_Java;

import java.util.Arrays;

public class merge_array {
    public static void main(String[] args)
    {
        int[] firstArray = {1,2,3,4,5}; //khởi tạo mảng
        int[] secondArray = {6,7,8,9,10};
        int length = firstArray.length + secondArray.length; //thêm phần tử mảng 1 vào mảng 2
        int[] mergedArray = new int[length];    //khởi tạo mảng mới bằng mảng 1 + mảng 2
        int index = 0;
        for (int element : firstArray) //dùng loop sao chép phần tử
        {
            mergedArray[index] = element;
            index++;
        }
        for (int element : secondArray)
        {
            mergedArray[index] = element;
            index++;
        }
        System.out.println(Arrays.toString(mergedArray));   //prints
    }
}
