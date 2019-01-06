import java.io.*;
import java.util.*;
public class problem_statement_2
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
int counter = 1;
int n = sc.nextInt();
int k = sc.nextInt();
while(true){
n = n*counter;
if(n % 10 == 0 || (n-k)% 10 ==0){
break;
}
n = n/counter;
counter++;
}
System.out.println(counter);
}
}
