import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        char c;
        String chuoi;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap chuoi can check");
        chuoi = scanner.nextLine();
        boolean status = true;
        for (int i= 0;i<chuoi.length();i++){
            c = chuoi.charAt(chuoi.length()-i-1);
            if (c==chuoi.charAt(i))
                continue;
            status =false;
            break;
        }
        if (status){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

    }
}
