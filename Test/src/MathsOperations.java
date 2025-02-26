public class MathsOperations implements Addition,Subtraction{
    private int numberOne;
    private int numberTwo;

    public MathsOperations(){
        this.numberOne = 100;
        this.numberTwo = 120;
    }

    public MathsOperations(int n1, int n2){
        this.numberOne = n1;
        this.numberTwo = n2;
    }

    @Override
    public void add() {
        int result = numberOne + numberTwo;
        System.out.println(" add : " + result);
    }

    @Override
    public int add(int a, int b) {
        return  a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }
}
