package school;

import javax.swing.*;
import java.awt.*;

class NortPanel extends JPanel{
	public NortPanel() {
		setBackground(Color.LIGHT_GRAY);
		setSize(50,300);
		setLayout(new FlowLayout());
		add(new JButton("Open"));
		add(new JButton("Read"));
		add(new JButton("Close"));
	}
}

class CenterPanel extends JPanel{
	public CenterPanel() {
		setLayout(null);
		JLabel hello = new JLabel("Hello Java!");
		
		hello.setBounds(100, 50, 100, 20);
		
		add(hello);
	}
}

public class OpenChallenge extends JFrame {
	public OpenChallenge() {
		setTitle("open Challenge 8");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		NortPanel NPan = new NortPanel();
		CenterPanel CPan = new CenterPanel();
		
		add(NPan,BorderLayout.NORTH);
		add(CPan,BorderLayout.CENTER);
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new OpenChallenge();
	}

}

