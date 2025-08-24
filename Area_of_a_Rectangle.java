import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the length");
        int length = sc.nextInt();
        System.out.println("enter the width");
        int width = sc.nextInt();
        int area = length*width;
        System.out.println("The area of the rectangle is " + area);

        
    }
}