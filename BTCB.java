public class BTCB {


    public static void get_Ptb2(float a, float b, float c) {

        if ((a == 0) && (b != 0) && (c != 0)) {

            System.out.println("No solution");

        }

        if ((a == 0) && (b == 0) && (c == 0)) {

            System.out.println("Pt co vo so nghiem");

        }

        double denta = Math.pow(b, 2) - 4 * a * c;

        if (denta < 0) {

            System.out.println("No solution");

        }

        if (denta == 0) {

            double x = (-b) / (2 * a);

            System.out.format("%.4f%n", x);

        }

        if (denta > 0) {

            double x1 = ((-b) + Math.sqrt(denta)) / (2 * a);

            double x2 = ((-b) - Math.sqrt(denta)) / (2 * a);

            System.out.format("%.4f%n", x1);

            System.out.format("%.4f", x2);

        }

    }

    public static long GT(int n) {

        if ((n == 0) || (n == 1)) {

            return 1;

        } else

            return GT(n - 2) * n;

    }
    public static long FIBO(int n){
        long f0=0,f1=1,f2=1;
        if(n<1){
            return 0;
        }
        for(int i=2;i<=n;i++){
            f2=f0+f1;
            f0=f1;
            f1=f2;
        }
        return f2;
    }
    public static long UCLN(long a, long b){
        while (a!=b){
            if (a>b){
              a=a-b;
            }
            else{
            b=b-a;
            }
        }
       return a;
    }
    public static long BCNN(long a,long b){
        long ucln=UCLN(a,b);
        return a*b/ucln;
    }
    public static boolean nt(int n){
        if (n<2){
            return false;
        }
        int t = (int) Math.sqrt(n);
        for (int i = 2; i <= t; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static String ntnn1(int n){
        String rs="";
        for (int i=2;i<n;i++){
            if(nt(i)){
                rs+=i+'_';
            }
        }
        return rs;
    }
    public static String ntnn(int n){
        String rs="";
        for (int i=2;i<=n;i++){
            if(nt(i)){
                rs+=i+'_';
            }
        }
        return rs;
    }
    public static int DEMCHUSO(long n){
            int dem=0;
            while(n!=0){
             n=n/10;
               dem++;
            }
            return dem;
        }
    public static String lietkent5chuso(long n){
            String rs="";
            for( int i=2;i<n;i++){
                if((nt(i)) && (DEMCHUSO(i)==5)){
                    rs=rs+i+"_";
                }
            }
            return rs;
        }
    public static int tongCHUSO(long n){
            int sum=0;
            while(n!=0){
            long i=n%10;
             n=n/10;
               sum+=i;
            }
            return sum;
}
    public static boolean thuannghich(int n){
        int t=n;
        int temp =0;
        while(n>0){
            temp=temp*10+n%10;
            n/=10;
        }
        if (temp==t){
            return true;
        }
        return false;
    }
    public static String bai9(int n){
       String rs="";
        for (int i=100000;i<999999;i++){
                if(thuannghich(i)){
                 rs+=i+"_" ; 
                    
                }
        }
        return rs;
    }
    public static String bai10(int n){
        String rs="";
        for(int i=2;i<n;i++){
            if(nt(i)){
                rs+=FIBO(i)+"_";
            }
        }
        return rs;
    }

    }