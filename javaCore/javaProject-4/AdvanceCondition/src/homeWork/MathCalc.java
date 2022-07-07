package homeWork;

public class MathCalc {
    public static void main(String[] args) {
        int b = 5;
        int c = 0;
        int a = 10;
        int max = 0;
        int min = 0;

        while (a>0 || b>0 || c>0){
            b--;
            c--;
            a--;
            max ++;
        }
        System.out.println("max==>" + max);
        /*todo r   */
        while (a>0 && b>0 && c>0){
            b--;
            c--;
            a--;
            min ++;
        }
        System.out.println("min==>" + min);


    }
}
