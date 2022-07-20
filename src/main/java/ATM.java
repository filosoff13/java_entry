public class ATM {
    public int countBanknotes(int sum) {
        int result = 0;

            if (sum >= 500) {
                result += sum / 500;
                sum %= 500;
            }
            if (sum >= 200) {
                result += sum / 200;
                sum %= 200;
            }
            if (sum >= 100) {
                result += sum / 100;
                sum %= 100;
            }
        if (sum >= 50) {
            result += sum / 50;
            sum %= 50;
        }
        if (sum >= 20) {
            result += sum / 20;
            sum %= 20;
        }
        if (sum >= 10) {
            result += sum / 10;
            sum %= 10;
        }
        if (sum >= 5) {
            result += sum / 5;
            sum %= 5;
        }
        if (sum >= 2) {
            result += sum / 2;
            sum %= 2;
        }
        if (sum >= 1) {
            result += sum;
        }

        return result;
    }

    public static void main(String[] args) {
        ATM bank = new ATM();

        //Should be 6 = 500 + 50 + 20 + 5 + 2 + 1
        System.out.println(bank.countBanknotes(578));
    }
}
