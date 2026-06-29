import jakarta.xml.ws.Endpoint;
import ws.BankAccountService;

public class ServerJWS {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:8787/";
        Endpoint.publish(url, new BankAccountService());
        System.out.println("web service deployer sur "+
                url);
        // Bloquer le programme pour que le service reste actif
        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
