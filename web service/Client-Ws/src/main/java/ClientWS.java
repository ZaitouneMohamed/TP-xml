import Proxy.Account;
import Proxy.BankAccountService;
import Proxy.BankWS;

public class ClientWS {
    public static void main(String[] args) {
        BankAccountService proxyWS = new BankWS().getBankAccountServicePort();
      Account account = proxyWS.getAccount(3);
        System.out.println(proxyWS.convertionEuroToDh(800));
        System.out.println("----------------------------");
        System.out.println(account.getCode());
        System.out.println(account.getBalance());
        System.out.println(account.getCreateAt());
    }
}
