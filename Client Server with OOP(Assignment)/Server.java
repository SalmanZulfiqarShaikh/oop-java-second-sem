import java.io.*;
import java.net.*;

public class Server {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private BufferedReader in;
    private PrintWriter out;

    public void start(int port) {
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("Server started on port " + port);

            while (true) {
                clientSocket = serverSocket.accept();
                System.out.println("New client connected.");

                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                out = new PrintWriter(clientSocket.getOutputStream(), true);

                String msg;
                while ((msg = receive()) != null) {
                    if (msg.equalsIgnoreCase("quit")) {
                        handleQuit();
                        break;
                    } else {
                        System.out.println("Received: " + msg);
                        send("Server Says: " + msg);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Problem in server: " + e.getMessage());
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

    public void handleQuit() {
        try {
            send("Connection closed by server.");
            clientSocket.close();
            System.out.println("Client disconnected.");
        } catch (IOException e) {
            System.out.println("Error closing client: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start(9090);
    }
}
