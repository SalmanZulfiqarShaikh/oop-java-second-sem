import java.io.*;
import java.net.*;

public class Server {
    private ServerSocket serverSocket;

    public Server(int port) {
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("Salman's Server started on port " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                new Thread(new ClientHandler(clientSocket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class ClientHandler implements Runnable {
        private Socket socket;
        private BufferedReader in;
        private PrintWriter out;
        private BufferedReader serverInput;
        private String clientName;

        public ClientHandler(Socket socket) {
            this.socket = socket;
            try {
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream(), true);
                serverInput = new BufferedReader(new InputStreamReader(System.in));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            try {
                // Send message to client (instead of only printing on server)
                out.println("Please enter your name: ");
                clientName = in.readLine();

                System.out.println(clientName + " connected from " + socket.getInetAddress());
                out.println("Hello " + clientName + "! You are connected to Salman's server.");

                String message;
                while ((message = in.readLine()) != null) {
                    if (message.equalsIgnoreCase("quit")) {
                        System.out.println(clientName + " has quitted the chat");
                        out.println("You are disconnected from the server.");
                        break;
                    }

                    System.out.println(clientName + " says: " + message);
                    System.out.print("Enter reply to " + clientName + ": ");
                    String reply = serverInput.readLine();
                    out.println("Server to " + clientName + ": " + reply);
                }
            } catch (IOException e) {
                System.out.println("Error: " + clientName + " disconnected!");
            } finally {
                try {
                    socket.close();
                    System.out.println(clientName + " has disconnected.");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        new Server(1234);
    }
}
