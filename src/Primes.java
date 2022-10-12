public class Primes {

    //  перебор чисел от 2 до 100 с проверкой функцией isPrime
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }

    //  проверка, является ли число простым
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}