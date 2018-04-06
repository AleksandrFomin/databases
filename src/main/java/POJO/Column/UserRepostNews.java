package POJO.Column;

import Generator.Interfaces.GenNewsId;
import Generator.Interfaces.GenUserId;
import POJO.Document.DBObject;
import io.dummymaker.annotation.time.GenDate;

import java.util.Date;

public class UserRepostNews implements DBObject {
    @GenUserId
    private Integer userId;

    @GenNewsId
    private Integer newsId;

    @GenDate
    private Date actionDate;

    @Override
    public Integer getId() {
        return null;
    }
}
