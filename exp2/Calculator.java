public class Calculator {
    int num1;
    int num2;
    Calculator(){
        this.num1 = 0;
        this.num2 = 0;
    }
    Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    int add(int num1, int num2){
        return num1+num2;
    }
    double add(double num1, double num2){
        return num1+num2;
    }
    
}
