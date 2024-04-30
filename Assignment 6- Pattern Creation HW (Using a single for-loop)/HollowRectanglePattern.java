import java.util.Scanner;

public class HollowRectanglePattern {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        int length=in.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        int width=in.nextInt();
        for(int i=1; i<=length*width; i++) {
            int row=(i-1)/length+1;
            int col=(i-1)%length+1;
            if(row==1 || row==width || col==1 || col==length)
                System.out.print(col+" ");
            else
                System.out.print("  ");
            if(i%length==0) {
                System.out.println();
            }
        }
    }
}