package onlinetests.datatypes;

public class ArrayOutput {

    public static void main(String args[]) {
        int array_variable [] = new int[10]; 
       for (int i = 0; i < 10; ++i) { 			// 0 2 4 6 8
         array_variable[i] = i/2; 
         array_variable[i]++; 
         System.out.print(array_variable[i] + " "); i++; 
       }
       
       System.out.println();
       
       double a, b,c; 
       a = 3.0/0; 
       b = 0/4.0;
       c=0/0.0;  
       System.out.println(a); 
       System.out.println(b); 
       System.out.println(c); 
    }
}
