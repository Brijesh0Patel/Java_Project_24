import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OperationImp implements Opertations{

	@Override
	public void InsertData(EmpPojo empPojo) {
		try {
			PreparedStatement preparedStatement = GetConnection.getConnection().prepareStatement("insert into emp1 values(?,?)");
			

			preparedStatement.setInt(1, empPojo.getId());
			preparedStatement.setString(2, empPojo.getName());

			preparedStatement.executeUpdate();

			System.out.println("record inserted");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void UpdateData(EmpPojo empPojo) {
		// TODO Auto-generated method stub
		
		try {
			PreparedStatement preparedStatement = GetConnection.getConnection().prepareStatement("update emp1 set id=? where name = ?");
			

			preparedStatement.setInt(1, empPojo.getId());
			preparedStatement.setString(2, empPojo.getName());

			preparedStatement.executeUpdate();

			System.out.println("record updated");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}

	@Override
	public void DeleteData(EmpPojo empPojo) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement preparedStatement = GetConnection.getConnection().prepareStatement("delete from emp1  where id = ?");
			

			preparedStatement.setInt(1, empPojo.getId());
			//preparedStatement.setString(2, empPojo.getName());

			preparedStatement.executeUpdate();

			System.out.println("record deleted");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	@Override
	public void ShowData(EmpPojo empPojo) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement preparedStatement = GetConnection.getConnection().prepareStatement("select * from emp1");
			

			preparedStatement.setInt(1, empPojo.getId());
			preparedStatement.setString(2, empPojo.getName());

			preparedStatement.executeUpdate();

			System.out.println("record visible");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
