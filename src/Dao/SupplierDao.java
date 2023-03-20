package Dao;

import Entity.Supplier;

public interface SupplierDao {
    int create(Supplier supplier);

    Supplier selectBySid(int sid);

    Supplier selectBySname(String value);

    Supplier selectByPeople(String value);
}