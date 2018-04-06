package POJO.Column;

import Generator.Interfaces.GenUserId;
import POJO.Document.DBObject;
import io.dummymaker.annotation.time.GenDate;

import java.util.Date;

public class AddFriend implements DBObject {
    @GenUserId
    private Integer userId1;

    @GenUserId
    private Integer userId2;

    @GenDate
    private Date actionDate;

    @Override
    public Integer getId() {
        return null;
    }
}
