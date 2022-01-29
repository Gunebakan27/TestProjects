package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class calculate extends JFrame {

	private JPanel contentPane;
	private JTextField screen;
	String islem;
	double sayi1,sayi2,sonuc,hafiza;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculate frame = new calculate();
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
	public calculate() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 671, 661);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText("");
			
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(158, 230, 130, 62);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("00");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!screen.getText().isEmpty()) {
					screen.setText(screen.getText()+"00");
			}}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(228, 510, 60, 62);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton(".");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText(screen.getText()+".");
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBounds(298, 510, 60, 62);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("0");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText(screen.getText()+"0");
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_3.setBounds(158, 510, 60, 62);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("3");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText(screen.getText()+"3");
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_4.setBounds(298, 442, 60, 62);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("2");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText(screen.getText()+"2");
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_5.setBounds(228, 442, 60, 62);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("1");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText(screen.getText()+"1");
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_6.setBounds(158, 442, 60, 62);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("%");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!screen.getText().isEmpty()) {
					sayi1=Integer.valueOf(screen.getText());
					islem="yuzde";
					screen.setText("");
				}
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_7.setBounds(440, 303, 60, 62);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("/");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!screen.getText().isEmpty()) {
					sayi1=Integer.valueOf(screen.getText());
					islem="bolme";
					screen.setText("");
				}
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_8.setBounds(368, 303, 60, 62);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("4");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText(screen.getText()+"4");
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_9.setBounds(158, 373, 60, 62);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("5");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText(screen.getText()+"5");
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_10.setBounds(228, 373, 60, 62);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("6");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText(screen.getText()+"6");
			}
		});
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_11.setBounds(298, 370, 60, 62);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("+");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!screen.getText().isEmpty()) {
					sayi1=Double.valueOf(screen.getText());
					islem="toplama";
					screen.setText("");
				}
				
				
			}
		});
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_12.setBounds(368, 442, 60, 130);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("-");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!screen.getText().isEmpty()) {
					sayi1=Double.valueOf(screen.getText());
					islem="cikar";
					screen.setText("");
				}
			}
		});
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_13.setBounds(368, 373, 60, 62);
		contentPane.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("7");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText(screen.getText()+"7");
			}
		});
		btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_14.setBounds(158, 303, 60, 62);
		contentPane.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("8");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText(screen.getText()+"8");
			}
		});
		btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_15.setBounds(228, 301, 60, 62);
		contentPane.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("9");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText(screen.getText()+"9");
			}
		});
		btnNewButton_16.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_16.setBounds(298, 303, 60, 62);
		contentPane.add(btnNewButton_16);
		
		JButton btnX = new JButton("x");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!screen.getText().isEmpty()) {
					sayi1=Double.valueOf(screen.getText());
					islem="carpma";
					screen.setText("");
				}
			}
		});
		btnX.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnX.setBounds(440, 373, 60, 62);
		contentPane.add(btnX);
		
		JButton btnNewButton_12_1 = new JButton("=");
		btnNewButton_12_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!screen.getText().isEmpty()) {
					sayi2=Double.valueOf(screen.getText());
				if(islem.equals("toplama")){
				sonuc=sayi1+sayi2;
				if(sonuc%1==0) {
				int sonucInt=(int) sonuc;
					screen.setText(String.valueOf(sonucInt));
				}else {
				screen.setText(String.valueOf(sonuc));
				}}
				if(islem.equals("bolme")){
					sonuc=sayi1/sayi2;
					if(sonuc%1==0) {
						int sonucInt=(int) sonuc;
						screen.setText(String.valueOf(sonucInt));
					}else {
					screen.setText(String.valueOf(sonuc));
					}}
				if(islem.equals("carpma")){
					sonuc=sayi1*sayi2;
					if(sonuc%1==0) {
						int sonucInt=(int) sonuc;
						screen.setText(String.valueOf(sonucInt));
					}else {
					screen.setText(String.valueOf(sonuc));
					}}
				if(islem.equals("cikar")){
					sonuc=sayi1-sayi2;
					if(sonuc%1==0) {
						int sonucInt=(int) sonuc;
						screen.setText(String.valueOf(sonucInt));
					}else {
					screen.setText(String.valueOf(sonuc));
					}}
				if(islem.equals("yuzde")){
					sonuc=(sayi1*sayi2)/100;
					if(sonuc%1==0) {
						int sonucInt=(int) sonuc;
						screen.setText(String.valueOf(sonucInt));
					}else {
					screen.setText(String.valueOf(sonuc));
					}}
				}}
		});
		btnNewButton_12_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_12_1.setBounds(440, 442, 60, 130);
		contentPane.add(btnNewButton_12_1);
		
		JButton btnM_1 = new JButton("M");
		btnM_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screen.setText(String.valueOf(hafiza));
			}
		});
		btnM_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnM_1.setBounds(298, 230, 60, 62);
		contentPane.add(btnM_1);
		
		JButton btnM = new JButton("M+");
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hafiza=Double.valueOf(screen.getText());
				screen.setText("");
			}
		});
		btnM.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnM.setBounds(368, 230, 60, 62);
		contentPane.add(btnM);
		
		JButton btnAc = new JButton("AC");
		btnAc.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAc.setBounds(440, 230, 60, 62);
		contentPane.add(btnAc);
		
		screen = new JTextField();
		screen.setHorizontalAlignment(SwingConstants.RIGHT);
		screen.setFont(new Font("Times New Roman", Font.BOLD, 50));
		screen.setBounds(156, 161, 344, 59);
		contentPane.add(screen);
		screen.setColumns(10);
	}
}
