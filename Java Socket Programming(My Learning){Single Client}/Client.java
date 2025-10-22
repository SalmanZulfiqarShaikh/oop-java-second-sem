import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 7777);
        System.out.println("You're Connected to Salman's server");
        System.out.print("Please enter your name: ");

        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        // Send name
        String name = console.readLine();
        out.println(name);

        // Receive welcome message from server
        String welcome = in.readLine();
        System.out.println(welcome);

        String msgFromServer, msgToServer;

        while (true) {
            System.out.print("You: ");
            msgToServer = console.readLine();
            out.println(msgToServer);

            if (msgToServer.equalsIgnoreCase("exit")) {
                System.out.println("Chat ended by you.");
                break; // immediately stop
            }

            msgFromServer = in.readLine();
            if (msgFromServer == null || msgFromServer.equalsIgnoreCase("exit")) {
                System.out.println("Chat ended by server.");
                break;
            }
            System.out.println("Server: " + msgFromServer);
        }

        s.close();
    }
}
