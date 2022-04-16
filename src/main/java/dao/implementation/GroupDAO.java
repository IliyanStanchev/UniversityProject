package dao.implementation;

import dao.BaseDAO;
import entity.Group;

public class GroupDAO extends BaseDAO<Group> {

    public GroupDAO() {

        super.setClass(Group.class);
    }
}