import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of the angles:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if( a + b + c == 180){
             System.out.println("Triangle can be Formed");
        }
        else{
            System.out.println("IT's Can't be Formed");
        }

    }

}
