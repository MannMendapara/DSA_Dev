import java.util.Scanner;

class printDevi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        scn.close();
        sumOfDivisors(x);
        // System.out.println(ans);
    }

    static void sumOfDivisors(int N) {
        for(int i = 1; i <= N; i++){
            if(N % i == 0){
                System.out.print(i + " ");
            }
        }
    }

}