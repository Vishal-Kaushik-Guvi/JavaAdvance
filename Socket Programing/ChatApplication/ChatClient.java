package ChatApplication;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChatClient {
     public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000)) {
            System.out.println("Connected to server!");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            Scanner sc = new Scanner(System.in);

            String msgIn, msgOut;
            while (true) {
                // Send
                System.out.print("You: ");
                msgOut = sc.nextLine();
                out.println(msgOut);

                if (msgOut.equalsIgnoreCase("exit")) {
                    System.out.println("Chat ended by client.");
                    break;
                }

                // Receive
                msgIn = in.readLine();
                if (msgIn == null || msgIn.equalsIgnoreCase("exit")) {
                    System.out.println("Server disconnected.");
                    break;
                }
                System.out.println("Server: " + msgIn);
            }

            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}