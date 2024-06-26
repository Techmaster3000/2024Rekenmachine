interface Computation {
    int compute(int number1, int number2);
}
class MultiplyComputation implements Computation {
    public int compute(int number1, int number2){
        return number1 * number2;
    }
}
class PlusComputation implements Computation {
    public int compute(int number1, int number2) {
        return number1 + number2;
    }
}
class DivideComputation implements Computation {
    public int compute(int number1, int number2){
        return number1 / number2;
    }
}
class SubtractComputation implements Computation {
    public int compute(int number1, int number2){
        return number1 - number2;
    }
}