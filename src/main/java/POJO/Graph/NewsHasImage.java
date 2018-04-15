package POJO.Graph;

import Generator.Interfaces.GenImageId;
import Generator.Interfaces.GenNewsId;
import POJO.Document.DBObject;

public class NewsHasImage implements DBObject {

//    public NewsHasImage(Integer newsId, Integer imageId) {
//        this.newsId = newsId;
//        this.imageId = imageId;
//    }
    @GenNewsId
    private Integer newsId;

    @GenImageId
    private Integer imageId;

    @Override
    public Integer getId() {
        return null;
    }
}
