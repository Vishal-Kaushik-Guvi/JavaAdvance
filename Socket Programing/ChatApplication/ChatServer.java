package ChatApplication;

import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {
 public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Server started. Waiting for client...");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            Scanner sc = new Scanner(System.in);

            String msgIn, msgOut;
            while (true) {
                // Receive
                msgIn = in.readLine();
                if (msgIn == null || msgIn.equalsIgnoreCase("exit")) {
                    System.out.println("Client disconnected.");
                    break;
                }
                System.out.println("Client: " + msgIn);

                // Send
                System.out.print("You: ");
                msgOut = sc.nextLine();
                out.println(msgOut);

                if (msgOut.equalsIgnoreCase("exit")) {
                    System.out.println("Chat ended by server.");
                    break;
                }
            }

            socket.close();
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
