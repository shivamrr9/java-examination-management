import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.io.*;

class Frame5 extends Frame
{
	Connection con;
	MenuBar mb=new MenuBar();
	Menu m1=new Menu("File");
	Menu m2=new Menu("Edit");
	Menu m3=new Menu("About Us");
	
	MenuItem m11=new MenuItem("Reset");
	MenuItem m13=new MenuItem("Home");
	MenuItem m12=new MenuItem("Exit");
	
	Label l1=new Label(" Your Marks");
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
	
	TextField t11=new TextField();
	TextField t12=new TextField();
	TextField t13=new TextField();
	TextField t14=new TextField();
	TextField t15=new TextField();
	
	TextField t21=new TextField();
	TextField t22=new TextField();
	TextField t23=new TextField();
	TextField t24=new TextField();
	TextField t25=new TextField();
	
	Button b1=new Button("Get Marks");
	Button b2=new Button("Reset");
	Label l8=new Label("Name:");
	Label l9=new Label("Enrollment no.:");
	TextField t6=new TextField();
	TextField t7=new TextField();
	
	Frame5()
	{
		setLocation(100,50);
		setSize(1100,600);
		setLayout(null);
		addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
		
		try{
		Class.forName("org.gjt.mm.mysql.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
		}catch(Exception ee){System.out.print(ee);}
		
		setMenuBar(mb);
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		m1.add(m11);
		m11.setShortcut(new MenuShortcut('R'));
		m1.add(m12);
		m12.setShortcut(new MenuShortcut('E'));
		m1.add(m13);
		m13.setShortcut(new MenuShortcut('H'));
		
		
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
		t1.setBounds(610,200,50,40);add(t1);
		t1.setFont(new Font("arial",2,20));
		t2.setBounds(610,260,50,40);add(t2);
		t2.setFont(new Font("arial",2,20));
		t3.setBounds(610,320,50,40);add(t3);
		t3.setFont(new Font("arial",2,20));
		t4.setBounds(610,380,50,40);add(t4);
		t4.setFont(new Font("arial",2,20));
		t5.setBounds(610,440,50,40);add(t5);
		t5.setFont(new Font("arial",2,20));
		
		t11.setBounds(720,200,50,40);add(t11);
		t11.setFont(new Font("arial",2,20));
		t12.setBounds(720,260,50,40);add(t12);
		t12.setFont(new Font("arial",2,20));
		t13.setBounds(720,320,50,40);add(t13);
		t13.setFont(new Font("arial",2,20));
		t14.setBounds(720,380,50,40);add(t14);
		t14.setFont(new Font("arial",2,20));
		t15.setBounds(720,440,50,40);add(t15);
		t15.setFont(new Font("arial",2,20));
		
		t21.setBounds(830,200,50,40);add(t21);
		t21.setFont(new Font("arial",2,20));
		t22.setBounds(830,260,50,40);add(t22);
		t22.setFont(new Font("arial",2,20));
		t23.setBounds(830,320,50,40);add(t23);
		t23.setFont(new Font("arial",2,20));
		t24.setBounds(830,380,50,40);add(t24);
		t24.setFont(new Font("arial",2,20));
		t25.setBounds(830,440,50,40);add(t25);
		t25.setFont(new Font("arial",2,20));
		
		
		b1.setBounds(480,510,180,40);add(b1);
		b2.setBounds(700,510,150,40);add(b2);
		
		b1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ee){b1_Click();}});
		b2.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ee){b2_Click();}});
		
		l8.setBounds(100,230,50,30);add(l8);
		t6.setBounds(100,280,100,30);add(t6);
		l9.setBounds(100,330,85,30);add(l9);
		t7.setBounds(100,380,100,30);add(t7);
		
		m11.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){reset();}});
		m12.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){exit();}});
		m13.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){home();}});
	}
	
	
	void reset()
	{
		/*t1.setText(" ");
		t2.setText(" ");
		t3.setText(" ");
		t4.setText(" ");
		t5.setText(" ");
		t6.setText(" ");
		t7.setText(" ");
		
		t11.setText(" ");
		t12.setText(" ");
		t13.setText(" ");
		t14.setText(" ");
		t15.setText(" ");
		
		
		t21.setText(" ");
		t22.setText(" ");
		t23.setText(" ");
		t24.setText(" ");
		t25.setText(" ");*/
		
		Frame5 f5=new Frame5();
		f5.setVisible(true);
		this.dispose();
		
	}
	
	void b2_Click()
	{
		Frame5 f5=new Frame5();
		f5.setVisible(true);
		this.dispose();
	}
	
	void home()
	{
		Frame1 f1=new Frame1();
		f1.setVisible(true);
		this.dispose();
	}
	
	void exit()
	{
		int p1=JOptionPane.showConfirmDialog(this,"Are you sure?");
		if(p1==JOptionPane.YES_OPTION)
		{
			System.exit(0);
		}
	}
	
	void b1_Click()
	{
		String s1=t6.getText();
		String s2=t7.getText();
		
		try{
		PreparedStatement stmt=con.prepareStatement("Select * from t1 where name='"+s1+"' and enroll='"+s2+"'");
		ResultSet rs=stmt.executeQuery();
		//t1
		if(rs.next())
			{
				String s3=rs.getString(3);
				String s4=rs.getString(4);
				String s5=rs.getString(5);
				String s6=rs.getString(6);
				String s7=rs.getString(7);
				t1.setText(s3);
				t2.setText(s4);
				t3.setText(s5);
				t4.setText(s6);
				t5.setText(s7);
			}
		
		System.out.print("Data feached");
		}catch(Exception ee){System.out.println(ee);}
		
		//t2
		try{
		PreparedStatement stmt=con.prepareStatement("Select * from t2 where name='"+s1+"' and enroll='"+s2+"'");
		ResultSet rs=stmt.executeQuery();
		
		if(rs.next())
			{
				String s8=rs.getString(3);
				String s9=rs.getString(4);
				String s10=rs.getString(5);
				String s11=rs.getString(6);
				String s12=rs.getString(7);
				t11.setText(s8);
				t12.setText(s9);
				t13.setText(s10);
				t14.setText(s11);
				t15.setText(s12);
			}
		
		System.out.print("Data feached");
		}catch(Exception ee){System.out.println(ee);}
		
		//t3
		
		try{
		PreparedStatement stmt=con.prepareStatement("Select * from t3 where name='"+s1+"' and enroll='"+s2+"'");
		ResultSet rs=stmt.executeQuery();
		
		if(rs.next())
			{
				String s13=rs.getString(3);
				String s14=rs.getString(4);
				String s15=rs.getString(5);
				String s16=rs.getString(6);
				String s17=rs.getString(7);
				t21.setText(s13);
				t22.setText(s14);
				t23.setText(s15);
				t24.setText(s16);
				t25.setText(s17);
			}
		
		System.out.print("Data feached");
		}catch(Exception ee){System.out.println(ee);}
		
		
	}
	
	public void paint(Graphics g)
	{
		Toolkit tk=Toolkit.getDefaultToolkit();
		Image img=tk.getImage("rr.jpg");
		g.drawImage(img,0,0,1100,600,this);
		Image img1=tk.getImage("pp.jpg");
		g.drawImage(img1,8,51,200,150,this);
		g.setColor(Color.white);
	}
	
}


/*class A
{
	public static void main(String arr[])
	{
		Frame5 f5=new Frame5();
		f5.setVisible(true);
	}
}*/