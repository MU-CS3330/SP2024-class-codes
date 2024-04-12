package edu.mu.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class AnnoyingButton extends JFrame {
	
	private static final long serialVersionUID = 1216047884465433487L;
	private JPanel contentPanel;
	
	public AnnoyingButton() {
		setTitle("My Annoying Button Application");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		
		contentPanel = new JPanel();
		setContentPane(contentPanel);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Try to Click Me!!");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Random rand = new Random();
				int x = rand.nextInt()%100 + 100;
				int y = rand.nextInt()%100 + 100;
				btnNewButton.setBounds(x, y, 200, 27);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(169, 131, 200, 27);
		contentPanel.add(btnNewButton);
		
	}
}
