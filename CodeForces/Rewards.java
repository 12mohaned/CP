public static void main(String[] args) throws IOException
{
PrintWriter r = new PrintWriter(System.out);
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
StringBuilder sb = new StringBuilder(); 
Scanner sc = new Scanner(System.in);
String s = "YES";
for(int i =0; i < 1;i++){
int a1 = sc.nextInt(),  a2 = sc.nextInt(),a3 = sc.nextInt();
int b1 = sc.nextInt(),  b2 = sc.nextInt(),b3 = sc.nextInt();
int n = sc.nextInt();
double sum  = a1 + a2 + a3;
double sum_2 = b1 + b2 + b3; 
sum = Math.ceil(sum /5);
sum_2 = Math.ceil(sum_2/10); 
if(sum + sum_2 > n)
s = "NO";
}
r.println(s);
r.flush();
}
