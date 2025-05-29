import java.io.*;
import java.net.*;

public class TCPChatServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);
        Socket client = serverSocket.accept();

        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);

        out.println("Connected to server.");
        System.out.println("Client: " + in.readLine());

        serverSocket.close();
    }
}
