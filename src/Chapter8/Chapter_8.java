package Chapter8;

public class Chapter_8 {


    public static void main(String[] args) {

        double[][] tooMuch = {
                {1,2,3},
                {10,20,30},
                {100.1,200.2,300.3}
        };

        for(int i = 0;i<tooMuch.length; i++){
            System.out.println("\n");
            for (int j = 0; j<tooMuch[i].length; j++){
                System.out.print(tooMuch[i][j]+"  ");
            }


        }



    }
}
