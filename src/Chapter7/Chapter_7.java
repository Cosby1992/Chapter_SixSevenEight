package Chapter7;

public class Chapter_7 {

    public static void main(String[] args) {

        //initialize integer array dillerCock with static integers
        int[] dillerCock = {2,5,4,8,6,3,2,5,4,1,2,5,9};
        //making space between previous task and the next
        System.out.println();

        //initialize for loop to run through array dillerCock using "p" 'cause "i"
        //is taken (Liam Neeson style)..
        for (int p = 0; p<dillerCock.length; p++){
            System.out.print(dillerCock[p] + " ");
        }
    }
}
