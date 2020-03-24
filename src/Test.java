import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JanuszWallet januszWallet = new JanuszWallet();
        System.out.println("Podaj operację na portfelu: ");
        double walletOperation = scanner.nextDouble();
        if (walletOperation > 0){
            System.out.println(januszWallet.addMoney(walletOperation));
        }
        else if ( walletOperation < 0){
            System.out.println(januszWallet.spendingMoney(-1*walletOperation));
        }
//        System.out.println(januszWallet.amountOfMoney());
//        System.out.println(januszWallet.spendingMoney(70));
//        System.out.println(januszWallet.addMoney(133));
        System.out.println(januszWallet);
    }
}

