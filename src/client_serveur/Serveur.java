package client_serveur;

import java.io.*;
import java.net.*;

public class Serveur {
	public static void main(String[]args) {
		try {
			ServerSocket ss=new ServerSocket(1234);
			System.out.println("j'attend la connecxion d'un client");
			Socket ClientSocket=ss.accept();
			System.out.println("nouveau client connecté");
			System.out.println("generation des objet inptstream et outputstream de la socket");
			InputStream is=ClientSocket.getInputStream();
			OutputStream os=ClientSocket.getOutputStream();
			System.out.println("j'attend un nombre (1 octet)!");
			int nb=is.read();
			System.out.println("j'envoie la réponse");
			os.write(nb*5);
			System.out.println("déconnexion du client");
			ClientSocket.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
