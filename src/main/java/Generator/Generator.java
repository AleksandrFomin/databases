package Generator;

import POJO.Column.*;
import POJO.Document.*;
import io.dummymaker.export.IExporter;
import io.dummymaker.export.impl.CsvExporter;
import io.dummymaker.factory.IProduceFactory;
import io.dummymaker.factory.impl.GenProduceFactory;

import java.util.ArrayList;
import java.util.List;

public class Generator {

    private IProduceFactory factory = new GenProduceFactory();
    private IExporter exporter = new CsvExporter();
    private List<Integer> commentsIds = new ArrayList<>();
    private List<Integer> groupsIds = new ArrayList<>();
    private List<Integer> imagesIds = new ArrayList<>();
    private List<Integer> newsIds = new ArrayList<>();
    private List<Integer> usersIds = new ArrayList<>();
    private List<Integer> videosIds = new ArrayList<>();

    public void generate() {
        commentsIds = generateClass(Comment.class, 20);
        groupsIds = generateClass(Group.class, 20);
        imagesIds = generateClass(Image.class, 20);
        newsIds = generateClass(News.class, 20);
        usersIds = generateClass(User.class, 20);
        videosIds = generateClass(Video.class, 20);

        generateClass(AddFriend.class, 20);
        generateClass(GroupAddImage.class, 20);
        generateClass(GroupAddNews.class, 20);
        generateClass(GroupAddVideo.class, 20);
        generateClass(SubscribeGroup.class, 20);
        generateClass(UserLikeImage.class, 20);
        generateClass(UserLikeNews.class, 20);
        generateClass(UserRepostNews.class, 20);
        generateClass(UserWriteComment.class, 20);
    }

    private <T extends DBObject> List<Integer> generateClass(Class<T> tClass, int amount) {
        List<T> list = factory.produce(tClass, amount);
        exporter.export(list);
        List<Integer> ids = new ArrayList<>(amount);
        for (DBObject el : list) {
            ids.add(el.getId());
        }
        return ids;
    }
}
