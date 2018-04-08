package POJO.Graph;

import Generator.Interfaces.GenGroupId;
import Generator.Interfaces.GenVideoId;
import POJO.Document.DBObject;

public class GroupHasVideo implements DBObject {
    @GenGroupId
    private Integer groupId;

    @GenVideoId
    private Integer videoId;

    @Override
    public Integer getId() {
        return null;
    }
}
