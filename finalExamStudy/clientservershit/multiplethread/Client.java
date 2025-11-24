package finalExamStudy.clientservershit.multiplethread;
import java.io.*;
import java.net.*;

public class Client {

    public Client(String address, int port) { 
        try (Socket s = new Socket(address, port)) {
            
            // 1. Start the separate Handler thread
            ClientHandler handler = new ClientHandler(s);
            handler.start(); // Runs in the background
            
            // 2. Setup the SENDER stream and keyboard input (in the main thread)
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter clientOutput = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
            
            System.out.println("Connected to server at " + address + ":" + port);
            
            String msg;
            // The main thread is now only responsible for sending
            while (s.isConnected()) {
                System.out.print("Enter message: ");
                
                // Block only to read keyboard input
                msg = keyboard.readLine();
                
                if (msg.equalsIgnoreCase("exit")) {
                    break; // Exit the loop and close the socket via try-with-resources
                }
                
                // Send the message
                clientOutput.println(msg);
                clientOutput.flush();
                
                // *** CRITICAL CHANGE: We no longer block waiting for a response here.
                // The ClientReceiver thread handles all incoming responses.
            }
            
        } catch (IOException e) {
            System.out.println("Client connection failed: " + e.getMessage());
            // e.printStackTrace(); // Keep this for debugging if needed
        }
    }

    public static void main(String[] args) {
        new Client("localhost", 8888);
    }
}