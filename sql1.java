import java.sql.*;
class p112
{
	public static void main(String[] ar)
	{
		try{
			Class.forName("org.gjt.mm.mysql.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dbxyz","root","");
			PreparedStatement stmt=con.prepareStatement("Insert into students values(10101,'Anil Kumar','B.Tech.')");
			stmt.executeUpdate();
			stmt=con.prepareStatement("Insert into students values(10102,'Atul Kumar','B.Tech.')");
			stmt.executeUpdate();
			stmt=con.prepareStatement("Insert into students values(10103,'Amit Kumar','B.Tech.')");
			stmt.executeUpdate();
			System.out.println("OK");
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}