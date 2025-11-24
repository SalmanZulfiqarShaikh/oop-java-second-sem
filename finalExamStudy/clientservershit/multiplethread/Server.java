package finalExamStudy.clientservershit.multiplethread;

import java.net.*;
import java.io.*;

public class Server {

     public Server(int port) { // create server at specified port class
         try (ServerSocket ss = new ServerSocket(port)) { // try catch block
             System.out.println("Server started on port " + port);

             while (true) {
                 Socket s = ss.accept();
                 System.out.println("New client connected: " + s.getInetAddress().getHostAddress());
                 ClientHandler clientHandler = new ClientHandler(s);
                 clientHandler.start();
             }
         } catch (IOException e) {
             System.out.println("Server exception: " + e.getMessage());
             e.printStackTrace();
         }
     }

    public static void main(String[] args) {
        new Server(8888);
    }
}