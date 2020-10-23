import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class experiment3 {
    public static void main(String[] args) {
        int f =0, s =1;
        System.out.println("aim : fibonacci number by deepak ");
        System.out.println("enter nth number ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(f+" "+s+" ");

        for (int i =0;i<num;i++){
            int t = f+s;
            System.out.print(t+" ");
            f =s;
            s = t;
        }

    }
}
