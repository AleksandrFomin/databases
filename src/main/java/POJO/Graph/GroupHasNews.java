package POJO.Graph;

import Generator.Interfaces.GenGroupId;
import Generator.Interfaces.GenNewsId;
import POJO.Document.DBObject;
import io.dummymaker.annotation.special.GenForceExport;

public class GroupHasNews implements DBObject {
    public GroupHasNews(Integer groupId, Integer newsId) {
        this.groupId = groupId;
        this.newsId = newsId;
    }
    @GenForceExport
    private Integer groupId;
    @GenForceExport
    private Integer newsId;

    @Override
    public Integer getId() {
        return null;
    }
}
