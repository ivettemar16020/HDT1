import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
	private JLabel lblEmisora;
	
	private IRadio miRadio; //AQUI SE INSTANCIA LA INTERFACE DEL RADIO

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
		
		miRadio = new ControlRadio();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 588, 366);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		lblEmisora = new JLabel("");
		lblEmisora.setBackground(Color.WHITE);
		lblEmisora.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmisora.setFont(new Font("Lucida Grande", Font.PLAIN, 60));
		lblEmisora.setBounds(116, 56, 356, 89);
		panel.add(lblEmisora);

		btnOn_OFF = new JButton("ON/OFF");
		btnOn_OFF.setBounds(18, 18, 98, 74);
		panel.add(btnOn_OFF);
		btnOn_OFF.addActionListener(new Escucha());

		btnAM_FM = new JButton("AM/FM");
		btnAM_FM.setBounds(473, 18, 98, 74);
		panel.add(btnAM_FM);
		btnAM_FM.setEnabled(false);
		btnAM_FM.addActionListener(new Escucha());

		btnBack = new JButton("<<");
		btnBack.setFont(new Font("Lucida Grande", Font.PLAIN, 36));
		btnBack.setBounds(116, 186, 142, 57);
		panel.add(btnBack);
		btnBack.setEnabled(false);
		btnBack.addActionListener(new Escucha());

		btnForward = new JButton(">>");
		btnForward.setFont(new Font("Lucida Grande", Font.PLAIN, 36));
		btnForward.setBounds(375, 186, 142, 57);
		panel.add(btnForward);
		btnForward.setEnabled(false);
		btnForward.addActionListener(new Escucha());

		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(260, 186, 112, 57);
		panel.add(btnGuardar);
		btnGuardar.setEnabled(false);

		btn1 = new JButton("1");
		btn1.setBounds(18, 278, 51, 74);
		panel.add(btn1);
		btn1.setEnabled(false);

		btn2 = new JButton("2");
		btn2.setBounds(64, 278, 51, 74);
		panel.add(btn2);
		btn2.setEnabled(false);

		btn3 = new JButton("3");
		btn3.setBounds(110, 278, 51, 74);
		panel.add(btn3);
		btn3.setEnabled(false);

		btn4 = new JButton("4");
		btn4.setBounds(156, 278, 51, 74);
		panel.add(btn4);
		btn4.setEnabled(false);

		btn5 = new JButton("5");
		btn5.setBounds(202, 278, 51, 74);
		panel.add(btn5);
		btn5.setEnabled(false);

		btn6 = new JButton("6");
		btn6.setBounds(248, 278, 51, 74);
		panel.add(btn6);
		btn6.setEnabled(false);

		btn7 = new JButton("7");
		btn7.setBounds(294, 278, 51, 74);
		panel.add(btn7);
		btn7.setEnabled(false);

		btn8 = new JButton("8");
		btn8.setBounds(340, 278, 51, 74);
		panel.add(btn8);
		btn8.setEnabled(false);

		btn9 = new JButton("9");
		btn9.setBounds(386, 278, 51, 74);
		panel.add(btn9);
		btn9.setEnabled(false);

		btn10 = new JButton("10");
		btn10.setBounds(432, 278, 51, 74);
		panel.add(btn10);
		btn10.setEnabled(false);

		btn11 = new JButton("11");
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn11.setBounds(478, 278, 51, 74);
		panel.add(btn11);
		btn11.setEnabled(false);

		btn12 = new JButton("12");
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn12.setBounds(524, 278, 51, 74);
		panel.add(btn12);
		btn12.setEnabled(false);
	}
	// Escucha los eventos a suceder.
		private class Escucha implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnOn_OFF){
					try{
						miRadio.estado();
						if (miRadio.getEstado() == false){ //Cuando el radio esta encendido
							btnAM_FM.setEnabled(true);
							btn1.setEnabled(true);
							btn2.setEnabled(true);
							btn3.setEnabled(true);
							btn4.setEnabled(true);
							btn5.setEnabled(true);
							btn6.setEnabled(true);
							btn7.setEnabled(true);
							btn8.setEnabled(true);
							btn9.setEnabled(true);
							btn10.setEnabled(true);
							btn11.setEnabled(true);
							btn12.setEnabled(true);
							btnBack.setEnabled(true);
							btnGuardar.setEnabled(true);
							btnForward.setEnabled(true);
							lblEmisora.setVisible(true);
						}
						if (miRadio.getEstado() == true){ //Cuando el radio esta apagado 
							btnAM_FM.setEnabled(false);
							btn1.setEnabled(false);
							btn2.setEnabled(false);
							btn3.setEnabled(false);
							btn4.setEnabled(false);
							btn5.setEnabled(false);
							btn6.setEnabled(false);
							btn7.setEnabled(false);
							btn8.setEnabled(false);
							btn9.setEnabled(false);
							btn10.setEnabled(false);
							btn11.setEnabled(false);
							btn12.setEnabled(false);
							btnBack.setEnabled(false);
							btnGuardar.setEnabled(false);
							btnForward.setEnabled(false);
							lblEmisora.setVisible(false);
						}
					}
					catch(Exception e1){
						JOptionPane.showMessageDialog(null,"Error");

					}

				}
				if (e.getSource() == btnAM_FM){
					try{
						miRadio.frecuencia();
						//true = AM
						if (miRadio.getFrecuencia() == true){
							btnAM_FM.setText("AM");
						}
						//false = FM
						else if (miRadio.getFrecuencia() == false){
							btnAM_FM.setText("FM");
						}
					}
					catch(Exception e1){
						JOptionPane.showMessageDialog(null,"Error");
					}

				}
				
				if (e.getSource() == btnForward){
					try{
						// true == avanzar
						miRadio.cambiar(true);
						lblEmisora.setText(Float.toString(miRadio.getEmisora()));
					}
					catch(Exception e1){
						JOptionPane.showMessageDialog(null,"Error");
					}
					
				}
				
				if (e.getSource() == btnBack){
					try{
						// false == retroceder
						miRadio.cambiar(false);
						lblEmisora.setText(Float.toString(miRadio.getEmisora()));
					}
					catch(Exception e1){
						JOptionPane.showMessageDialog(null,"Error");
					}
					
				}
				
				if (e.getSource() == btnGuardar){
					try{
						
					}
					catch(Exception e1){
						JOptionPane.showMessageDialog(null,"Error");
					}

				}
}
			
}
}
