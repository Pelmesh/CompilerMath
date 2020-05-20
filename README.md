# CompilerMath

#Запуск
- Запуск Main.java
- Файл по умолчанию с исходным кодом - test.lang 
- Результат выполнения сохранится в output.java

#Грамматика
 - Была реализована грамматика языка, описывающего математические вычисления
 - Путь грамматики src/main/java/grammatics/Grammatics.g4
 
 #Пример
 ## test.lang: 
```
FUNCTION integer funInteger (integer a) {
  a=a*a
  RETURN a
}

START {
  integer numInt = 5
  float numFloat = 3.99
  integer a = 5
  integer b = 10
  integer c = (integer) numFloat

  numFloat = (numInt*numFloat)
  numFloat = ((5 + 3^2 - b%2)/a)^2

  PRINT numFloat

  a = funInteger(a)
  PRINT a

  float fl = numFloat + 3.66

  IF (numFloat>=a){
    PRINT(more)
  }
  ELSE{
    PRINT(less)
  }

  FOR ( a=0; a<5; a++){
    a=funInteger(a)
    PRINT a
  }

  integer num=4

  WHILE (num>0){
      num=num-1
      PRINT num
  }
  PRINT(end)
}
```
 ## Результат output.java:
```
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
```

