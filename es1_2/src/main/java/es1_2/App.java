package es1_2;

import java.net.ServerSocket;
import java.net.Socket;

public class App {

    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(3000);
        System.out.println("Server in ascolto sulla porta 3000");
        boolean a = true;

        while (a) {

            Socket s = ss.accept();
            ClientHandler ch = new ClientHandler(s);
            ch.start();

        }
        ss.close();

    }
}
