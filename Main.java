//classe main per repl, data l'impossiblità di runnare due main distinti

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main{
  public static void main(String[] args){
    Server srv= new Server(2000);
    srv.inAscolto();
    
    try{
      Client cli= new Client(2000, InetAddress.getLocalHost());

      srv.scrivi("ciao client");
      
      String messaggioLetto= cli.leggi();
      System.out.println(messaggioLetto);
      
    }catch(UnknownHostException ex){
      System.out.println("<cs> impossibile trovare local host");
    }

    
  }
}
  