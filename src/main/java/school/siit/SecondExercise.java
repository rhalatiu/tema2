package school.siit;

public class SecondExercise {
    public static void SecondExerciseMethod(){
    int arr[] = {10, 17, 55, 4, 44, 90, 34, 55};
    int min = arr[0];

    for (int i = 0; i<arr.length; i++){
        if(arr[i] < min){
            min = arr[i];
        }
    }
        System.out.println(min);
    }
}
