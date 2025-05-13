package Leetcode.Math;

public class PrimeSieve_204 {

/*     
    // index -> false -> prime no.
    // index -> true -> not prime no.
    public static void PrimeSieve(int n) {
        boolean[] prime = new boolean[n+1];
        prime[0] = true;
        prime[1] = true;
        for (int i = 2; i*i <= n; i++) {
            if(prime[i] == false) {
                for (int j = 2; i* j < prime.length; j++) {
                    prime[i*j] = true;
                }
            }
        }
        for (int i = 2; i < prime.length; i++) {
            if(prime[i] == false) {
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        int n = 1000;
        PrimeSieve(n);
    } 
    */


    public static int PrimeSieve(int n) {
        boolean[] prime = new boolean[n+1];
        int countPrime = 0;
        prime[0] = true;
        prime[1] = true;
        for (int i = 2; i*i <= n; i++) {
            if(prime[i] == false) {
                for (int j = 2; i* j < prime.length; j++) {
                    prime[i*j] = true;
                }
            }
        }
        for (int i = 2; i < prime.length; i++) {
            if(prime[i] == false) {
                countPrime++;
            }
        }
        return countPrime;
    }

    public static void main(String[] args) {
        int n = 100;
        System.out.println( PrimeSieve(n));
    }



}
