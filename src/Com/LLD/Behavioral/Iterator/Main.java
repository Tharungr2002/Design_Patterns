package Com.LLD.Behavioral.Iterator;
import java.util.*;

class Video {
    String title;

    Video(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

class YoutubePlayList {
    List<Video> videos;

    YoutubePlayList() {
        this.videos = new ArrayList<>();
    }

    public void addVideo(Video video) {
        videos.add(video);
    }

    public List<Video> getVideos() {
        return videos;
    }
}

interface Iterator {
    boolean hasNext();
    Video next();
}                                                                         //just to hide from client which DS it is, it will
                                                                          //know next is there or not
class YoutubePlaylistIterator implements Iterator {
    List<Video> videos;
    int position =0;
    YoutubePlaylistIterator(List<Video> videos) {
        this.videos = videos;
    }
    @Override
    public boolean hasNext() {
        if(position >= videos.size()) return false;
        return true;
    }
    @Override
    public Video next() {
        return videos.get(position++);
    }
}

class Main {
    public static void main(String[] args) {
        YoutubePlayList playlist = new YoutubePlayList();
        playlist.addVideo(new Video("dsa"));
        playlist.addVideo(new Video("lld"));

        YoutubePlaylistIterator iterator = new YoutubePlaylistIterator(playlist.getVideos());

        while(iterator.hasNext()) {
            System.out.println(iterator.next().getTitle());
        }
    }
}