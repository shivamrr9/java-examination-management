import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;

class Frame1 extends Frame
{
	
	Label l1=new Label("ENTER MARKS");
	Label l2=new Label("VIEW MARKS");
	Label l3=new Label("CHECK GRAPHS");
	Label l4=new Label("EXIT");
	Label l5=new Label("JIIT EXAM MANAGEMENT SYSTEM");
	MenuBar mb=new MenuBar();
	Menu m1=new Menu("File");
	Menu m2=new Menu("Edit");
	//Menu m3=new Menu("");
	
	MenuItem m11=new MenuItem("Reset");
	MenuItem m13=new MenuItem("Home");
	MenuItem m12=new MenuItem("Exit");
	
	//MenuItem m31=new MenuItem("About Us");
	
	
	int x=190,cc=0;
	Frame1()
	{
		setLocation(100,50);
		setSize(1100,600);
		setLayout(null);
		//setResizable(false);
		addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
		l1.setBounds(450,200,200,60);add(l1);
		l1.setFont(new Font("arial",2,24));
		l2.setBounds(450,280,200,60);add(l2);
		l2.setFont(new Font("arial",2,24));
		l3.setBounds(450,360,200,60);add(l3);
		l3.setFont(new Font("arial",2,24));
		l4.setBounds(450,440,200,60);add(l4);
		l4.setFont(new Font("arial",2,24));
		l5.setBounds(350,120,420,40);add(l5);
		l5.setFont(new Font("arial",1,24));
		l5.setForeground(Color.red);
		addKeyListener(new KeyAdapter(){public void keyPressed(KeyEvent ee){down_press(ee);}});
		addKeyListener(new KeyAdapter(){public void keyPressed(KeyEvent ee){enter_press(ee);}});
		setMenuBar(mb);
		mb.add(m1);
		mb.add(m2);
		//mb.add(m3);
		m1.add(m11);
		//m3.add(m31);
		m11.setShortcut(new MenuShortcut('R'));
		m1.add(m12);
		m12.setShortcut(new MenuShortcut('E'));
		m1.add(m13);
		m13.setShortcut(new MenuShortcut('H'));
		m12.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){exit();}});
		//m31.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){ff();}});
		
	}
	
	void ff()
	{
		Frame7 f7=new Frame7();
		f7.setVisible(true);
		this.dispose();
	}
	
	
	void enter_press(KeyEvent ee)
	{
		int q1=ee.getKeyCode();
		if(q1==10)
		{
		if(cc==0)
		{
			Frame2 f2=new Frame2();
			f2.setVisible(true);
			this.dispose();
		}
		if(cc==1)
		{
			Frame5 f5=new Frame5();
			f5.setVisible(true);
			this.dispose();
		}
		if(cc==2)
		{
			Frame6 f6=new Frame6();
			f6.setVisible(true);
			this.dispose();
		}
		if(cc==3)
		{
				int u=JOptionPane.showConfirmDialog(this,"Are you sure?");
				if(u==0)
				{
					System.exit(0);
				}
		}
		}
	}
	
	void down_press(KeyEvent ee)
	{
		int a1=ee.getKeyCode();
		if(a1==40)
		{
			cc++;
			x=x+80;
			repaint();
		}
		
		if(cc>=4)
		{
			x=190;
			cc=0;
		}
	}
	
	void exit()
	{
		int p1=JOptionPane.showConfirmDialog(this,"Are you sure?");
		if(p1==JOptionPane.YES_OPTION)
		{
			System.exit(0);
		}
	}
	
	
	public void paint(Graphics g)
	{
		Toolkit tk=Toolkit.getDefaultToolkit();
		Image img=tk.getImage("rr.jpg");
		g.drawImage(img,0,0,1100,600,this);
		Image img1=tk.getImage("pp.jpg");
		g.drawImage(img1,8,51,200,150,this);
		g.setColor(Color.white);
		g.drawRect(440,x,220,80);
	}
}







class A
{
	public static void main(String arr[])
	{
		Frame1 f1=new Frame1();
		f1.setVisible(true);
	}
}