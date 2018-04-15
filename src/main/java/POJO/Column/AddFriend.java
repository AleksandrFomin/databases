package POJO.Column;

import Generator.Interfaces.GenUserId;
import POJO.Document.DBObject;
import io.dummymaker.annotation.time.GenDate;
import io.dummymaker.annotation.time.GenTimestamp;

import java.util.Date;

public class AddFriend implements DBObject {
    @GenUserId
    private Integer userId1;

    @GenUserId
    private Integer userId2;

    @GenTimestamp
    private Date actionDate;

    @Override
    public Integer getId() {
        return null;
    }

    public Integer getUserId1() {
        return userId1;
    }

    public Integer getUserId2() {
        return userId2;
    }
}
