import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int LC;
        do{
            System.out.println("---------------------MENU--------------------");
            System.out.println("[1]:Phuong Trinh Bac 2");
            System.out.println("[2]:Giai Thua");
            System.out.println("[3]:Fibonaci");
            System.out.println("[4]:UCLN");
            System.out.println("[5]:BCNN");
            System.out.println("[6]:So nguyen to nho nhat");
            System.out.println("[7]:So nguyen to nho nhat dau tien");
            System.out.println("[8]:So nguyen to co 5 chu so");
            System.out.println("[9]:Tong cac chu so");
            System.out.println("[10]:So thuan nghich");
            System.out.println("[11]:Liet ke so fibonaci la so nguyen to");
            System.out.println("[0]:Thoat chuong trinh.");
            System.out.println("---------------------------------------------");
            System.out.print("Lua chon thao tac: ");
            
            LC=Main.scanner.nextInt();
            System.out.println("---------------------------------------------");
            switch(LC){
                case 1:
                  
                  System.out.print("Nhap a:");
                  float a = Main.scanner.nextFloat();
                  System.out.println("Nhap b:");
                  float b= Main.scanner.nextFloat();
                  System.out.println("Nhap c:");
                  float c= Main.scanner.nextFloat();
                  System.out.print("Phuong trinh bac 2 la:");
                  BTCB.get_Ptb2(a, b, c);
                    break;
                case 2:
                   
                    System.out.println("Nhap n:");
                    int n= Main.scanner.nextInt();
                    System.out.print("Giai thua cua n la:");
                    System.out.println(BTCB.GT(n));
                    break;
                case 3:
                    
                     System.out.println("Nhap n1:");
                     int n1= Main.scanner.nextInt();
                     System.out.print("So fibonaci thu n la:");
                     System.out.println(BTCB.FIBO(n1));
                     break;
                case 4:
                   
                   System.out.println("Nhap a1:");
                   long a1=Main.scanner.nextLong();
                   System.out.println("Nhap b1:");
                   long b1=Main.scanner.nextLong();
                   System.out.print("UCLN:");
                   System.out.println(BTCB.UCLN(a1, b1));
                    break;
                case 5:
                    
                    System.out.println("Nhap a2:");
                    long a2= Main.scanner.nextLong();
                    System.out.println("Nhap b2:");
                    long b2=Main.scanner.nextLong();
                    System.out.print("BCNN");
                    System.out.println( BTCB.BCNN(a2, b2));
                break;
                case 6:
                   
                   System.out.println("Nhap n2:");
                   int n2=Main.scanner.nextInt();
                   System.out.print("So nguyen to nho nhat la:");
                   System.out.println(BTCB.ntnn1(n2));
                break;
                case 7:
            
                System.out.println("Nhap n3:");
                int n3=Main.scanner.nextInt();
                System.out.print("So nguyen to dau tien la:");
                System.out.println(BTCB.ntnn(n3));
                break;
                case 8:
                
                System.out.println("Nhap n4:");
                int n4=Main.scanner.nextInt();
                System.out.print("So nguyen to co 5 chu so la:");
                System.out.println(BTCB.lietkent5chuso(n4));
                break;
                case 9:
                
                System.out.println("Nhap n5:");
                int n5=Main.scanner.nextInt();
                System.out.print("Tong cac chu so la:");
                System.out.println(BTCB.tongCHUSO(n5));
                break;
                case 10:
                
                System.out.println("Nhap so:");
                int n6=Main.scanner.nextInt();
                System.out.print("So thuan nghich co 6 chu so la:");
                System.out.println(BTCB.bai9(n6));
                break;
                case 11:
               
                System.out.println("Nhap so nguyen:");
                int n7=Main.scanner.nextInt();
                System.out.print("Cac so fibonaci la so nguyen to la:");
                System.out.println(BTCB.bai10(n7));
                break;
                case 0: break;
            }
        }while(LC!=0);
    }
}
