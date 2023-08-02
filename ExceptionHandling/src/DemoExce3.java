//NESTED TRY CATCH BLOCK

class DemoExce3 {
    public static void main(String[] args) {
        try {
            int x = 10 / 0;
            System.out.println(x);
        } catch (ArithmeticException ae) {
            System.out.println("allowed na hai");
        }
        try {
            int y[] = { 10, 20 };
            y[4] = 9;
            System.out.println(y);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("aukat se bhar ja rhe ho bhai");
        } catch (Exception ae) {
            System.out.println(ae);
        }
    }
}

