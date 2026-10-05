package solutions._05_exceptions;

class Main {
    static int divide(int a, int b) throws ArithmeticException{
        // Reject the b == 0 case with a throw STATEMENT:
        //     throw new SomeException("message");
        // (`throws` belongs in a method signature; it is not a statement.)
        return a / b;
    }

    public static void main(String[] args) throws Exception {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            // print "result: " followed by divide(a, b)
            System.out.println("result: " + divide(a,b));
        } catch (ArithmeticException e) {
            // print "error: " followed by the exception message
            System.out.println("error: divide by zero");
        }
    }
}
