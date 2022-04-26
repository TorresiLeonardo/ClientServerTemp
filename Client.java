import java.io.*;
import java.net.*;

public class Client{
  Socket so;
  
  public Client(int port, InetAddress ip){
    try{
      so= new Socket(ip, port);
      
    }catch(IOException ex){
      System.out.println("<cs> errore creazione socket");
    }
    
  }
}