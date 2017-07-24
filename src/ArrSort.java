/**
 * Created by adavi on 24.07.2017.
 */
public class ArrSort {

    public void sort(int arr[]){
        for (int i = 0; i < arr.length; i++){

            if (arr[i] % 2 != 0){
                arr[i] = 0;
            }

                System.out.print(arr[i]);
                System.out.print(" ");

            }
    }
}
