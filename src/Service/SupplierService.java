package Service;

import Dao.Impl.SupplierDaoImpl;
import Dao.SupplierDao;
import Entity.Product;
import Entity.Supplier;

import java.util.ArrayList;

public class SupplierService {
    static SupplierDao supplierDao = new SupplierDaoImpl();

    public int create(Supplier supplier) {
        return supplierDao.create(supplier);
    }

    public Supplier selectBySid(int sid) {
        return supplierDao.selectBySid(sid);
    }

    public ArrayList<Supplier> selectBySname(String value) {
        return supplierDao.selectBySname(value);
    }

    public ArrayList<Supplier> selectByPeople(String value) {
        return supplierDao.selectByPeople(value);
    }

    public ArrayList<Product> selectProductBySid(int sid) {
        return supplierDao.selectProductBySid(sid);
    }
}