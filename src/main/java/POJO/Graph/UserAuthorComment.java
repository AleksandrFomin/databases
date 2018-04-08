package POJO.Graph;

import Generator.Interfaces.GenCommentId;
import Generator.Interfaces.GenUserId;
import POJO.Document.DBObject;

public class UserAuthorComment implements DBObject {
    @GenUserId
    private Integer userId;

    @GenCommentId
    private Integer commentId;

    @Override
    public Integer getId() {
        return null;
    }
}
