package services;

import dao.implementation.RoleDAO;
import entity.Role;
import enums.RoleEnum;

public class RoleService {

    RoleDAO roleDAO = new RoleDAO();

    public Role getRole(RoleEnum roleEnum){
        return roleDAO.getRoleByUID(roleEnum);
    }
}
