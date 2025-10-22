import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 1234);
            System.out.println("You're Connected to Salman's server");

            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            
            System.out.println(in.readLine());
            String name = userInput.readLine();
            out.println(name);

            System.out.println(in.readLine());

            String message;
            while (true) {
                System.out.print("Please enter a message: ");
                message = userInput.readLine();
                out.println(message);

                if (message.equalsIgnoreCase("quit")) {
                    System.out.println("Disconnected from server.");
                    break;
                }

                String reply = in.readLine();
                if (reply == null) {
                    System.out.println("Salman's Server closed connection.");
                    break;
                }
                System.out.println(reply);
            }

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}