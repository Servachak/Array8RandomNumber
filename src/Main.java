/**
 * Created by adavi on 24.07.2017.
 */
public class Main {
    public static void main(String [] args){

        int arr[] = new int [8];

        for (int i = 0; i < arr.length; i++){

            arr[i] = (int) (Math.random()*(9) + 1);

            System.out.print(arr[i]);
            System.out.print(" ");

            }
        System.out.println();
            ArrSort arrSort = new ArrSort();

        arrSort.sort(arr);
        }
    }

