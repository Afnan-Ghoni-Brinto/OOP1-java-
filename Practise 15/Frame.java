import java.lang.*;
import javax.swing.*;
import java.awt.*;
public class Frame extends JFrame{
	JPanel panel;
	JLabel label;
	JTextField jf1,jf2;
	
	Color c1,c2,c3;
	Font f1;
	
	public Frame(){
		super("Demo");
		super.setBounds(300,200,1200,600);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel=new JPanel();
		c1=new Color(248,239,186);
		panel.setBackground(c1);
		panel.setLayout(null);
		
		label=new JLabel("Inttroductory Class of GUI");
		label.setBounds(30,40,300,50);
		f1=new Font("Cambria",Font.BOLD,16);
		c2=new Color(179,57,57);
		c3=new Color(255,255,255);
		label.setFont(f1);
		label.setBackground(c2);
		
		label.setForeground(c3);
		label.setOpaque(true);
		panel.add(label);
		
		jf1=new JTextField();
		jf1.setBounds(30,100,300,40);
		panel.add(jf1);
		
		jf2=new JTextField();
		jf2.setBounds(30,170,300,40);
		panel.add(jf2);
		
		
		super.add(panel);
		
	}
}