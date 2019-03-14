public static void hulk(int t){
String s =" ";
int i = 1;
while(t >= i){
if(i %2  == 0){
s = s + "I love that " ;
}
else {
s = s + "I hate that "  ;    
}
i++;
}
s = s.substring(0,s.length()-5);
s+= "it";
System.out.println(s);
}
