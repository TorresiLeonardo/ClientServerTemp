import java.net.InetAddress;
import java.net.UnknownHostException;

public class GestioneSocketClient{
  
  public static void main(String[] args){
    try{
      Client cli= new Client(2000, InetAddress.getLocalHost());
      String messaggioLetto= cli.leggi();
      System.out.println(messaggioLetto);
      
    }catch(UnknownHostException ex){
      System.out.println("<cs> impossibile trovare local host");
      
    }
    
  }
}