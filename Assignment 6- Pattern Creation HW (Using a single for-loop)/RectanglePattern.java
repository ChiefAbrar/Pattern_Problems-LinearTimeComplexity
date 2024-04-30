import java.util.Scanner;

public class RectanglePattern {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        int length=in.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        int width=in.nextInt();
        int a=length*width;
        for (int i=0; i<a; i++) {
            int col=length-(i%length);
            System.out.print(col+" "); {
            if ((i+1)%length==0) {
                System.out.println();
                }
            }
        }
    }
}