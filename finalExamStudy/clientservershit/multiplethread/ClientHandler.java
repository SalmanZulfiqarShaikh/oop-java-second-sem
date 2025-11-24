package finalExamStudy.clientservershit.multiplethread;
import java.io.*;
import java.net.Socket;

class ClientHandler extends Thread {
    private BufferedReader serverInput;

    public ClientHandler(Socket s) throws IOException {
        this.serverInput = new BufferedReader(new InputStreamReader(s.getInputStream()));
    }

    @Override
    public void run() {
        try {
            String msg;
            while ((msg = serverInput.readLine()) != null) {
                // Print the response asynchronously as soon as it arrives
                System.out.println("\n[Server Echo]: " + msg);
                // Re-display the prompt so the user can continue typing
                System.out.print("Enter message: ");
            }
        } catch (IOException e) {
            // This usually happens when the server closes the connection
            System.out.println("\nConnection closed by server. Exiting client.");
        }
    }
}