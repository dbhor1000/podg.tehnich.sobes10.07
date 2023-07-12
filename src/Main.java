public class Main {
    public static void main(String[] args) {
        testMethod(50);
        testMethod(200);
        testMethod(400);
    }

    public static void testMethod(int a) throws Exception1, Exception2 {

        try {
            if (a >= 100 && a <= 300 ) {
                System.out.println(a);
            } else if (a < 100) {
                throw new Exception1("Exception1 due to the value of a.");
            }
            else {
                throw new Exception2("Exception2 due to the value of a.");
            }

        } catch (Exception1 | Exception2 e) {
            System.out.println(e);
        }
    }

}