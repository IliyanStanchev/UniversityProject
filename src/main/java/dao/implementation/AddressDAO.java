package dao.implementation;
import dao.BaseDAO;
import entity.Address;

public class AddressDAO extends BaseDAO<Address> {

    public AddressDAO() {

        super.setClass(Address.class);
    }
}