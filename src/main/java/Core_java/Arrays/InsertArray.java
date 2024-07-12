package Core_java.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InsertArray {
    public static void main(String[] args) {
        int[] arr=new int[5];

		arr[3]=23;
	arr[2]=11;
    System.out.println(Arrays.toString(arr));

        Scanner scan=new Scanner(System.in);

        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter your  number");
            arr[i]=scan.nextInt();
        }

        for (int sam:arr)
        {
            System.out.println(sam);
        }

    }
}
