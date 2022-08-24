import service.Account;
import service.custom.Withdrawable;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public class BankAppWithdrawalService {

    Withdrawable account;

    public BankAppWithdrawalService(Withdrawable account) {
        this.account = account;
    }

    public void depositToAccount(double amount){
        account.deposit(amount);
    }
    public void withdrawFromAccount(double amount){
        account.withdraw(amount);
    }


}
