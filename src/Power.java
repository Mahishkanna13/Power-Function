import java.util.Scanner;

public class Power {
    public static int power(int Number,int Base,int Divisor)
    {
        if(Base==0)
        {
            return 1;
        }
        int result=power(Number,Base/2,Divisor);
        if(Base%2==0)
        {
             return (result*result)%Divisor;
        }
            return (result*result*Number)%Divisor;

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int Number= scanner.nextInt();
        int Base= scanner.nextInt();
        int Divisor= scanner.nextInt();
        System.out.println(power(Number,Base,Divisor));
    }
}
