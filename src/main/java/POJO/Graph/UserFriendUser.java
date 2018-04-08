package POJO.Graph;

import Generator.Interfaces.GenUserId;
import POJO.Document.DBObject;

public class UserFriendUser implements DBObject {
    @GenUserId
    private Integer userId1;

    @GenUserId
    private Integer userId2;

    @Override
    public Integer getId() {
        return null;
    }
}
