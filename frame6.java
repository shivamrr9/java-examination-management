import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.io.*;

class Frame6 extends Frame
{
	Connection con;
	int l,m,n,i,t,ll1,ll2,mm1,mm2,n1,n2,i1,i2,t1,t2;
	MenuBar mb=new MenuBar();
	Menu m1=new Menu("File");
	Menu m2=new Menu("Edit");
	Menu m3=new Menu("About Us");
	
	MenuItem m11=new MenuItem("Reset");
	MenuItem m13=new MenuItem("Home");
	MenuItem m12=new MenuItem("Exit");
	
	Label l1=new Label("    GRAPHS");
	
	
	Label l8=new Label("Name:");
	Label l9=new Label("Enrollment no.:");
	TextField t6=new TextField();
	TextField t7=new TextField();
	Button b1=new Button("Graph");
	Button b2=new Button("Home");
	int d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d13,d14,d15;
	Label l2=new Label("oosp");
	Label l3=new Label("evs");
	Label l4=new Label("dc");
	Label l5=new Label("laser");
	Label l6=new Label("planning");
	Label l11=new Label("T1");
	Label l12=new Label("T2");
	Label l13=new Label("T3");
	
	
	Frame6()
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
		l1.setBounds(450,40,200,50);add(l1);
		l1.setFont(new Font("arial",1,30));
		l8.setBounds(100,210,50,30);add(l8);
		t6.setBounds(100,250,100,30);add(t6);
		l9.setBounds(100,300,85,30);add(l9);
		t7.setBounds(100,350,100,30);add(t7);
		
		l11.setBounds(420,350,30,30);add(l11);
		l12.setBounds(670,350,30,30);add(l12);
		l13.setBounds(920,350,30,30);add(l13);
		
		l2.setBounds(260,80,30,20);add(l2);
		l3.setBounds(260,130,30,20);add(l3);
		l4.setBounds(260,180,30,20);add(l4);
		l5.setBounds(260,230,40,20);add(l5);
		l6.setBounds(260,280,50,20);add(l6);
		
		b1.setBounds(100,400,60,30);add(b1);
		b2.setBounds(400,550,60,30);add(b2);
		b1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ee){b1_Click();}});
		b2.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ee){home();}});
		
		m11.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){reset();}});
		m12.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){exit();}});
		m13.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){home();}});
	}
	
	
	void reset()
	{
		  
		Frame6 f6=new Frame6();
		f6.setVisible(true);
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
				d1=Integer.parseInt(s3);
				String s4=rs.getString(4);
				d2=Integer.parseInt(s4);
				String s5=rs.getString(5);
				d3=Integer.parseInt(s5);
				String s6=rs.getString(6);
				d4=Integer.parseInt(s6);
				String s7=rs.getString(7);
				d5=Integer.parseInt(s7);
				int p=d1+d2+d3+d4+d5;
				
				l=(d1*360)/p;
				
				m=(d2*360)/p;
					
				n=(d3*360)/p;
					
				i=(d4*360)/p;
					
				t=((d5*360)/p)+2;
				repaint();			
				
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
				d6=Integer.parseInt(s8);
				String s9=rs.getString(4);
				d7=Integer.parseInt(s9);
				String s10=rs.getString(5);
				d8=Integer.parseInt(s10);
				String s11=rs.getString(6);
				d9=Integer.parseInt(s11);
				String s12=rs.getString(7);
				d10=Integer.parseInt(s12);
				
				int p1=d6+d7+d8+d9+d10;
				
				ll1=(d6*360)/p1;
				//raghu.vamsi@jiit.ac.in
				mm1=(d7*360)/p1;
					
				n1=(d8*360)/p1;
					
				i1=(d9*360)/p1;
					
				t1=((d10*360)/p1)+2;
				
				repaint();
				
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
				d11=Integer.parseInt(s13);
				String s14=rs.getString(4);
				d12=Integer.parseInt(s14);
				String s15=rs.getString(5);
				d13=Integer.parseInt(s15);
				String s16=rs.getString(6);
				d14=Integer.parseInt(s16);
				String s17=rs.getString(7);
				d15=Integer.parseInt(s17);
				
				int p2=d11+d12+d13+d14+d15;
				
				ll2=(d11*360)/p2;
				
				mm2=(d12*360)/p2;
					
				n2=(d13*360)/p2;
					
				i2=(d14*360)/p2;
					
				t2=((d15*360)/p2)+2;
				repaint();
				
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
		g.setColor(Color.yellow);
		g.fillRect(220,80,30,20);
		g.setColor(Color.pink);
		g.fillRect(220,130,30,20);
		g.setColor(Color.red);
		g.fillRect(220,180,30,20);
		g.setColor(Color.green);
		g.fillRect(220,230,30,20);
		g.setColor(Color.blue);
		g.fillRect(220,280,30,20);
		//t1
		g.setColor(Color.yellow);
		g.fillArc(350,200,180,130,0,l);
		g.setColor(Color.pink);
		g.fillArc(350,200,180,130,l,m);
		g.setColor(Color.red);
		g.fillArc(350,200,180,130,m+l,n);
		g.setColor(Color.green);
		g.fillArc(350,200,180,130,m+l+n,i);
		g.setColor(Color.blue);
		g.fillArc(350,200,180,130,m+l+n+i,t);
		//t2
		g.setColor(Color.yellow);
		g.fillArc(600,200,180,130,0,ll1);
		g.setColor(Color.pink);
		g.fillArc(600,200,180,130,ll1,mm1);
		g.setColor(Color.red);
		g.fillArc(600,200,180,130,mm1+ll1,n1);
		g.setColor(Color.green);
		g.fillArc(600,200,180,130,mm1+ll1+n1,i1);
		g.setColor(Color.blue);
		g.fillArc(600,200,180,130,mm1+ll1+n1+i1,t1);
		//t3
		g.setColor(Color.yellow);
		g.fillArc(850,200,180,130,0,ll2);
		g.setColor(Color.pink);
		g.fillArc(850,200,180,130,ll2,mm2);
		g.setColor(Color.red);
		g.fillArc(850,200,180,130,mm2+ll2,n2);
		g.setColor(Color.green);
		g.fillArc(850,200,180,130,mm2+ll2+n2,i2);
		g.setColor(Color.blue);
		g.fillArc(850,200,180,130,mm2+ll2+n2+i2,t2);
		
	}
	
}


/*class A
{
	public static void main(String arr[])
	{
		Frame6 f6=new Frame6();
		f6.setVisible(true);
	}
}*/