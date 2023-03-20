import Entity.Supplier;
import Service.SupplierService;

public class test {
    public static void main(String[] args) {
        SupplierService supplierService = new SupplierService();
        System.out.println(supplierService.selectBySid(1).toString());
//        System.out.println(supplierService.create(new Supplier("1", "1", "1", "1", "1")));
    }
}