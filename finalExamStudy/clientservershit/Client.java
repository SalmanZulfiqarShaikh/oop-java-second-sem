package finalExamStudy.clientservershit;
import java.io.*;
import java.net.*;

public class Client {
     public static void main(String[] args) throws IOException {
       Socket s = new Socket("localhost", 8888);
System.out.println("You are connected to Salman's Server");

BufferedReader ServerInput = new BufferedReader(new InputStreamReader(s.getInputStream()));
PrintWriter ClientInput = new PrintWriter(s.getOutputStream(), true);
BufferedReader KeyboardInput = new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter Your Name");
String name = KeyboardInput.readLine();

// SEND NAME TO SERVER
ClientInput.println(name);

// RECEIVE WELCOME MESSAGE
String welcome = ServerInput.readLine();
System.out.println(welcome);

String messageFromServer, messageToServer;

while(true) {
    System.out.print("You: ");
    messageToServer = KeyboardInput.readLine();
    ClientInput.println(messageToServer);

    if(messageToServer == null || messageToServer.equalsIgnoreCase("exit")) {
        System.out.println(name + " has disconnected!");
        break;
    }

    messageFromServer = ServerInput.readLine();
    if(messageFromServer == null || messageFromServer.equalsIgnoreCase("exit")) {
        System.out.println("Chat ended by server.");
        break;
    }

    System.out.println("Server: " + messageFromServer);
}

s.close();
     }
}
