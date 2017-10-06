import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;

class Frame4 extends Frame
{
	Connection con;
	Choice ch1=new Choice();
	MenuBar mb=new MenuBar();
	Menu m1=new Menu("File");
	Menu m2=new Menu("Edit");
	Menu m3=new Menu("About Us");
	MenuItem m11=new MenuItem("Reset");
	MenuItem m13=new MenuItem("Home");
	MenuItem m12=new MenuItem("Exit");
	Label l1=new Label(" Enter Marks");
	Label l2=new Label(" OOSP");
	Label l3=new Label(" E.V.S");
	Label l4=new Label(" DIGITAL COM");
	Label l5=new Label(" LASER");
	Label l6=new Label(" PLANNING");
	TextField t1=new TextField();
	TextField t2=new TextField();
	TextField t3=new TextField();
	TextField t4=new TextField();
	TextField t5=new TextField();
	Label l7=new Label("NOTE:Enter marks out of 35");
	Button b1=new Button("SUBMIT");
	Label l8=new Label("Name:");
	Label l9=new Label("Enrollment no.:");
	TextField t6=new TextField();
	TextField t7=new TextField();
	
	Frame4()
	{
		setLocation(100,50);
		setSize(1100,600);
		setLayout(null);
		addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent ee){System.exit(0);}});
		
		try{
		Class.forName("org.gjt.mm.mysql.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
		}catch(Exception ee){System.out.print(ee);}
		
		setMenuBar(mb);
		ch1.setBounds(50,60,160,100);add(ch1);
		ch1.add("T3");ch1.add("T2");ch1.add("T1");
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		m1.add(m11);
		m11.setShortcut(new MenuShortcut('R'));
		m1.add(m12);
		m12.setShortcut(new MenuShortcut('E'));
		m1.add(m13);
		m13.setShortcut(new MenuShortcut('H'));
		l7.setBounds(670,100,200,30);add(l7);
		l1.setBounds(470,100,180,50);add(l1);
		l1.setFont(new Font("arial",1,28));
		l1.setForeground(Color.red);
		l2.setBounds(450,200,80,40);add(l2);
		l2.setFont(new Font("arial",2,20));
		l3.setBounds(450,260,80,40);add(l3);
		l3.setFont(new Font("arial",2,20));
		l4.setBounds(450,320,150,40);add(l4);
		l4.setFont(new Font("arial",2,20));
		l5.setBounds(450,380,80,40);add(l5);
		l5.setFont(new Font("arial",2,20));
		l6.setBounds(450,440,120,40);add(l6);
		l6.setFont(new Font("arial",2,20));
		t1.setBounds(550,200,50,40);add(t1);
		t1.setFont(new Font("arial",2,20));
		t2.setBounds(550,260,50,40);add(t2);
		t2.setFont(new Font("arial",2,20));
		t3.setBounds(610,320,50,40);add(t3);
		t3.setFont(new Font("arial",2,20));
		t4.setBounds(550,380,50,40);add(t4);
		t4.setFont(new Font("arial",2,20));
		t5.setBounds(590,440,50,40);add(t5);
		t5.setFont(new Font("arial",2,20));
		b1.setBounds(480,510,140,40);add(b1);
		l8.setBounds(100,130,50,30);add(l8);
		t6.setBounds(100,180,100,30);add(t6);
		l9.setBounds(100,230,85,30);add(l9);
		t7.setBounds(100,280,100,30);add(t7);
		m11.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){reset();}});
		m12.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){exit();}});
		m13.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){home();}});
		
		b1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ee){b1_Click();}});
		ch1.addItemListener(new ItemListener(){public void itemStateChanged(ItemEvent ee){ch1_Click();}});
	}
	
	public void paint(Graphics g)
	{
		Toolkit tk=Toolkit.getDefaultToolkit();
		Image img=tk.getImage("rr.jpg");
		g.drawImage(img,0,0,1100,600,this);
	}
	
	void b1_Click()
	{
		
		String s1=t6.getText();
		String s2=t7.getText();
		String p1=t1.getText();
		String p2=t2.getText();
		String p3=t3.getText();
		String p4=t4.getText();
		String p5=t5.getText();
		try{
		
		PreparedStatement stmt=con.prepareStatement("Insert into t3 values('"+s1+"','"+s2+"',"+p1+","+p2+","+p3+","+p4+","+p5+")");
		stmt.executeUpdate();
		System.out.print("Data Inserted");
		}catch(Exception ee){System.out.println(ee);}
		
		
		Frame4 f4=new Frame4();
		f4.setVisible(true);
		this.dispose();
		
		
	}
	
	void reset()
	{
		/*t1.setText(" ");
		t2.setText(" ");
		t3.setText(" ");
		t4.setText(" ");
		t5.setText(" ");
		t6.setText(" ");*/
		
		Frame4 f4=new Frame4();
		f4.setVisible(true);
		this.dispose();
	}
	
	void home()
	{
		Frame1 f1=new Frame1();
		f1.setVisible(true);
		this.dispose();
	}
	
	
	void ch1_Click()
	{
		String s1=ch1.getSelectedItem();
		if(s1.equals("T1"))
		{
			Frame2 f2=new Frame2();
			f2.setVisible(true);
			this.dispose();
		}
		if(s1.equals("T2"))
		{
			Frame3 f3=new Frame3();
			f3.setVisible(true);
			this.dispose();
		}
		if(s1.equals("T3"))
		{
			Frame4 f4=new Frame4();
			f4.setVisible(true);
			this.dispose();
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
	
}

/*class A
{
	public static void main(String arr[])
	{
		Frame2 f2=new Frame2();
		f2.setVisible(true);
	}
}*/