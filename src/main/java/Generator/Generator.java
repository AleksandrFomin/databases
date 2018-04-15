package Generator;

import POJO.Column.*;
import POJO.Document.*;
import POJO.Graph.*;
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

    private List<AddFriend> addFriends = new ArrayList<>();
    private List<GroupAddImage> groupAddImages = new ArrayList<>();
    private List<GroupAddNews> groupAddNews = new ArrayList<>();
    private List<GroupAddVideo> groupAddVideos = new ArrayList<>();
    private List<SubscribeGroup> subscribeGroups = new ArrayList<>();
    private List<UserLikeImage> userLikeImages = new ArrayList<>();
    private List<UserLikeNews> userLikeNews = new ArrayList<>();
    private List<UserRepostNews> userRepostNews = new ArrayList<>();
    private List<UserWriteComment> userWriteComments = new ArrayList<>();

    private List<GroupHasImage> groupHasImages = new ArrayList<>();
    private List<GroupHasNews> groupHasNews = new ArrayList<>();
    private List<GroupHasVideo> groupHasVideos = new ArrayList<>();
    private List<NewsHasComment> newsHasComments = new ArrayList<>();
    private List<NewsHasImage> newsHasImages = new ArrayList<>();
    private List<NewsHasVideo> newsHasVideos = new ArrayList<>();
    private List<UserAuthorComment> userAuthorComments = new ArrayList<>();
    private List<UserFollowerGroup> userFollowerGroups = new ArrayList<>();
    private List<UserFriendUser> userFriendUsers = new ArrayList<>();
    private List<UserLikesImage> userLikesImages = new ArrayList<>();
    private List<UserLikesNews> userLikesNews = new ArrayList<>();
    private List<UserRepostsNews> userRepostsNews = new ArrayList<>();

    public void generate() {
        commentsIds = generateClass(Comment.class, 200000);
        groupsIds = generateClass(Group.class, 20000);
        imagesIds = generateClass(Image.class, 20000);
        newsIds = generateClass(News.class, 200000);
        usersIds = generateClass(User.class, 2000000);
        videosIds = generateClass(Video.class, 2000);

        addFriends = generateForColumn(AddFriend.class, 1000000);
        groupAddImages = generateForColumn(GroupAddImage.class, 20000);
        groupAddNews = generateForColumn(GroupAddNews.class, 200000);
        groupAddVideos = generateForColumn(GroupAddVideo.class, 2000);
        subscribeGroups = generateForColumn(SubscribeGroup.class, 2000000);
        userLikeImages = generateForColumn(UserLikeImage.class, 2000000);
        userLikeNews = generateForColumn(UserLikeNews.class, 2000000);
        userRepostNews = generateForColumn(UserRepostNews.class, 2000000);
        userWriteComments = generateForColumn(UserWriteComment.class, 200000);

        for(AddFriend a: addFriends){
            userFriendUsers.add(new UserFriendUser(a.getUserId1(),a.getUserId2()));
        }
        exporter.export(userFriendUsers);

        for(SubscribeGroup a: subscribeGroups){
            userFollowerGroups.add(new UserFollowerGroup(a.getUserId(),a.getGroupId()));
        }
        exporter.export(userFollowerGroups);

        for(GroupAddNews a: groupAddNews){
            groupHasNews.add(new GroupHasNews(a.getGroupId(),a.getNewsId()));
        }
        exporter.export(groupHasNews);

        for(GroupAddImage a: groupAddImages){
            groupHasImages.add(new GroupHasImage(a.getGroupId(),a.getImageId()));
        }
        exporter.export(groupHasImages);

        for(GroupAddVideo a: groupAddVideos){
            groupHasVideos.add(new GroupHasVideo(a.getGroupId(),a.getVideoId()));
        }
        exporter.export(groupHasVideos);

        for(UserWriteComment a: userWriteComments){
            userAuthorComments.add(new UserAuthorComment(a.getUserId(),a.getCommentId()));
            newsHasComments.add(new NewsHasComment(a.getNewsId(),a.getCommentId()));
        }
        exporter.export(userAuthorComments);
        exporter.export(newsHasComments);

        for(UserLikeNews a: userLikeNews){
            userLikesNews.add(new UserLikesNews(a.getUserId(),a.getNewsId()));
        }
        exporter.export(userLikesNews);

        for(UserLikeImage a: userLikeImages){
            userLikesImages.add(new UserLikesImage(a.getUserId(),a.getImageId()));
        }
        exporter.export(userLikesImages);

        for(UserRepostNews a: userRepostNews){
            userRepostsNews.add(new UserRepostsNews(a.getUserId(),a.getNewsId()));
        }
        exporter.export(userRepostsNews);

        generateClass(NewsHasImage.class, 150000);
        generateClass(NewsHasVideo.class, 50000);

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

    private <T extends DBObject> List<T> generateForColumn(Class<T> tClass, int amount){
        List<T> list = factory.produce(tClass, amount);
        exporter.export(list);
        return list;
    }
}
