package POJO.Column;

import Generator.Interfaces.GenCommentId;
import Generator.Interfaces.GenUserId;
import POJO.Document.DBObject;
import io.dummymaker.annotation.time.GenDate;

import java.util.Date;

public class UserWriteComment implements DBObject {
    @GenUserId
    private Integer userId;

    @GenCommentId
    private Integer commentId;

    @GenDate
    private Date actionDate;

    @Override
    public Integer getId() {
        return null;
    }
}
