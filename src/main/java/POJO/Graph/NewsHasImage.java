package POJO.Graph;

import Generator.Interfaces.GenImageId;
import Generator.Interfaces.GenNewsId;
import POJO.Document.DBObject;

public class NewsHasImage implements DBObject {
    @GenNewsId
    private Integer newsId;

    @GenImageId
    private Integer imageId;

    @Override
    public Integer getId() {
        return null;
    }
}
