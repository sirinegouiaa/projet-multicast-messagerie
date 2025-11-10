package client_serveur;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
	public static void main(String[]args) {
		try {
			Socket s = new Socket("localhost",1234);
			InputStream is=s.getInputStream();
			OutputStream os=s.getOutputStream();
			System.out.println("lire un nombre au clavier");
			Scanner clavier = new Scanner(System.in);
			int nb=clavier.nextInt();
			System.out.println("envoyer le nombre" + nb + "au serveur");
			os.write(nb);
			System.out.println("attendre la reponse du serveur");
			int rep=is.read();
			System.out.println("la reponse est :" + rep);		
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
