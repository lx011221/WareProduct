package Dao;

import Entity.Supplier;

import java.util.ArrayList;

public interface SupplierDao {
    int create(Supplier supplier);

    Supplier selectBySid(int sid);

    ArrayList<Supplier> selectBySname(String value);

    ArrayList<Supplier> selectByPeople(String value);
}