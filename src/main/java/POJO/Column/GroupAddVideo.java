package POJO.Column;

import Generator.Interfaces.GenGroupId;
import Generator.Interfaces.GenVideoId;
import POJO.Document.DBObject;
import io.dummymaker.annotation.time.GenDate;

import java.util.Date;

public class GroupAddVideo implements DBObject {
    @GenGroupId
    private Integer groupId;

    @GenVideoId
    private Integer videoId;

    @GenDate
    private Date actionDate;

    @Override
    public Integer getId() {
        return null;
    }
}
