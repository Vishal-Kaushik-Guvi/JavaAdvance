import java.io.*;
import java.net.*;

public class ClientSide {
public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            out.println("Hello Server, this is Vishal!");
            String response = in.readLine();
            System.out.println("Server says: " + response);

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
