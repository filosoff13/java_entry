public class TrurlBank {
    public int sumQuads(int n) {
        int result = 0;
        while(n > 0) {
            result += n * n;
            n--;
        }

        return result;
    }

    public int countSumOfDigits(int number) {
        int result = 0;
        int length = (int) (Math.log10(number) + 1);
        while(length > 0) {
            int sum = number / (int)Math.pow(10, length - 1);
            result += sum;
            number -= sum * (int)Math.pow(10, length - 1);
            length--;
        }

        return result;
    }
    public static void main(String[] args) {
        TrurlBank bank = new TrurlBank();

        //Should be 14 - 1 + 4 + 9
//        System.out.println(bank.sumQuads(3));

        //Should be 16 - 5 + 4 + 7
        System.out.println(bank.countSumOfDigits(547));
//        System.out.println((int)Math.pow(10, 2));
    }
}
