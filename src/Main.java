import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        int l3 = sc.nextInt();
        int n = sc.nextInt();

        l1=l1-n;
        l2=l2-n;
        l3=l3-n;

        if(l1>=0 && l1<=l2 && l1<=l3){
            System.out.println("L1");
        }
        if(l2>=0 && l2<=l1 && l2<=l3){
            System.out.println("L2");
        }
        if(l3>=0 && l3<=l2 && l3<=l1){
            System.out.println("L3");
        }

    }
}