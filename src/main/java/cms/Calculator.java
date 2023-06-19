package cms;

public class Calculator {
    public float add(float num1, float num2) throws InvalidNumberException {
        if (Float.isNaN(num1) || Float.isNaN(num2)) {
            throw new InvalidNumberException("Invalid number: NaN");
        }
        return num1 + num2;
    }


    public float subtract(float num1, float num2) {
        return num1 - num2;
    }

    public float multiply(float num1, float num2) {
        return num1 * num2;
    }

    public float divide(float num1, float num2) throws InvalidNumberException {
        if (num2 == 0) {
            throw new InvalidNumberException("Impossibile dividere per 0");
        }
        return num1 / num2;
    }


}