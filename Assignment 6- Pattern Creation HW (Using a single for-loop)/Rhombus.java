import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the vertical diagonal length of the Rhombus: ");
        int h=in.nextInt();
        int row=1;
        int col=1;
        int s=1;
        for(;row<=2*h-1;) {
            int j=row>h?2*h-row:row;
            if(s<=2*(h-j)) {
                System.out.print(" ");
                s++;
            } else {
                if(col==1 || col<=2*j-1)
                System.out.print(col + " ");
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