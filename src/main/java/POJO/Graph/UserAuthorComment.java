package POJO.Graph;

import Generator.Interfaces.GenCommentId;
import Generator.Interfaces.GenUserId;
import POJO.Document.DBObject;
import io.dummymaker.annotation.special.GenForceExport;

public class UserAuthorComment implements DBObject {
    public UserAuthorComment(Integer userId, Integer commentId) {
        this.userId = userId;
        this.commentId = commentId;
    }
    @GenForceExport
    private Integer userId;
    @GenForceExport
    private Integer commentId;

    @Override
    public Integer getId() {
        return null;
    }
}
