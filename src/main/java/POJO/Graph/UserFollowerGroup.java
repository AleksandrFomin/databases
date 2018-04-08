package POJO.Graph;

import Generator.Interfaces.GenGroupId;
import Generator.Interfaces.GenUserId;
import POJO.Document.DBObject;

public class UserFollowerGroup implements DBObject {
    @GenUserId
    private Integer userId;

    @GenGroupId
    private Integer groupId;

    @Override
    public Integer getId() {
        return null;
    }
}
