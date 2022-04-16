package services;

import dao.implementation.GroupDAO;
import entity.Group;
import entity.Speciality;

import java.util.List;

public class GroupService {

    GroupDAO groupDAO = new GroupDAO();

    public List<Group> getAll(){
        return  groupDAO.getAll();
    }

    public Group getGroup(int groupID) {
        return groupDAO.findById(groupID);
    }

    public void saveOrUpdate(Group currentGroup) {

        if( currentGroup == null )
            return;

        if( currentGroup.getCourse() == null )
            return;

        groupDAO.saveOrUpdate(currentGroup);
    }
}
