package pack1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class DBHelper {
	@SuppressWarnings({ "unused", "rawtypes" })
	public static void addDetails(double prod_id, String prod_name, double quantity,
			double price, double store_price)
			throws SQLException, ClassNotFoundException {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con1 = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:XE", "orderdb", "orderdb");
		PreparedStatement pstmt1 = con1
				.prepareStatement("insert into retail (prod_id,prod_name,quantity,price,store_price)values(?, ?, ?, ?, ?)");
		pstmt1.setDouble(1,prod_id);
		pstmt1.setString(2, prod_name);
		pstmt1.setDouble(3, quantity);
		pstmt1.setDouble(4, price);
		pstmt1.setDouble(5, store_price);
		
		pstmt1.executeUpdate();
	}
	public static void getDetails(double prod_id, String prod_name, double quantity,
			double store_price)
			throws SQLException, ClassNotFoundException {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con1 = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:XE", "orderdb", "orderdb");
		PreparedStatement pstmt1 = con1
				.prepareStatement("select prod_id,prod_name,quantity,store_price from retail"); 
		pstmt1.setDouble(1,prod_id);
		pstmt1.setString(2, prod_name);
		pstmt1.setDouble(3, quantity);
		pstmt1.setDouble(4, store_price);
		
		ResultSet rs = pstmt1.executeQuery();

		System.out.println("Retrieved result set");

		while (rs.next()) {
			prod_id = rs.getDouble("prod-id");
			prod_name = rs.getString("prod_name");
			quantity = rs.getDouble("quantity");
			store_price = rs.getDouble("store_price");
			
			
		}
	}
}



		

