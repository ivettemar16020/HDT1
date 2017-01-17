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
	private JButton btnForward;
	private JButton btnBack;
	private JButton btnGuardar;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn10;
	private JButton btn11;
	private JButton btn12;
	private JButton btnOn_OFF;
	private JButton btnAM_FM;

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

		btnOn_OFF = new JButton("ON/OFF");
		btnOn_OFF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnOn_OFF.setBounds(18, 18, 98, 74);
		panel.add(btnOn_OFF);

		btnAM_FM = new JButton("AM/FM");
		btnAM_FM.setBounds(473, 18, 98, 74);
		panel.add(btnAM_FM);

		btnBack = new JButton("<<");
		btnBack.setFont(new Font("Lucida Grande", Font.PLAIN, 36));
		btnBack.setBounds(116, 186, 142, 57);
		panel.add(btnBack);

		btnForward = new JButton(">>");
		btnForward.setFont(new Font("Lucida Grande", Font.PLAIN, 36));
		btnForward.setBounds(330, 186, 142, 57);
		panel.add(btnForward);

		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(260, 186, 68, 57);
		panel.add(btnGuardar);

		btn1 = new JButton("1");
		btn1.setBounds(18, 278, 51, 74);
		panel.add(btn1);

		btn2 = new JButton("2");
		btn2.setBounds(64, 278, 51, 74);
		panel.add(btn2);

		btn3 = new JButton("3");
		btn3.setBounds(110, 278, 51, 74);
		panel.add(btn3);

		btn4 = new JButton("4");
		btn4.setBounds(156, 278, 51, 74);
		panel.add(btn4);

		btn5 = new JButton("5");
		btn5.setBounds(202, 278, 51, 74);
		panel.add(btn5);

		btn6 = new JButton("6");
		btn6.setBounds(248, 278, 51, 74);
		panel.add(btn6);

		btn7 = new JButton("7");
		btn7.setBounds(294, 278, 51, 74);
		panel.add(btn7);

		btn8 = new JButton("8");
		btn8.setBounds(340, 278, 51, 74);
		panel.add(btn8);

		btn9 = new JButton("9");
		btn9.setBounds(386, 278, 51, 74);
		panel.add(btn9);

		btn10 = new JButton("10");
		btn10.setBounds(432, 278, 51, 74);
		panel.add(btn10);

		btn11 = new JButton("11");
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn11.setBounds(478, 278, 51, 74);
		panel.add(btn11);

		btn12 = new JButton("12");
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn12.setBounds(524, 278, 51, 74);
		panel.add(btn12);
	}
	// Escucha los eventos a suceder.
		private class Escucha implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnOn_OFF){

				}
}
}
}
