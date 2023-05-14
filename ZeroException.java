class ZeroException {
public static void main(String args[]) {
int d, a;
try {
d = 0;
a = 42 / 3;
System.out.println(" No error and a = " +a);
a = 42 / d;
System.out.println(" This will not be printed.");
}
catch (ArithmeticException e) {
System.out.println
(" User message is : Division by zero.");
System.out.println
(" Actual message is : " + e.getMessage());
}
finally {
System.out.println
(" Finally after catch statement.");
}
}
}