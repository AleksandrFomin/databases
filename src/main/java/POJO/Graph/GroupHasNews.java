package POJO.Graph;

import Generator.Interfaces.GenGroupId;
import Generator.Interfaces.GenNewsId;
import POJO.Document.DBObject;

public class GroupHasNews implements DBObject {
    @GenGroupId
    private Integer groupId;

    @GenNewsId
    private Integer newsId;

    @Override
    public Integer getId() {
        return null;
    }
}
