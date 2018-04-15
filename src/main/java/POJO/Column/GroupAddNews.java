package POJO.Column;

import Generator.Interfaces.GenGroupId;
import Generator.Interfaces.GenNewsId;
import POJO.Document.DBObject;
import io.dummymaker.annotation.time.GenDate;
import io.dummymaker.annotation.time.GenTimestamp;

import java.util.Date;

public class GroupAddNews implements DBObject {
    @GenGroupId
    private Integer groupId;

    @GenNewsId
    private Integer newsId;

    @GenTimestamp
    private Date actionDate;

    @Override
    public Integer getId() {
        return null;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public Integer getNewsId() {
        return newsId;
    }
}
