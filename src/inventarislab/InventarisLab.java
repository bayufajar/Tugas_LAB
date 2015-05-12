package inventarislab;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class InventarisLab extends JFrame implements ActionListener {

	public JLabel label1;
	public JLabel label2;
	public JLabel label3;
	public JLabel label4;
	public JLabel label5;
	public JTextField txt1;
	public JTextField txt2;
	public JTextField txt3;
	public JTextField txt4;
	public JComboBox cmb1;
	public JRadioButton rd1;
	public JRadioButton rd2;
	public JRadioButton rd3;
	public JButton button1;
	public RuangLab LAB;

	public InventarisLab(String title) {
		super(title);
		setBounds(0, 0, 300, 400);
		setResizable(false);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		label1 = new JLabel("LAB ");
		label1.setLocation(10, 15);
		label1.setSize(label1.getPreferredSize());

		label2 = new JLabel("Fakultas");
		label2.setLocation(10, 40);
		label2.setSize(label2.getPreferredSize());

		label3 = new JLabel("Jurusan");
		label3.setLocation(10, 70);
		label3.setSize(label3.getPreferredSize());

		label4 = new JLabel("Panjang LAB");
		label4.setLocation(10, 100);
		label4.setSize(label4.getPreferredSize());
		
		label5 = new JLabel("Lebar LAB");
		label5.setLocation(10, 130);
		label5.setSize(label5.getPreferredSize());

		rd1 = new JRadioButton("A");
		rd1.setLocation(90, 10);
		rd1.setSize(rd1.getPreferredSize());
		rd1.setSelected(true);
		rd1.addActionListener(this);

		rd2 = new JRadioButton("B");
		rd2.setLocation(130, 10);
		rd2.setSize(rd2.getPreferredSize());
		rd2.addActionListener(this);

		rd3 = new JRadioButton("C");
		rd3.setLocation(170, 10);
		rd3.setSize(rd3.getPreferredSize());
		rd3.addActionListener(this);

		txt1 = new JTextField(15);
		txt1.setLocation(90, 40);
		txt1.setSize(txt1.getPreferredSize());
		
		txt2 = new JTextField(15);
		txt2.setLocation(90, 70);
		txt2.setSize(txt1.getPreferredSize());

		txt3 = new JTextField(15);
		txt3.setLocation(90, 100);
		txt3.setSize(txt3.getPreferredSize());
		
		txt4 = new JTextField(15);
		txt4.setLocation(90, 130);
		txt4.setSize(txt3.getPreferredSize());

		button1 = new JButton("PROCESS");
		button1.setLocation(10, 200);
		button1.setSize(button1.getPreferredSize());
		button1.addActionListener(this);

		getContentPane().add(label1);
		getContentPane().add(label2);
		getContentPane().add(label3);
		getContentPane().add(label4);
		getContentPane().add(label5);
		getContentPane().add(txt1);
		getContentPane().add(txt2);
		getContentPane().add(txt3);
		getContentPane().add(txt4);
		getContentPane().add(rd1);
		getContentPane().add(rd2);
		getContentPane().add(rd3);
		getContentPane().add(button1);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1) {
			if(bisaLanjutBuatKelas()){
				String fakultas = txt1.getText();
				String jurusan = txt2.getText();
				double panjang = Double.parseDouble(txt3.getText());
				double lebar = Double.parseDouble(txt4.getText());
				char lab = 'A';
				if(rd1.isSelected())lab = 'A';
				else if(rd2.isSelected())lab = 'B';
				else if(rd3.isSelected())lab = 'C';
				LAB = new RuangLab(jurusan, fakultas, lab, panjang, lebar);
			}				
		}
		if (rd1.isSelected() && e.getSource() == rd1) {
			rd2.setSelected(false);
			rd3.setSelected(false);
		}
		if (rd2.isSelected() && e.getSource() == rd2) {
			rd1.setSelected(false);
			rd3.setSelected(false);
		}
		if (rd3.isSelected() && e.getSource() == rd3) {
			rd2.setSelected(false);
			rd1.setSelected(false);
		}
		if(txt1.getText().isEmpty()==false)txt1.setBackground(Color.white);
		if(txt2.getText().isEmpty()==false)txt2.setBackground(Color.white);
		if(txt3.getText().isEmpty()==false)txt3.setBackground(Color.white);
		if(txt4.getText().isEmpty()==false)txt4.setBackground(Color.white);
	}
	
	public boolean bisaLanjutBuatKelas(){//method untuk cek apakah textfield telah terisi
		int belumterisi = 0;
		if(txt1.getText().isEmpty()){
			txt1.setBackground(Color.pink);
			belumterisi++;
		}
		if(txt2.getText().isEmpty()){
			txt2.setBackground(Color.pink);
			belumterisi++;
		}
		if(txt3.getText().isEmpty()){
			txt3.setBackground(Color.pink);
			belumterisi++;
		}
		if(txt4.getText().isEmpty()){
			txt4.setBackground(Color.pink);
			belumterisi++;
		}
		if(belumterisi==0)return true;
		else return false;
	}

	public static void main(String[] args) {
		InventarisLab IL = new InventarisLab("Inventaris LAB");
		IL.setTitle("Inventaris LAB");
	}

}
