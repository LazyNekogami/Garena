import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SettingsFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3098199046429878039L;
	
	private JLabel delayBeforeEnterBTN_label;
	private JTextField delayBeforeEnterBTN_textField;
	private JButton delayBeforeEnterBTN_button;
	
	private JLabel delayBetweenCycles_label;
	private JTextField delayBetweenCycles_textField;
	private JButton delayBetweenCycles_button;
	
	
	public SettingsFrame() {
		// TODO Auto-generated constructor stub
		super("Settings");
		setBounds(100, 100, 200, 200);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		JPanel mainPanel = new JPanel();
		delayBeforeEnterBTN_label = new JLabel("700 ms");
		delayBeforeEnterBTN_button = new JButton("Submit Enter Delay");
		delayBeforeEnterBTN_textField = new JTextField();
		
		delayBetweenCycles_label = new JLabel("5000 ms");
		delayBetweenCycles_button = new JButton("Subit Cycles Delay");
		delayBetweenCycles_textField = new JTextField();
		
		delayBeforeEnterBTN_textField.setSize(delayBeforeEnterBTN_button.getSize());
		delayBetweenCycles_textField.setSize(delayBetweenCycles_button.getSize());
		
		mainPanel.add(delayBeforeEnterBTN_label);
		mainPanel.add(delayBeforeEnterBTN_button);
		mainPanel.add(delayBeforeEnterBTN_textField);
		mainPanel.add(delayBetweenCycles_label);
		mainPanel.add(delayBetweenCycles_button);
		mainPanel.add(delayBetweenCycles_textField);
		
		add(mainPanel);
		setVisible(true);
	}
}
