public static void shark(int t ){
Scanner sc = new Scanner(System.in);
long sum_even = 0;
long sum_odd = 0;
long min = 999999999;
while(t-- > 0){
int n = sc.nextInt();
if(n % 2 != 0){
if(n < min){
min = n;
}
}
if(n % 2 == 0){
sum_even  = sum_even + n;
}
else{
sum_odd = sum_odd + n;
}
}
if(sum_odd % 2 == 0){
System.out.println(sum_even + sum_odd);
}
else{
sum_odd = sum_odd - min;
if(sum_odd % 2 == 0){
System.out.println(sum_even + sum_odd);
}
}
}
