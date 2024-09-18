import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp_num = sc.nextInt();
        String out_num = "";
        while (inp_num>0) {
            out_num=inp_num%2+out_num;
            inp_num=inp_num/2;
        }
        System.out.println(out_num);
    }
}