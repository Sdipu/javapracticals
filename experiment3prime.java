import java.util.Scanner;

public class experiment4 {
    //print prime number
    public static void main(String[] args){
        System.out.println("by deepak prime number ");
        System.out.println("enter the nth number: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println("series: ");
                for(int i =2;i<n;i++){
                    boolean isprime = true;
                    for(int j =2;j<i/2;j++){
                        if(i%j==0){
                            isprime = false;
                            break;
                        }

                    }
                    if(isprime) System.out.print(" "+i);
                }

    }
}
