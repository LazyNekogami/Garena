import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class gui {
	private JButton button;
	
	private void changeButtonText(){
		if(button.getText().equals("Start")){
			button.setText("Finish");
		}
		else if(button.getText().equals("Finish")){
			button.setText("Start");
		}
	}

	public gui() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Garena Auto-Joiner");

		JPanel panel = new JPanel();
		button = new JButton("Start");
		button.addActionListener(new ActionListener() {
			Clicker myClicker = null;

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (myClicker == null || !myClicker.isAlive()) {
					myClicker = new Clicker();
					myClicker.start();
					
				} else {
					myClicker.finish();
					
				}
				changeButtonText();

			}
		});

		panel.add(button);
		panel.setVisible(true);
		frame.add(panel);
		frame.setVisible(true);
	}
}
