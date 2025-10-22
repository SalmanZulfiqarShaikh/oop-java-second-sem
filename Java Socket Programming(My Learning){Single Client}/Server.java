import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(7777);
        System.out.println("Server is waiting for client connection...");

        Socket s = ss.accept();
        System.out.println("Client connected to Server");

        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        // Get client name
        String name = in.readLine();
        System.out.println("Client Name: " + name);
        out.println("Hello " + name + "! You are connected to Salman's server.");

        String msgFromClient, msgToClient;

        while (true) {
            // First read client message
            msgFromClient = in.readLine();
            if (msgFromClient == null || msgFromClient.equalsIgnoreCase("exit")) {
                System.out.println("Chat ended by client.");
                out.println("exit"); // notify client
                break;
            }
            System.out.println(name + ": " + msgFromClient);

            // Now take input from server
            System.out.print("You: ");
            msgToClient = console.readLine();
            out.println(msgToClient);

            if (msgToClient.equalsIgnoreCase("exit")) {
                System.out.println("Chat ended by server.");
                break;
            }
        }

        s.close();
        ss.close();
    }
}
