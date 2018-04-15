package POJO.Graph;

import Generator.Interfaces.GenGroupId;
import Generator.Interfaces.GenUserId;
import POJO.Document.DBObject;
import io.dummymaker.annotation.special.GenForceExport;

public class UserFollowerGroup implements DBObject {
    public UserFollowerGroup(Integer userId, Integer groupId) {
        this.userId = userId;
        this.groupId = groupId;
    }
    @GenForceExport
    private Integer userId;
    @GenForceExport
    private Integer groupId;

    @Override
    public Integer getId() {
        return null;
    }
}
