package ChatApplication;

import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);
            System.out.println("Connected to chat server.");

            new ReadThread(socket).start();  // Read messages
            new WriteThread(socket).start(); // Send messages

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Thread for reading messages from server
    private static class ReadThread extends Thread {
        private BufferedReader in;

        public ReadThread(Socket socket) {
            try {
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void run() {
            String response;
            try {
                while ((response = in.readLine()) != null) {
                    System.out.println(response);
                }
            } catch (IOException e) {
                System.out.println("Connection closed.");
            }
        }
    }

    // Thread for sending messages to server
    private static class WriteThread extends Thread {
        private PrintWriter out;
        private BufferedReader console;

        public WriteThread(Socket socket) {
            try {
                out = new PrintWriter(socket.getOutputStream(), true);
                console = new BufferedReader(new InputStreamReader(System.in));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void run() {
            try {
                String message;
                while ((message = console.readLine()) != null) {
                    out.println(message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
