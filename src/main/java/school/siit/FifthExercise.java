package school.siit;

public class FifthExercise {
    static boolean PrimeNumbers(int number){
        if (number <= 1)
            return false;

        for (int i = 2; i < number; i++){
            if(number % i == 0)
                return false;
        }
        return true;
    }
    public static void ShowPrime(int number){
        for(int i = 2; i <= number; i++){
            if(PrimeNumbers(i)){
                System.out.print(i + " ");
            }
        }
    }
}
