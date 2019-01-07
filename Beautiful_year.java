public static int Beautifulyear(int year){
boolean f = true;
while(f){
year = year +1;
String s = year+"";
int i = 0;
int y1 = s.charAt(i); 
int y2 = s.charAt(i+1);
int y3 = s.charAt(i+2);
int y4 = s.charAt(i+3);
for(i =0; i < s.length();i++){
if(y1 != y2 & y1 != y3 & y1 != y4){
if(y2 != y3 & y2 != y4){
if(y3 != y4){
f = false;
}
}
}
}
year = Integer.parseInt(s);
}
return year;
}
public static void main(String[]args) throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
StringBuilder s = new StringBuilder();
PrintWriter r = new PrintWriter(System.out);
int x = Integer.parseInt(br.readLine());
r.println(Beautifulyear(x));
r.flush();
}
