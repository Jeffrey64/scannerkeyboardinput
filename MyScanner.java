
import java.util.Scanner;

public class MyScanner
{
    int i = 12;
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if(scanner.hasNext()) {
                String str = scanner.next();
                System.out.println(str);
                scanner.nextInt(i*3);
            }
        }
    }

    public static void main(String[] args) {
        MyScanner myScanner = new MyScanner();
        myScanner.run();
    }
}

