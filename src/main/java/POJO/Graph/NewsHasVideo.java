package POJO.Graph;

import Generator.Interfaces.GenNewsId;
import Generator.Interfaces.GenVideoId;
import POJO.Document.DBObject;

public class NewsHasVideo implements DBObject {
    @GenNewsId
    private Integer newsId;

    @GenVideoId
    private Integer videoId;

    @Override
    public Integer getId() {
        return null;
    }
}
