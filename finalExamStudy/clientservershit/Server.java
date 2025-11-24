package finalExamStudy.clientservershit;
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
       ServerSocket ss = new ServerSocket(8888);
System.out.println("Server is running and waiting for connections...");

Socket s = ss.accept();
System.out.println("Client connected: " + s.getInetAddress());

BufferedReader clientInput = new BufferedReader(new InputStreamReader(s.getInputStream()));
PrintWriter ServerInput = new PrintWriter(s.getOutputStream(), true);    
BufferedReader KeyboardInput = new BufferedReader(new InputStreamReader(System.in));

System.out.println("Waiting for client message...");
String clientName = clientInput.readLine();

// Send welcome message
ServerInput.println("Welcome " + clientName + "!");

System.out.println(clientName + " has connected.");

String messageFromClient, messageToClient;

while(true) {
    messageFromClient = clientInput.readLine();
    if(messageFromClient == null || messageFromClient.equalsIgnoreCase("exit")) {
        System.out.println(clientName + " has disconnected.");
        break;
    }

    System.out.println(clientName + ": " + messageFromClient);
    System.out.print("Server: ");

    messageToClient = KeyboardInput.readLine();
    ServerInput.println(messageToClient);

    if(messageToClient.equalsIgnoreCase("exit")) {
        System.out.println("You have disconnected from the client.");
        break;
    }
}

s.close();
ss.close();
    }
}