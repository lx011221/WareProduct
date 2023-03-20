package Dao.Impl;

import Dao.SupplierDao;
import Entity.Product;
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
    private static final String SQL_SELECTBYSNAME = "select * from supplier where sname like ?";
    private static final String SQL_SELECTBYPEOPLE = "select * from supplier where people like ?";
    private static final String SQL_SELECTPRODUCTBYSID = "select pid, name, price, low_price, sname, type from supplier, product, type where supplier.sid = product.sid and product.tid = type.tid and supplier.sid = ? order by pid;";

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
        ArrayList<Supplier> suppliers = new ArrayList<>();
        try {
            connection = DBConnection.getConnection();
            preparedStatement = connection.prepareStatement(SQL_SELECTBYSNAME);
            preparedStatement.setString(1, "%" + value + "%");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int sid = resultSet.getInt("sid");
                String sname = resultSet.getString("sname");
                String address = resultSet.getString("address");
                String people = resultSet.getString("people");
                String phone = resultSet.getString("phone");
                String mail = resultSet.getString("mail");
                suppliers.add(new Supplier(sid, sname, address, people, phone, mail));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBConnection.close(resultSet, preparedStatement, connection);
        }
        return suppliers;
    }

    @Override
    public ArrayList<Supplier> selectByPeople(String value) {
        ArrayList<Supplier> suppliers = new ArrayList<>();
        try {
            connection = DBConnection.getConnection();
            preparedStatement = connection.prepareStatement(SQL_SELECTBYPEOPLE);
            preparedStatement.setString(1, "%" + value + "%");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int sid = resultSet.getInt("sid");
                String sname = resultSet.getString("sname");
                String address = resultSet.getString("address");
                String people = resultSet.getString("people");
                String phone = resultSet.getString("phone");
                String mail = resultSet.getString("mail");
                suppliers.add(new Supplier(sid, sname, address, people, phone, mail));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBConnection.close(resultSet, preparedStatement, connection);
        }
        return suppliers;
    }

    @Override
    public ArrayList<Product> selectProductBySid(int sid) {
        ArrayList<Product> products = new ArrayList<>();
        try {
            connection = DBConnection.getConnection();
            preparedStatement = connection.prepareStatement(SQL_SELECTPRODUCTBYSID);
            preparedStatement.setInt(1, sid);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int pid = resultSet.getInt("pid");
                String name = resultSet.getString("name");
                int price = resultSet.getInt("price");
                int low_price = resultSet.getInt("low_price");
                String sname = resultSet.getString("sname");
                String type = resultSet.getString("type");
                products.add(new Product(pid, name, price, low_price, sname, type));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBConnection.close(resultSet, preparedStatement, connection);
        }
        return products;
    }
}