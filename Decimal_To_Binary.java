public class Decimal_To_Binary {

    static int dec_To_Bin(int num){
        int rem, bin = 0, i = 1;
        while(num > 0){
            rem = num % 2;
            bin = bin + (rem * i);
            num = num / 2;
            i = i * 10;
        }
        return bin;
    }    

    public static void main(String[] args) {
        System.out.println(dec_To_Bin(5));
    }
}

