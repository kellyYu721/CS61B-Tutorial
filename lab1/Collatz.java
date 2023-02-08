/** Class that prints the Collatz sequence starting from a given number.
 *  @author YOUR NAME HERE
 */
public class Collatz {

    /** kelly's implementation of nextNumber! */
    public static void nextNumber(int n) {
        System.out.println(n + " ");
        while (n != 1){//可以不用考虑n=1的情况，因为最终为1是在运算中得到的，会直接打印


            if(n % 2 == 0){
                n=n/2;//尽量要先生成新的n，而不要直接在打印格中进行运算
                System.out.println(n);
            }
            else {
                n=3*n+1;
                System.out.println(n);
            }

        }

    }

    public static void main(String[] args) {
        int n = 5;
        nextNumber(n);
    }
}

