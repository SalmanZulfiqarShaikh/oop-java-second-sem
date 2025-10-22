import java.io.*;
import java.net.*;

public class Client {
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;

    public void start(String ipAddress, int port) {
        try {
            socket = new Socket(ipAddress, port);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
            System.out.println("Connected with server.");
        } catch (IOException e) {
            System.out.println("Could not connect: " + e.getMessage());
        }
    }

    public void send(String msg) {
        out.println(msg);
    }

    public String receive() {
        try {
            return in.readLine();
        } catch (IOException e) {
            return null;
        }
    }

    public void quit() {
        send("quit");
        try {
            socket.close();
            System.out.println("Client connection closed.");
        } catch (IOException e) {
            System.out.println("Closing error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start("localhost", 9090);

        client.send("Hello Teacher, this is Salman!");
        System.out.println("Server replied: " + client.receive());

        client.quit();
    }
}
