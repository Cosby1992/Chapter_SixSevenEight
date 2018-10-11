package Chapter6;

public class Chapter_6 {

    public static void main(String[] args) {

        System.out.println(max(50, 100));
        System.out.println(max(100, 50));
        System.out.println(max(50, 50));
        System.out.println("tistrold");

        //Method 1 loop
        //initialize integer i
        int i = 1;
        //while loop while
        while (i <= 6) {
            method1(i, 2);
            i++;
        }

    }

    //Method biggest number
    public static int max(int num1, int num2) {
        //Declare integer result
        int result;
        //define result (boolean (num1>num2) true = return num1||| false = return num2)
        result = (num1 > num2) ? num1 : num2;
        return result;
    }

    //Method print grade ( checks what category the score falls into and returns the corresponding grade )
    public static String printGrade(double score) {
        //initialize String grade
        String grade = "";

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        return grade;
    }

    //Method
    public static void method1(int i, int num) {
        for (int j = 1; j <= i; j++) {
            System.out.print(num + "   ");
            num *= 2;
        }
        System.out.println();
    }
}

