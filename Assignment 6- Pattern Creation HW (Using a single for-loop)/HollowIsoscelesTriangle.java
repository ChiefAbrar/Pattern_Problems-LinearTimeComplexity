import java.util.Scanner;

public class HollowIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the height: ");
        int h=in.nextInt();
        int row=1;
        int col=1;
        int s=1;
        for(;row<=h;) {
            if(s<=h-row) {
                System.out.print("  ");
                s++;
            } else {
                if(col==1 || col==2*row-1 || row==h) {
                    System.out.print(col+" ");
                } else {
                    System.out.print("  ");
                }
                col++;
                if(col>2*h-1) {
                    System.out.println();
                    row++;
                    col=1;
                    s=1;
                }
            }
        }
    }
}