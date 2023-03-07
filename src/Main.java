public class Main {
    public static void main(String[] args) {
        int numbers=2;
        int count=0;
while  (count<20){
    if (isPrimeNumber(numbers)) {
        System.out.print("20 so nguyen to dau tien la:"+numbers + " ");
        count++;
    }
    numbers++;


}
    }
    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


}