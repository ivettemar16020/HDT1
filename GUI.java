import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 588, 366);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblEmisora = new JLabel("");
		lblEmisora.setBackground(Color.WHITE);
		lblEmisora.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmisora.setFont(new Font("Lucida Grande", Font.PLAIN, 60));
		lblEmisora.setBounds(116, 56, 356, 89);
		panel.add(lblEmisora);
		
		JButton btnOn_OFF = new JButton("ON/OFF");
		btnOn_OFF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnOn_OFF.setBounds(18, 18, 98, 74);
		panel.add(btnOn_OFF);
		
		JButton btnAM_FM = new JButton("AM/FM");
		btnAM_FM.setBounds(473, 18, 98, 74);
		panel.add(btnAM_FM);
		
		JButton btnBack = new JButton("<<");
		btnBack.setFont(new Font("Lucida Grande", Font.PLAIN, 36));
		btnBack.setBounds(116, 186, 142, 57);
		panel.add(btnBack);
		
		JButton btnForward = new JButton(">>");
		btnForward.setFont(new Font("Lucida Grande", Font.PLAIN, 36));
		btnForward.setBounds(330, 186, 142, 57);
		panel.add(btnForward);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(260, 186, 68, 57);
		panel.add(btnGuardar);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(18, 278, 51, 74);
		panel.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(64, 278, 51, 74);
		panel.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(110, 278, 51, 74);
		panel.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(156, 278, 51, 74);
		panel.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(202, 278, 51, 74);
		panel.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(248, 278, 51, 74);
		panel.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(294, 278, 51, 74);
		panel.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(340, 278, 51, 74);
		panel.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(386, 278, 51, 74);
		panel.add(btn9);
		
		JButton btn10 = new JButton("10");
		btn10.setBounds(432, 278, 51, 74);
		panel.add(btn10);
		
		JButton btn11 = new JButton("11");
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn11.setBounds(478, 278, 51, 74);
		panel.add(btn11);
		
		JButton btn12 = new JButton("12");
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn12.setBounds(524, 278, 51, 74);
		panel.add(btn12);
	}
}
