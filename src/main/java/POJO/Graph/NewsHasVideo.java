package POJO.Graph;

import Generator.Interfaces.GenImageId;
import Generator.Interfaces.GenNewsId;
import Generator.Interfaces.GenVideoId;
import POJO.Document.DBObject;

public class NewsHasVideo implements DBObject {
//    public NewsHasVideo(Integer newsId, Integer videoId) {
//        this.newsId = newsId;
//        this.videoId = videoId;
//    }
    @GenNewsId
    private Integer newsId;

    @GenVideoId
    private Integer videoId;

    @Override
    public Integer getId() {
        return null;
    }
}
