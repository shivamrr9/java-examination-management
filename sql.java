import java.sql.*;
class A 
{
	public static void main(String[] ar)
	{
		try{
			Class.forName("org.gjt.mm.mysql.Driver");
			Connection con = null;
			con=DriverManager.getConnection("jdbc:mysql://localhost/java","root","");
			String s="shivammm arora";
			String ss="1410200";
			int a=20;
			PreparedStatement stmt=con.prepareStatement("Select * from marks");
			stmt.executeUpdate();
			ResultSet rs=stmt.executeQuery();
			while(rs.next())
			{
				String s1=rs.getString(1);
				String s2=rs.getString(2);
				String s3=rs.getString(3);
				String s4=rs.getString("dc");
				System.out.println(s1+","+s2+","+s3+","+s4);
			}
			System.out.println("OK");
		}catch(Exception e)
		{
			System.out.println(e);	
		}
	}
}