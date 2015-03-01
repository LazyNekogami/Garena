import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class gui {

	public gui() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Garena Auto-Joiner");

		JPanel panel = new JPanel();
		JButton button = new JButton("Button");
		button.addActionListener(new ActionListener() {
			Clicker cli = null;

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (null == cli) {
					cli = new Clicker();
				} else {
					cli.isRunning = !cli.isRunning;
				}

			}
		});
		
		panel.add(button);
		panel.setVisible(true);
		frame.add(panel);
		frame.setVisible(true);
	}
}
