

import java.awt.Dimension;

import javax.swing.*;

//Class to precise who is connected : Client or Server
public class ClientServer {

	public static void main(String[] args) {

		Object[] selectionValues = { "Server", "Client" };
		String initialSection = "Server";
		String serverName = "localhost";
		
		UIManager.put("OptionPane", new Dimension(500 ,500)); 
		
		Object selection = JOptionPane.showInputDialog(null, "Login as : ", "Chat Application NPR",
				JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSection);
		
		if (selection.equals("Server")) {
			String[] arguments = new String[] {};
			JOptionPane.showMessageDialog(null, "The server is running", "Successful", JOptionPane.DEFAULT_OPTION);
			MultiThreadChatServerSync.main(arguments);
		} else if (selection.equals("Client")) {
			String[] arguments = new String[] { serverName };
			new ChatClient();
			ChatClient.main(arguments);
		}

	}

}