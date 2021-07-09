import java.util.*;// fibonacci series using recursion
public class Main
{     static int n,a=0,b=1,c=0;
      static void fibo(int n){
          if(n>0){
              c=a+b;
              a=b;
              b=c;
              System.out.print(" "+c);
              fibo(n-1);
          }
      }
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    System.out.print("Enter the n value:");
	    n=input.nextInt();
	    System.out.print("The fibonacci series: ");
	    System.out.print(a+" "+b);
	    fibo(n-2);
		
	}
}
