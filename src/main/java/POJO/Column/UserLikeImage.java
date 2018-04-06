package POJO.Column;

import Generator.Interfaces.GenImageId;
import Generator.Interfaces.GenUserId;
import POJO.Document.DBObject;
import io.dummymaker.annotation.time.GenDate;

import java.util.Date;

public class UserLikeImage implements DBObject {
    @GenUserId
    private Integer userId;

    @GenImageId
    private Integer imageId;

    @GenDate
    private Date actionDate;

    @Override
    public Integer getId() {
        return null;
    }
}
