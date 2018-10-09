package academy.learnProgramming;

public class ArthemeticOperation {

    public static void main(String[] args) {

        int unaryOperative = 10;

        System.out.println("UNARY OPERATIVE = " + unaryOperative);
        System.out.println("UNARY OPERATIVE2 = " + unaryOperative++);
        System.out.println("UNARY OPERATIVE3 = " + unaryOperative);

        int preUnaryOperative = 20;
        System.out.println("UNARY PREOPERATIVE = " + preUnaryOperative);
        System.out.println("UNARY PREOPERATIVE = " + ++preUnaryOperative);

        int result = 3*2+4+5-2;
        System.out.println("Print Result = " + result);
    }
}
