import java.util.Scanner;


// Java program to print all primes smaller than or equal to
// n using Sieve of Eratosthenes

class experiment4
{
    public static void main(String args[])
    {    System.out.println("prime number by deepak");
        System.out.println("enter a number");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("Following are the prime numbers ");

        Primenumber(num);

    }

    public static void Primenumber(int n)
    {
        boolean prime[] = new boolean[n+1];
        for(int i=0;i<n;i++)
            prime[i] = true;

        for(int p = 2; p*p <=n; p++)
        {
            if(prime[p] == true)
            {
                // Update all multiples of p
                for(int i = p*p; i <= n; i += p)
                    prime[i] = false;
            }
        }
        for(int i = 2; i <= n; i++)
        {
            if(prime[i] == true)
                System.out.print(i + " ");
        }
    }

}

