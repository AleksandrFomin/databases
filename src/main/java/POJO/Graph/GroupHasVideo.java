package POJO.Graph;

import Generator.Interfaces.GenGroupId;
import Generator.Interfaces.GenVideoId;
import POJO.Document.DBObject;
import io.dummymaker.annotation.special.GenForceExport;

public class GroupHasVideo implements DBObject {

    public GroupHasVideo(Integer groupId, Integer videoId) {
        this.groupId = groupId;
        this.videoId = videoId;
    }
    @GenForceExport
    private Integer groupId;
    @GenForceExport
    private Integer videoId;

    @Override
    public Integer getId() {
        return null;
    }
}
