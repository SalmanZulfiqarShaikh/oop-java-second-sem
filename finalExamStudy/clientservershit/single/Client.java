package finalExamStudy.clientservershit.single;
import java.io.*;
import java.net.*;

public class Client {
     public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 8888);
        System.out.println("Connected to Salman's Server.");

        BufferedReader ServerInput = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter ClientOutput = new PrintWriter(s.getOutputStream(), true);
        BufferedReader KeyboardInput = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String ClientName = KeyboardInput.readLine();
        ClientOutput.println(ClientName);

        String welcomeMessage = ServerInput.readLine();
        System.out.println(welcomeMessage);

        String messageFromServer, messageToServer;

        while (true) {
            System.out.print("You: ");
            messageToServer = KeyboardInput.readLine();
            ClientOutput.println(messageToServer);
            if (messageToServer == null || messageToServer.equalsIgnoreCase("exit") || messageToServer.equalsIgnoreCase("") || messageToServer.equalsIgnoreCase("bye") || messageToServer.equalsIgnoreCase("quit")) {
                System.out.println("Chat ended by client.");
                break;
            }
            messageFromServer = ServerInput.readLine();
            if (messageFromServer == null) {
                System.out.println("Server has disconnected!");
                break;
            }
            System.out.println("Salman: " + messageFromServer);
        }
        s.close();
     }
}
