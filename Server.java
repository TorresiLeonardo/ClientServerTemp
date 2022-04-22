import java.io.*;
import java.net.*;

public class Server{

  int port;
  
  public Server(int port){
    this.port=port;
  }
  
  Socket socket= null;
    
  try{
  ServerSocket sSocket= new ServerSocket(port);
    System.out.println("In attesa di connetersi con il client");
          
    socket=sSocket.accept();
    System.out.println("Server connesso con il socket: "+ socket.getRemoteSocketAddress());
    
  }catch(BindException be){
    System.err.println("Server già avviato");
  }catch(Exception e){
    System.out.println(e.getMessage());
  }
}