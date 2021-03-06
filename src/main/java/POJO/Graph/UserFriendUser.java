package POJO.Graph;

import Generator.Interfaces.GenUserId;
import POJO.Document.DBObject;
import io.dummymaker.annotation.special.GenForceExport;

public class UserFriendUser implements DBObject {
    public UserFriendUser(Integer userId1, Integer userId2) {
        this.userId1 = userId1;
        this.userId2 = userId2;
    }
    @GenForceExport
    private Integer userId1;

    @GenForceExport
    private Integer userId2;

    @Override
    public Integer getId() {
        return null;
    }
}
