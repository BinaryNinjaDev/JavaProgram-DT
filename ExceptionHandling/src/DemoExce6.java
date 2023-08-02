class DemoExce6 {
    int age;

    void validateAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Not a valid age");
        } else {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        DemoExce6 d1 = new DemoExce6();
        try {
            d1.validateAge(10);
        } catch (AgeException e) {
            System.out.println(e);
        }
    }
}

class AgeException extends Exception {
    AgeException(String str) {
        super(str);
    }
}
