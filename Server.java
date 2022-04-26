import java.io.*;
import java.net.*;

public class Server{
  ServerSocket ss;
  Socket so;
  BufferedReader br;
  BufferedWriter bw;
  
  public Server(int port){
    try{
      ss= new ServerSocket(port);
      System.out.println("<s> in ascolto");
      
    }catch(IOException ex){
      System.out.println("<cs> errore nella creazione del server");
      
    }
    
  }

  public void inAscolto(){
    try{
      so= ss.accept();
      System.out.println("<s> connessione stabilita");
      
    }catch(IOException ex){
      System.out.println("<cs> problema nella creazione del socket");
    }
    
  }

  public void scrivi(String msg){
    try{
      bw= new BufferedWriter(new OutputStreamWriter(so.getOutputStream()));
      bw.write(msg+"\n");
      bw.flush();
    }catch(IOException ex){
      System.out.println("<cs> impossibile inviare messaggio");
    }
    
  }
  
}