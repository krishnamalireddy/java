package krishna;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class Web extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel label;
	private JLabel label1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Web frame = new Web();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Web() {
		setBackground(Color.CYAN);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
	
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
	
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{ };
		gbl_contentPane.rowHeights = new int[]{};
		gbl_contentPane.columnWeights = new double[]{ };
		gbl_contentPane.rowWeights = new double[]{  };
		contentPane.setLayout(gbl_contentPane);

JButton btnGoogleSearch = new JButton("Google Search");
GridBagConstraints gbc_btnGoogleSearch = new GridBagConstraints();
btnGoogleSearch.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				  String s=textField.getText(); 
			       
				
			label.setText("searched for--->"+s);
			 }
}) ;

textField = new JTextField();
GridBagConstraints gbc_textField = new GridBagConstraints();
gbc_textField.fill = GridBagConstraints.BOTH;
gbc_textField.insets = new Insets(0, 0, 5, 5);
gbc_textField.gridwidth = 5;
gbc_textField.gridx = 2;
gbc_textField.gridy = 3;
contentPane.add(textField, gbc_textField);
textField.setColumns(10);
gbc_btnGoogleSearch.insets = new Insets(0, 0, 5, 5);
gbc_btnGoogleSearch.gridx = 3;
gbc_btnGoogleSearch.gridy = 5;

contentPane.add(btnGoogleSearch, gbc_btnGoogleSearch);
JButton btnImFeelingLucky = new JButton("Im Feeling Lucky");
btnImFeelingLucky.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent g) {
		label1.setText("You are Lucky");
	}
});
GridBagConstraints gbc_btnImFeelingLucky = new GridBagConstraints();
gbc_btnImFeelingLucky.insets = new Insets(0, 0, 5, 5);
gbc_btnImFeelingLucky.gridx = 5;
gbc_btnImFeelingLucky.gridy = 5;
contentPane.add(btnImFeelingLucky, gbc_btnImFeelingLucky);
		
label = new JLabel();
label.setBounds(10, 64, 414, 14);
GridBagConstraints gbc_label = new GridBagConstraints();
gbc_label.gridwidth = 2;
gbc_label.insets = new Insets(0, 0, 0, 5);
gbc_label.gridx = 3;
gbc_label.gridy = 7;
contentPane.add(label, gbc_label);
label1 = new JLabel();
label.setBounds(10, 64, 414, 14);
GridBagConstraints gbc_label1 = new GridBagConstraints();
gbc_label1.gridwidth = 2;
gbc_label1.insets = new Insets(0, 0, 0, 5);
gbc_label1.gridx = 4;
gbc_label1.gridy = 8;
contentPane.add(label1, gbc_label1);
		
		JLabel lblGoogle = new JLabel("Google");
		lblGoogle.setForeground(Color.BLUE);
		lblGoogle.setFont(new Font("Tahoma", Font.PLAIN, 31));
		lblGoogle.setBackground(Color.CYAN);
		GridBagConstraints gbc_lblGoogle = new GridBagConstraints();
		gbc_lblGoogle.gridwidth = 3;
		gbc_lblGoogle.insets = new Insets(0, 0, 5, 5);
		gbc_lblGoogle.gridx = 3;
		gbc_lblGoogle.gridy = 2;
		contentPane.add(lblGoogle, gbc_lblGoogle);
	}

}
