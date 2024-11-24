import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class LoginPage extends JFrame
{
	JLabel l0,l1,l2,l3,l4;
	JTextField t1;
	JPasswordField t2;
	JButton b1,b2,b3;
	
	LoginPage(String s1)
	{
		super(s1);

	}
	
	LoginPage()
	{

	}

	void setComponents()
	{
		Cursor c1=new Cursor(Cursor.HAND_CURSOR);
		Font f1=new Font("Times New Roman",Font.BOLD,28);
		Font f2=new Font("Callibri",Font.ITALIC,15);

		l0=new JLabel();
		ImageIcon i1 = new ImageIcon("C:/Users/mukesh choudhary/Downloads/login.png");
		l0.setIcon(i1);

		l1=new JLabel("Welcom to coding seekho institute");
		l1.setFont(f1);
		l1.setForeground(Color.RED);
		l2=new JLabel("USERNAME :");
		l2.setFont(f2);
		l2.setForeground(Color.BLUE);
		l3=new JLabel("PASSWORD :");
		l3.setFont(f2);
		l3.setForeground(Color.BLUE);
		l4=new JLabel();

		t1=new JTextField();
		t2=new JPasswordField();

		b1=new JButton("Login");
		b1.setBackground(Color.GRAY);
		b1.setForeground(Color.WHITE);
		b1.setCursor(c1);
		b2=new JButton("Autofill");
		b2.setBackground(Color.GRAY);
		b2.setForeground(Color.WHITE);
		b2.setCursor(c1);
		b3=new JButton("Add");
		b3.setBackground(Color.GRAY);
		b3.setForeground(Color.WHITE);
		b3.setCursor(c1);

		setLayout(null);
		add(l0);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		add(b3);
		
		l0.setBounds(100,75,150,150);
		l1.setBounds(125,50,450,30);
		l2.setBounds(100,200,100,30);
		l3.setBounds(100,350,100,30);
		l4.setBounds(100,550,200,30);
		t1.setBounds(350,200,100,30);
		t2.setBounds(350,350,100,30);
		b1.setBounds(300,450,100,30);
		b2.setBounds(500,450,100,30);
		b3.setBounds(100,450,100,30);

		b1.addActionListener(new Log());
		b2.addActionListener(new Clear());
		b3.addActionListener(new Add());

		l1.addMouseListener(new MouseL());
		
	}

	class MouseL implements MouseListener
	{
		public void mouseClicked(MouseEvent e1)
		{
			
		}

		public void mousePressed(MouseEvent e1)
		{
			
		}
		
		public void mouseReleased(MouseEvent e1)
		{
			
		}

		public void mouseEntered(MouseEvent e1)
		{
			l1.setForeground(Color.YELLOW);
		}

		public void mouseExited(MouseEvent e1)
		{
			l1.setForeground(Color.BLACK);
		}
	}

	public static void main(String []args)
	{
		LoginPage s1=new LoginPage("Welcom to My Profile");
		s1.setSize(700,700);
		s1.setVisible(true);
		s1.setComponents();
		s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	class Log implements ActionListener
	{
		public void actionPerformed(ActionEvent e1)
		{
			String s1=t1.getText();
			String s2=t2.getText();

			if(s1.equals("coding") && s2.equals("seekho"))
			{
				JOptionPane.showMessageDialog(null,"Login Successfully.");							
				l4.setText("Login Successful");	
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Login UnSuccessfully.");
				l4.setText("Login UnSuccessful");
			}
		}
	}

	class Clear implements ActionListener
	{
		public void actionPerformed(ActionEvent e1)
		{
			t1.setText("coding");
			t2.setText("seekho");
		}
	}

	class Add implements ActionListener
	{
		public void actionPerformed(ActionEvent e1)
		{
			try
			{
				int a=Integer.parseInt(t1.getText());
				int b=Integer.parseInt(t2.getText());
				int c=a+b;
				l4.setText("Addition is "+c);
			}
			catch(Exception e2)
			{
				l4.setText("Please Enter a number only");	
			}
	
		}
	}
}