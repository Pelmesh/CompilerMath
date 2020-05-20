public class Main {
private static int funInteger(int a){
a=a*a;
return a;
}
public static void main(String[]args) throws Exception{
int numInt = 5;
float numFloat = 3.99f;
int a = 5;
int b = 10;
int c = (int)numFloat;
numFloat=(numInt*numFloat);
numFloat=((5+3^2-b %2)/a)^2;
System.out.println(numFloat);
a=funInteger(a);
System.out.println(a);
float fl = numFloat+3.66f;
if (numFloat>=a){
System.out.println("more");
}else{
System.out.println("less");
}
for (a=0; a<5; a++){
a=funInteger(a);
System.out.println(a);
}
int num = 4;
while (num>0){
num=num-1;
System.out.println(num);
}
System.out.println("end");
}
}

