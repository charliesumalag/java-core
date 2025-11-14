public class Operators {
    int num1, num2;

    Operators(int num1 , int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    int add () {
       return num1 + num2;
    }
    int subtract () {
        return num1 - num2;
    }

    int multiply() {
        return num1 * num2;
    }
    int divide() {
        return num1 / num2;
    }

    int modulus () {
        return num1 % num2;
    }

    boolean isEqual () {
        return num1 == num2;
    }
}
