package inventarislab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;





public class InventarisLab extends JFrame
        implements ActionListener {

    public JLabel label1;
    public JLabel label2;
    public JLabel label3;
    public JTextField txt1;
    public JTextField txt2;
    public JTextField txt3;
    public JComboBox cmb1;
    public JRadioButton rd1;
    public JRadioButton rd2;
    public JRadioButton rd3;
    public JButton button1;

    public InventarisLab(String title) {
        super(title);
        setBounds(0, 0, 300, 400);
        setResizable(false);
        getContentPane().setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        label1 = new JLabel("LAB  : ");
        label1.setLocation(10, 15);
        label1.setSize(label1.getPreferredSize());

        
        label2 = new JLabel("panjang : ");
        label2.setLocation(10,40);
        label2.setSize(label2.getPreferredSize());
        
        
        label3 = new JLabel("Lebar : ");
        label3.setLocation(10,70);
        label3.setSize(label3.getPreferredSize());
        
        
      rd1 = new JRadioButton("A");
      rd1.setLocation(80,10);
      rd1.setSize(rd1.getPreferredSize());
      
      
      rd2 = new JRadioButton("B");
      rd2.setLocation(120,10);
      rd2.setSize(rd2.getPreferredSize());
      
      rd3 = new JRadioButton("C");
      rd3.setLocation(160,10);
      rd3.setSize(rd3.getPreferredSize());
      
      txt1 = new JTextField(15);
      txt1.setLocation(80,40);
      txt1.setSize(txt1.getPreferredSize());
      
      
        txt3 = new JTextField(15);
        txt3.setLocation(80,70);
        txt3.setSize(txt3.getPreferredSize());
        
        button1 = new JButton("PROCESS");
        button1.setLocation(10, 100);
        button1.setSize(button1.getPreferredSize());
        button1.addActionListener(this);

        getContentPane().add(label1);
        getContentPane().add(button1);
        getContentPane().add(label2);
        getContentPane().add(label3);
        getContentPane().add(txt1);
        getContentPane().add(txt3);
        getContentPane().add(rd1);
        getContentPane().add(rd2);
        getContentPane().add(rd3);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {

           
        }
    }

    public static void main(String[] args) {
        InventarisLab IL = 
                new InventarisLab("Inventaris LAB");
        IL.setTitle("Inventaris LAB");
    }

}
