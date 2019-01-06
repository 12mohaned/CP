import java.util.*;
public class NextRound{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int k = sc.nextInt();
k = k-1;
int[]a = new int[n];
int kth_place = 0;
int i = 0;
int Advanced_players = 0;
while(i < n){
a[i] = sc.nextInt();
if(k == i){
kth_place = a[i];
}
i++;
}
for(i =0; i < n;i++){
if(a[i] >= kth_place & a[i] > 0){
Advanced_players++;
}
}
if(Advanced_players == 0){
System.out.println(0);
}
else{
System.out.println(Advanced_players);
}
}
}