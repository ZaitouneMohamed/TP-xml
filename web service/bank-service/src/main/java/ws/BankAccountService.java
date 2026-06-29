package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;


@WebService(serviceName = "BankWS")

public class BankAccountService {
    @WebMethod(operationName = "convertionEuroToDh")
    public double convertToDhADouble(@WebParam(name = "montant") double amount) {
        return amount*11;
    }

    @WebMethod()
   public Account getAccount(@WebParam(name = "code" ) int code){
        return new Account(code,43000,new Date());
   }

   @WebMethod()
   public List<Account> ListAccounts(){
        return List.of(
                new Account(1,43000,new Date()),
                new Account(2,25000,new Date()),
                new Account(3,14000,new Date())

        );
   }
}
