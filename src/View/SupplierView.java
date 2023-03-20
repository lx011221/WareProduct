package View;

import Entity.Product;
import Entity.Supplier;
import Service.SupplierService;
import Util.Input;

import java.util.ArrayList;

public class SupplierView {
    static SupplierService supplierService = new SupplierService();

    public static void menu() {
        while (true) {
            System.out.println("===============供应商管理模块===============");
            System.out.println("1、创建一个新的供应商");
            System.out.println("2、根据ID查询供应商详情");
            System.out.println("3、根据名称模糊查询供应商");
            System.out.println("4、根据联系人模糊查询供应商");
            System.out.println("5、根据ID查询该供应商旗下供应的全部商品");
            System.out.println("0、退出系统");
            System.out.println("请选择：");
            switch (Input.getInt()) {
                case 1:
                    create();
                    break;
                case 2:
                    selectBySid();
                    break;
                case 3:
                    selectBySname();
                    break;
                case 4:
                    selectByPeople();
                    break;
                case 5:
                    selectProductBySid();
                    break;
                case 0:
                    System.out.println("系统已经退出！");
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入错误，请重新输入！");
                    break;
            }
        }
    }

    public static void create() {
        System.out.println("请输入供应商名称：");
        String sname = Input.getString();
        System.out.println("请输入供应商地址：");
        String address = Input.getString();
        System.out.println("请输入供应商联系人：");
        String people = Input.getString();
        System.out.println("请输入供应商电话：");
        String phone = Input.getString();
        System.out.println("请输入供应商邮箱：");
        String mail = Input.getString();
        Supplier supplier = new Supplier(sname, address, people, phone, mail);
        System.out.println(supplierService.create(supplier) == 0 ? "添加失败！" : "添加成功！");
    }

    public static void selectBySid() {
        System.out.println("请输入要查询的供应商的编号：");
        int sid = Input.getInt();
        Supplier supplier = supplierService.selectBySid(sid);
        System.out.println(supplier.toString());
    }

    public static void selectBySname() {
        System.out.println("请输入要查询的供应商的姓名（支持模糊查询）：");
        String value = Input.getString();
        ArrayList<Supplier> suppliers = supplierService.selectBySname(value);
        for (Supplier supplier : suppliers) {
            System.out.println(supplier.toString());
        }
    }

    public static void selectByPeople() {
        System.out.println("请输入要查询的供应商的联系人（支持模糊查询）：");
        String value = Input.getString();
        ArrayList<Supplier> suppliers = supplierService.selectByPeople(value);
        for (Supplier supplier : suppliers) {
            System.out.println(supplier.toString());
        }
    }

    public static void selectProductBySid() {
        System.out.println("请输入要查询的供应商的编号：");
        int sid = Input.getInt();
        ArrayList<Product> products = supplierService.selectProductBySid(sid);
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }
}