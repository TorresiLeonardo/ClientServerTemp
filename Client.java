import java.io.*;
import java.net.*;

public class Client{
  Socket so;
  BufferedReader br;
  BufferedWriter bw;
  
  public Client(int port, InetAddress ip){
    try{
      so= new Socket(ip, port);
      br=new BufferedReader(new InputStreamReader(so.getInputStream()));
      
    }catch(IOException ex){
      System.out.println("<cs> errore creazione socket");
    }
    
  }

  public String leggi(){
    String msg="";
    
    try{
      msg=("<c> il server dice: '"+br.readLine()+"'");
      
    }catch(IOException ex){
      System.out.println("<cs> Errore nella lettura");
    }
    return msg;
    
  }
  
}