package Week1;

interface Calc{
    int ERROR = -999999999;
    int add(int num1, int num2);
    int subtract(int num3, int num4);
    int times(int num5, int num6);
    int divide(int num7, int num8);
}
public abstract class Calculator implements Calc{
    public int add(int num1, int num2){
        return num1 + num2;
    }
    public int subtract(int num3, int num4){
        return num3 - num4;
    }
}
class CompleteCalc extends Calculator{
    public int times(int num5, int num6){
        return num5 * num6;
    }
    public int divide(int num7, int num8){
        if(num7 != 0){
            return num7 / num8;
        }
        return ERROR;
    }
}
class Test{
    public static void main(String[] args){
        int num1 = 1234;
        int num2 = 4321;
        int num3 = 911;
        int num4 = 170;
        int num5 = 2;
        int num6 = 3;
        int num7 = 33;
        int num8 = 11;

        CompleteCalc calc2 = new CompleteCalc();

        System.out.println(num1 + " + " + num2 + " = " + calc2.add(num1, num2));
        System.out.println(num3 + " - " + num4 + " = " + calc2.subtract(num3, num4));
        System.out.println(num5 + " * " + num6 + " = " + calc2.times(num5, num6));
        System.out.println(num7 + " / " + num8 + " = " + calc2.divide(num7, num8));
    }
}