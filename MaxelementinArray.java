import java.util.*;  //max element in the given array
public class Main
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    int n;
	     System.out.println("Array size:");
	    n=input.nextInt();
	    int a[]=new int[n];
	     System.out.println("Elements:");
	    for(int i=0;i<n;i++){
	        a[i]=input.nextInt();
	    }
	    int max=a[0];
	    for(int i=0;i<n;i++){
	        if(a[i]>max){
	            max=a[i];
	        }
	    }
	    System.out.println("The given array:");
	    for(int i=0;i<n;i++){
	        System.out.println(a[i]);
	    }
	    System.out.println("The max element in the given array: "+max);
	}
}
