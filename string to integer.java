import java.io.*;
class StringToInt{
public static void main(String args[]){
int intoInt;
String a;
Scanner scan=new Scanner(System.in);
a=scan.next();
intoInt=Integer.parseInt(a);
System.out.println("This is an integer: "+intoInt);
}
}
