package BasicMathForJava;

public class PerfectNum {
    public static boolean CheckPerfectNum(int num) {
        int sum = 1;
        int originalNum = num;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                int firstDiv = i;
                int secondDiv = num / i;
                sum = sum + firstDiv + secondDiv;
            }
        }
        if(sum==originalNum){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        int num = 6;
        System.out.println(CheckPerfectNum(num));
    }
}
