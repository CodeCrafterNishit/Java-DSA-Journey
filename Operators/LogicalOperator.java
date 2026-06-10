package Operators;
public class LogicalOperator {
    public static void main(String[] args) {
        System.out.println((3>2)&&(5>0)); //both conditions should be true
        System.out.println((3>2)||(5<0)); //any one conditions should be true 
        System.out.println(!((3>2)&&(5<0))); //changes the boolen value
    }
}
