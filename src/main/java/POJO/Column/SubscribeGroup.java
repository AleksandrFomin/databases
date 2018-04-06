package POJO.Column;

import Generator.Interfaces.GenGroupId;
import Generator.Interfaces.GenUserId;
import POJO.Document.DBObject;
import io.dummymaker.annotation.time.GenDate;

import java.util.Date;

public class SubscribeGroup implements DBObject {
    @GenUserId
    private Integer userId;

    @GenGroupId
    private Integer groupId;

    @GenDate
    private Date actionDate;

    @Override
    public Integer getId() {
        return null;
    }
}
