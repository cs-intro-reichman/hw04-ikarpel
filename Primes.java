public class Primes {
    public static void main(String[] args) {
        final int N = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[N + 1];
        
        int i = 2;
        while (i <= N) {
            isPrime[i] = true;
            i++;
        }
        
        int p = 2;
        while (p * p <= N) {
            if (isPrime[p]) {
                int multiple = p * p;
                while (multiple <= N) {
                    isPrime[multiple] = false;
                    multiple = multiple + p;
                }
            }
            p++;
        }
        
        System.out.println("Prime numbers up to " + N + ":");
        
        int count = 0;
        int printIndex = 2;
        while (printIndex <= N) {
            if (isPrime[printIndex]) {
                System.out.println(printIndex);
                count++;
            }
            printIndex++;
        }
        
        int percentage = (int) (((double) count / N) * 100);
        System.out.println("There are " + count + " primes between 2 and " + N + " (" + percentage + "% are primes)");
    }
            
         

    
}