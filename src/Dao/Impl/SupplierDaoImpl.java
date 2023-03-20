package Dao.Impl;

import Dao.SupplierDao;
import Entity.Supplier;
import Util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class SupplierDaoImpl implements SupplierDao {
    static int result = 0;
    static Connection connection = null;
    static PreparedStatement preparedStatement = null;
    static ResultSet resultSet = null;
    private static final String SQL_CREATE = "insert into supplier (sname, address, people, phone, mail) values (?, ?, ?, ?, ?)";
    private static final String SQL_SELECTBYSID = "select * from supplier where sid = ?";

    @Override
    public int create(Supplier supplier) {
        try {
            connection = DBConnection.getConnection();
            preparedStatement = connection.prepareStatement(SQL_CREATE);
            preparedStatement.setString(1, supplier.getSname());
            preparedStatement.setString(2, supplier.getAddress());
            preparedStatement.setString(3, supplier.getPeople());
            preparedStatement.setString(4, supplier.getPhone());
            preparedStatement.setString(5, supplier.getMail());
            result = preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBConnection.close(resultSet, preparedStatement, connection);
        }
        return result;
    }

    @Override
    public Supplier selectBySid(int sid) {
        Supplier supplier = new Supplier();
        try {
            connection = DBConnection.getConnection();
            preparedStatement = connection.prepareStatement(SQL_SELECTBYSID);
            preparedStatement.setInt(1, sid);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                supplier.setSid(sid);
                supplier.setSname(resultSet.getString("sname"));
                supplier.setAddress(resultSet.getString("address"));
                supplier.setPeople(resultSet.getString("people"));
                supplier.setPhone(resultSet.getString("phone"));
                supplier.setMail(resultSet.getString("mail"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBConnection.close(resultSet, preparedStatement, connection);
        }
        return supplier;
    }

    @Override
    public ArrayList<Supplier> selectBySname(String value) {
        return null;
    }

    @Override
    public ArrayList<Supplier> selectByPeople(String value) {
        return null;
    }
}