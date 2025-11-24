package finalExamStudy.clientservershit.single;
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
      ServerSocket ss = new ServerSocket(8888);
      System.out.println("Salman's Server is Running...");
        Socket s = ss.accept();
        System.out.println("A Client has connected.");

        BufferedReader Clientnput = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter ServerInput = new PrintWriter(s.getOutputStream(), true);
        BufferedReader KeyboardInput = new BufferedReader(new InputStreamReader(System.in));

        String ClientName = Clientnput.readLine();
        System.out.println(ClientName + " has joined the chat.");

        ServerInput.println("Welcome " + ClientName + " to Salman's Server!");

        String messageFromClient, messageToClient;

        while (true) {
            messageFromClient = Clientnput.readLine();
            if (messageFromClient == null || messageFromClient.equalsIgnoreCase("exit") || messageFromClient.equalsIgnoreCase("") || messageFromClient.equalsIgnoreCase("bye") || messageFromClient.equalsIgnoreCase("quit")) {
                System.out.println(ClientName + " has disconnected!");
                break;
            }
            System.out.println(ClientName + ": " + messageFromClient);
            System.out.print("You: ");
            messageToClient = KeyboardInput.readLine();
            ServerInput.println(messageToClient); 
            if (messageToClient == null || messageToClient.equalsIgnoreCase("exit") || messageToClient.equalsIgnoreCase("") || messageToClient.equalsIgnoreCase("bye") || messageToClient.equalsIgnoreCase("quit")) {
                System.out.println("Chat ended by server.");
                break;
        }
    }
    s.close();
    ss.close();
}
}