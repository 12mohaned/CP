public static void main(String[] args) throws IOException
{
PrintWriter r = new PrintWriter(System.out);
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
StringBuilder sb = new StringBuilder();	
int l = Integer.parseInt(br.readLine());
int counter = 0;
long min_counter = 2000000;
while(l!=0){
String place = (br.readLine());
for(int i =0; i <place.length();i++){
if(place.charAt(i) == 'Z'){
min_counter = 0;
break;
}
int R = place.indexOf('R');
int D = place.indexOf('D');
if(R == -1 | D == -1){

}
else{
int max = Math.max(R,D);
int min = Math.min(R,D);
counter = max-min;
place = place.substring(min+1,place.length());
min_counter = Math.min(counter,min_counter);
}
}
l = Integer.parseInt(br.readLine());
}
r.println(min_counter);
r.flush();
}