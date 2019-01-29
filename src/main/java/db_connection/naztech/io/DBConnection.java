package db_connection.naztech.io;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//@Slf4j
public class DBConnection {
//	private static final Logger logger=LoggerFactory.getLogger(DBConnection.class);

	private static Connection conn;
	private static DBConnection instance = null;

	private DBConnection() {

		try {
//				Class.forName("oracle.jdbc.OracleDriver");
//				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "mymy");
			// Load the SQLServerDriver class, build the
			// connection string, and get a connection
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection("jdbc:sqlserver://vNTDACWSSQLD002:1433;"
					+ "databaseName=DEV_TEST;user=dev_test_dbo;password=dev_test_dbo123;");
//					+ "databaseName=DEV_TEST;user=dev_test_dbo;password=dev_test_dbo123");

//				Class.forName("net.sourceforge.jtds.jdbc.Driver");
//				conn = DriverManager.getConnection("jdbc:jtds:sqlserver://vNTDACWSSQLD002:1433;"
//						+ "databaseName=DEV_TEST;user=dev_test_dbo;password=dev_test_dbo123");
			System.out.println("connection created.");

			// select....................

			// FUNCTION CALL..............................//
//join function
			/*
			 * CallableStatement stmt = null;
			 * 
			 * stmt = conn.prepareCall("{call join_product()}");
			 * 
			 * ResultSet rss=stmt.executeQuery(); while (rss.next()) { String id =
			 * rss.getObject(1).toString(); // String name = rss.getObject(2).toString();
			 * String name = rss.getObject(2).toString();
			 * //System.out.println("Name of the person is " + id + " and his gender is " +
			 * name+"salary is"+salary); System.out.println("id is "+ id+"name is"+name);
			 * 
			 * }
			 */
//function with parameter
			/*
			 * CallableStatement stmt = null;
			 * 
			 * stmt = conn.prepareCall("{call GetEmployee1(1,'sum')}");
			 * 
			 * ResultSet rss=stmt.executeQuery(); while (rss.next()) { String name =
			 * rss.getObject(1).toString(); // String name = rss.getObject(2).toString();
			 * String id = rss.getObject(2).toString();
			 * //System.out.println("Name of the person is " + id + " and his gender is " +
			 * name+"salary is"+salary); System.out.println("id is "+ id+"name is"+name);
			 * 
			 * }
			 */

			// insert 
			/*
			 String name = "subrina";
			int id = 8;
			int salary = 400000;
			CallableStatement stmt = null;

			stmt = conn.prepareCall("{call insert_employee_sumaiya(?,?,?)}");

			stmt.setString(1, name);
			stmt.setInt(2, id);
			stmt.setInt(3, salary);
		 stmt.execute();
			
			*/
			//update 
			
			/*String name = "sultana";
			int id = 8;
			int salary = 600000;
			CallableStatement stmt = null;

			stmt = conn.prepareCall("{call Update12(?,?,?)}");

			stmt.setString(1, name);
			stmt.setInt(2, id);
			stmt.setInt(3, salary);
		    stmt.execute();
		*/
			
			//delete
			
			
		/*	String name = "mithila";
			int id =7;
			int salary = 400000;
			CallableStatement stmt = null;

			stmt = conn.prepareCall("{call delete_all(?,?,?)}");

			stmt.setString(1, name);
			stmt.setInt(2, id);
			stmt.setInt(3, salary);
		   stmt.execute();
		   
		   */
		   //insert_update_delete_option
		   
		   
				
			
			String name = "semmm";
			int id =27;
			int salary = 400000;
			String choice="insert";
			CallableStatement stmt = null;

			stmt = conn.prepareCall("{call  Master_all_subrina1(?,?,?,?)}");

			stmt.setString(1, name);
			stmt.setInt(2, id);
			stmt.setInt(3, salary);
			stmt.setString(4, choice);
		   stmt.execute();	
			
		
			
			
			
			
			
			
			
			
			

			// Handle any errors that may have occurred.

			/*
			 * PreparedStatement statement = conn.prepareStatement(
			 * "select * from dbo.employee_sumaiya ;"); Statement stmt2 =
			 * conn.createStatement();
			 * 
			 * 
			 * 
			 * // String query = "select * from dbo.employee_sumaiya ;"; //person is the
			 * table name ResultSet rs = statement.executeQuery(); while (rs.next()) {
			 * String id = rs.getObject(1).toString(); String name =
			 * rs.getObject(2).toString(); String salary = rs.getObject(3).toString();
			 * System.out.println("Name of the person is " + id + " and his gender is " +
			 * name+"salary is"+salary);
			 * 
			 * 
			 * }
			 * 
			 * PreparedStatement statement1 = conn.prepareStatement(
			 * "SELECT  COUNT(id), salary FROM dbo.employee_sumaiya GROUP BY salary   ;");
			 * // Statement stmt2 = conn.createStatement();
			 * 
			 * 
			 * 
			 * // String query = "select * from dbo.employee_sumaiya ;"; //person is the
			 * table name ResultSet rss = statement1.executeQuery(); while (rss.next()) {
			 * String id = rss.getObject(1).toString(); // String name =
			 * rss.getObject(2).toString(); String salary = rss.getObject(2).toString();
			 * //System.out.println("Name of the person is " + id + " and his gender is " +
			 * name+"salary is"+salary); System.out.println(id+" salary is " + salary );
			 * 
			 * } PreparedStatement statement2 = conn.prepareStatement(
			 * "SELECT  COUNT(id), salary FROM dbo.employee_sumaiya GROUP BY salary having count(id)>1 ;"
			 * ); // Statement stmt2 = conn.createStatement();
			 * 
			 * // String query = "select * from dbo.employee_sumaiya ;"; //person is the
			 * table name ResultSet rss2 = statement2.executeQuery(); while (rss2.next()) {
			 * String id = rss2.getObject(1).toString(); // String name =
			 * rss.getObject(2).toString(); String salary = rss2.getObject(2).toString();
			 * //System.out.println("Name of the person is " + id + " and his gender is " +
			 * name+"salary is"+salary); System.out.println("samiaaaaa"+id+" salary is " +
			 * salary );
			 * 
			 * }
			 * 
			 * 
			 * PreparedStatement statement3 = conn.prepareStatement(
			 * "SELECT name from  dbo.employee_sumaiya where id=any(select id from dbo.employee_sumaiya where dbo.employee_sumaiya.salary>0) ;"
			 * ); // Statement stmt2 = conn.createStatement();
			 * 
			 * 
			 * 
			 * // String query = "select * from dbo.employee_sumaiya ;"; //person is the
			 * table name ResultSet rss3 = statement3.executeQuery();
			 * 
			 * // System.out.println("kiiii" ); while (rss3.next()) { // String id =
			 * rss2.getObject(1).toString();
			 * 
			 * 
			 * String name = rss3.getObject(1).toString(); // String salary =
			 * rss2.getObject(2).toString(); //System.out.println("Name of the person is " +
			 * id + " and his gender is " + name+"salary is"+salary);
			 * System.out.println("  "+name );
			 * 
			 * }
			 * 
			 * ////SELECT ProductName // FROM Products // WHERE ProductID = ALL (SELECT
			 * ProductID FROM OrderDetails WHERE Quantity = 10);
			 * 
			 * 
			 * 
			 * //conn.close();
			 */
		} catch (Exception e) {
			System.out.println("Connection error: " + e.getMessage());

		}

	}

	public static DBConnection getInstance() {
		if (instance == null) {
			instance = new DBConnection();
		}
		return instance;
	}

	public Connection getConnection() {
		return conn;

	}

	public static void closeAll(ResultSet rs, PreparedStatement stmt, Connection conn) {
		try {
			if (rs != null && !rs.isClosed()) {
				try {
					rs.close();

				} catch (SQLException e) {
					System.out.println("The result set cannot be closed." + e);
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					System.out.println("The statement cannot be closed." + e);

				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					System.out.println("The data source connection cannot be closed." + e);

				}
			}
		} catch (Exception e) {
			System.out.println("close all");

		}
	}

	public static void main(String[] args) {

		new DBConnection();
		//

		System.out.println("successfull");
	}
}
