import java.util.Scanner;

public class PalindromicIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int h=in.nextInt();
        int col=0;
        for (long row=1; col<h; row=row+(long)Math.pow(10,col)) {
            int s=h-col;
            if(s>1) {
                System.out.print(" ");
                if(s>2) {
                    System.out.print(" ");
                    if(s>3) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println(row*row);
            col++;
        }
    }
}