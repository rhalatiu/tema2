package school.siit;

public class ThirdExercise {
    public static void Min(int n){
        int smallest = 9;

        while (n != 0){
            int r = n % 10;
            smallest = Math.min(r, smallest);

            n = n / 10;
        }
        System.out.println(smallest);
    }
}
