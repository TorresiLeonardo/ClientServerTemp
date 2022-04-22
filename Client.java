import java.io.*;
import java.net.*;

public class Client{
  int port= 2000;
    String ip= "127.0.0.1";
    
    try{
      Socket socket= new Socket(ip, port);
    }catch(Exception e){
        System.err.println(e);
    }
}