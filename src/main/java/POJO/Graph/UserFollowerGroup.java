package POJO.Graph;

import Generator.Interfaces.GenGroupId;
import Generator.Interfaces.GenUserId;

public class UserFollowerGroup {
    @GenUserId
    private Integer userId;

    @GenGroupId
    private Integer groupId;
}
