package POJO.Column;

import Generator.Interfaces.GenNewsId;
import Generator.Interfaces.GenUserId;
import POJO.Document.DBObject;
import io.dummymaker.annotation.time.GenDate;
import io.dummymaker.annotation.time.GenTimestamp;

import java.util.Date;

public class UserRepostNews implements DBObject {
    @GenUserId
    private Integer userId;

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

    public Integer getNewsId() {
        return newsId;
    }
}
