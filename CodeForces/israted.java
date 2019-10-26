import java.io.*;
import java.util.*;
public class Problem_set_2
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
int counter = 0;
int n = sc.nextInt();
PrintWriter r = new PrintWriter(System.out);
int []a = new int[n*2];
int i =0;
int j =0;
String s ="";
while(n > j){
int x = sc.nextInt();
int y = sc.nextInt();
a[i] = x;
a[i+1] = y;
i = i+2;
j++;
if(x != y){
s = "rated";
}
}
for(i =0; i < n*2 & s!="rated" ;i++){
for(j =0 ;j < n*2;j++){
if( j > i){
if(i% 2== 0 & j % 2== 0){
if(a[i] <a[j]){
s = "unrated";
}
}
}
}
}
if(s != "rated" & s!= "unrated"){
s = "maybe";
}
r.println(s);
r.flush();
}
}
