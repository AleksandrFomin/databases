package POJO.Column;

import Generator.Interfaces.GenCommentId;
import Generator.Interfaces.GenNewsId;
import Generator.Interfaces.GenUserId;
import POJO.Document.DBObject;
import io.dummymaker.annotation.time.GenDate;
import io.dummymaker.annotation.time.GenTimestamp;

import java.util.Date;

public class UserWriteComment implements DBObject {
    @GenUserId
    private Integer userId;

    @GenCommentId
    private Integer commentId;

    @GenNewsId
    private Integer newsId;

    @GenTimestamp
    private Date actionDate;

    @Override
    public Integer getId() {
        return null;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public Integer getNewsId() {
        return newsId;
    }
}
