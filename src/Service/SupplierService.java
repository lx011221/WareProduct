package Service;

import Dao.Impl.SupplierDaoImpl;
import Dao.SupplierDao;
import Entity.Supplier;

public class SupplierService {
    static SupplierDao supplierDao = new SupplierDaoImpl();

    public int create(Supplier supplier) {
        return supplierDao.create(supplier);
    }

    public Supplier selectBySid(int sid) {
        return supplierDao.selectBySid(sid);
    }

    public Supplier selectBySname(String value) {
        return supplierDao.selectBySname(value);
    }

    public Supplier selectByPeople(String value) {
        return supplierDao.selectByPeople(value);
    }
}