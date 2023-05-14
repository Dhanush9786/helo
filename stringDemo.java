class stringDemo{
public static void main(String args[]){
String strob1="annamalai";
String strob2="university";
String strob3=strob1;
System.out.println("String 1 is:"+strob1);
System.out.println("String 2 is:"+strob2);
System.out.println("String 3 is:"+strob3);
System.out.println("string length is:" +strob1.length());
System.out.println("index of 3 :"+strob1.charAt(3));
if(strob1.equals(strob2))
System.out.println("string 1 and 2 equal");
else
System.out.println("string 1 and 2 not equal");
String substr;
substr=strob1.substring(4,9);
System.out.println("Substring 4 to 9 is:"+substr);
StringBuffer str=new StringBuffer("annamalai");
System.out.println("reversed stirng is:" +str.reverse());
String s3;
s3=strob1.concat(strob2);
System.out.println("cancatenated and string is:" +s3);
}
}