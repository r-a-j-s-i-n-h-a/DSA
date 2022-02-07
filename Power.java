import java.util.Scanner;

public class Q1 {
    public static int power(int x,int n){
        if(n==0)
            return 1;
        else if(x==1 || x==0|| n==1)
            return x;

        return x*power(x,n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Two integers separated by space");
        int x= sc.nextInt();
        int y= sc.nextInt();
        System.out.println(power(x,y));
    }
}
