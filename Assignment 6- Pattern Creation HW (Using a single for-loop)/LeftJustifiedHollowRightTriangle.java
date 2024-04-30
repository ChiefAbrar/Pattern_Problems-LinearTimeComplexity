import java.util.Scanner;

public class LeftJustifiedHollowRightTriangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the height of a left-justified hollow right triangle: ");
        int h=in.nextInt();
        int i,j=1;
        for(i=1;i<=h;) {
            if(j==1 || j==i || i==h) {
                System.out.print(j + " ");
            } else {
                System.out.print("  ");
            }
            j++;
            if(j>i) {
                j=1;
                i++;
                System.out.println();
            }
        }
    }
}