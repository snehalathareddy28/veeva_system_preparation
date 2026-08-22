import java.util.*;

class tracker{
static void frequence(String str){
HashMap<String,Integer> hm = new HashMap<>();
String arr[] = str.split(" ");

for(String x : arr){
hm.put(x,hm.getOrDefault(x,0)+1);
}

System.out.println(hm);
}
public static void main(String...args){
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
frequence(str);
}
}
