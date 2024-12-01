import java.util.Scanner;
import java.lang.String;
class  Main{
    //method
    public static void main(String[] args) {
        System.out.println("enter input:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        String m = sc.nextLine();
        char c = sc.next().charAt(0);
        System.out.println(a);
        System.out.println(m);
        System.out.println(c);
    }

}
