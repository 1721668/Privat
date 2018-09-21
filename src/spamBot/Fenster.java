package spamBot;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Fenster{

	public Fenster() {
		initialize();
	}

	private void initialize() {
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		Font f = new Font("Areal", Font.PLAIN, (int)(size.height*0.02));
		JFrame frm = new JFrame();
		frm.setSize(size);
		frm.setResizable(false);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.getContentPane().setLayout(null);
		
		JLabel lblAnzahlNachrichten = new JLabel("Anzahl Nachrichten  (1-100 St.)");
		lblAnzahlNachrichten.setBounds((int)(frm.getWidth()*0.1), (int)(frm.getHeight()*0.2), (int)(frm.getWidth()*0.3), (int)(frm.getHeight()*0.05));
		lblAnzahlNachrichten.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblAnzahlNachrichten.setVerticalAlignment(SwingConstants.CENTER);
		lblAnzahlNachrichten.setHorizontalAlignment(SwingConstants.LEFT);
		lblAnzahlNachrichten.setFont(f);
		frm.getContentPane().add(lblAnzahlNachrichten);
		
		JSlider anzahl = new JSlider();
		anzahl.setMajorTickSpacing(10);
		anzahl.setForeground(Color.DARK_GRAY);
		anzahl.setBackground(Color.LIGHT_GRAY);
		anzahl.setValue(1);
		anzahl.setBounds((int)(frm.getWidth()*0.5),(int)(lblAnzahlNachrichten.getBounds().getMinY()),(int)(frm.getWidth()*0.4),(int)(lblAnzahlNachrichten.getBounds().height));
		anzahl.setMinimum(1);
		anzahl.setFont(f);
		frm.getContentPane().add(anzahl);
		
		JLabel lblNewLabel = new JLabel("Enter-Taste:");
		lblNewLabel.setBounds((int)(frm.getWidth()*0.1), (int)(frm.getHeight()*0.3), (int)(frm.getWidth()*0.3), (int)(frm.getHeight()*0.05));
		frm.getContentPane().add(lblNewLabel);
		lblNewLabel.setFont(f);
		
		Checkbox enter = new Checkbox("Mit enter schreiben?");
		enter.setForeground(Color.BLACK);
		enter.setBackground(Color.LIGHT_GRAY);
		enter.setFont(f);
		enter.setBounds((int)(frm.getWidth()*0.5),(int)(lblNewLabel.getBounds().getMinY()),(int)(frm.getWidth()*0.4),(int)(lblNewLabel.getBounds().height));
		frm.getContentPane().add(enter);
		
		
		JLabel lblZeitpuffer = new JLabel("Zeitpuffer (sek.)");
		lblZeitpuffer.setVerticalAlignment(SwingConstants.CENTER);
		lblZeitpuffer.setHorizontalAlignment(SwingConstants.LEFT);
		lblZeitpuffer.setAlignmentY(1.0f);
		lblZeitpuffer.setFont(f);
		lblZeitpuffer.setBounds((int)(frm.getWidth()*0.1), (int)(frm.getHeight()*0.4), (int)(frm.getWidth()*0.3), (int)(frm.getHeight()*0.05));
		frm.getContentPane().add(lblZeitpuffer);
		
		JSlider puffer = new JSlider();
		puffer.setPaintLabels(true);
		puffer.setMinorTickSpacing(1);
		puffer.setMajorTickSpacing(1);
		puffer.setValue(1);
		puffer.setMaximum(10);
		puffer.setBackground(Color.LIGHT_GRAY);
		puffer.setFont(f);
		puffer.setBounds((int)(frm.getWidth()*0.5),(int)(lblZeitpuffer.getBounds().getMinY()),(int)(frm.getWidth()*0.4),(int)(lblZeitpuffer.getBounds().height));
		frm.getContentPane().add(puffer);
		
		JLabel lblVerzgerungBisStart = new JLabel("Verzögerung bis Start (sek.)");
		lblVerzgerungBisStart.setVerticalAlignment(SwingConstants.CENTER);
		lblVerzgerungBisStart.setHorizontalAlignment(SwingConstants.LEFT);
		lblVerzgerungBisStart.setAlignmentY(1.0f);
		lblVerzgerungBisStart.setFont(f);
		lblVerzgerungBisStart.setBounds((int)(frm.getWidth()*0.1), (int)(frm.getHeight()*0.5), (int)(frm.getWidth()*0.3), (int)(frm.getHeight()*0.05));
		frm.getContentPane().add(lblVerzgerungBisStart);
		
		JSlider verzögerung = new JSlider();
		verzögerung.setValue(1);
		verzögerung.setPaintLabels(true);
		verzögerung.setMinorTickSpacing(1);
		verzögerung.setMaximum(10);
		verzögerung.setMajorTickSpacing(1);
		verzögerung.setBackground(Color.LIGHT_GRAY);
		verzögerung.setFont(f);
		verzögerung.setBounds((int)(frm.getWidth()*0.5),(int)(lblVerzgerungBisStart.getBounds().getMinY()),(int)(frm.getWidth()*0.4),(int)(lblVerzgerungBisStart.getBounds().height));
		frm.getContentPane().add(verzögerung);
		
		JTextArea nachricht = new JTextArea();
		nachricht.setFont(new Font("Courier New", Font.PLAIN, (int)(size.height*0.03)));
		nachricht.setText("Hier Text Einfügen");
		nachricht.setBounds((int)(frm.getWidth()*0.1),(int)(frm.getHeight()*0.65),(int)(frm.getWidth()*0.6),(int)(frm.getHeight()*0.2));
		frm.getContentPane().add(nachricht);
		
		JButton btnStart = new JButton("Start");
		btnStart.setBounds((int)(frm.getWidth()*0.8),(int)(nachricht.getBounds().getMaxY()-frm.getHeight()*0.05),(int)(frm.getWidth()*0.1),(int)(frm.getHeight()*0.05));
		btnStart.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				frm.setExtendedState(JFrame.ICONIFIED);
				new SpamBot().schreiben(nachricht.getText(), verzögerung.getValue()*1000, anzahl.getValue(), puffer.getValue()*1000, enter.getState());
				
			}
			
		});
		frm.getContentPane().add(btnStart);
		
		frm.repaint();
		frm.setVisible(true);
	}
}
