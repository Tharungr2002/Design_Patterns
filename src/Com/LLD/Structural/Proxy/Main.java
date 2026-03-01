package Com.LLD.Structural.Proxy;

import java.util.HashMap;
import java.util.Map;

interface Downloader {
    String downloadVideo();
}

class VideoDownloader implements Downloader{
    String videoUrl;

    VideoDownloader(String videoUrl) {
        this.videoUrl= videoUrl;
    }

    @Override
    public String downloadVideo() {
        return "Here is downloaded content for url :"+ videoUrl;
    }

}

class CacheDownloader implements Downloader{
    VideoDownloader videoDownloader;
    Map<String, String> cacheContent;
    String videoUrl;

    CacheDownloader(String videoUrl) {
        this.videoUrl= videoUrl;
        this.cacheContent = new HashMap<>();
        this.videoDownloader = new VideoDownloader(videoUrl);
    }

    @Override
    public String downloadVideo() {
        if(cacheContent.containsKey(videoUrl)) {
            System.out.println("cahed");
            return cacheContent.get(videoUrl);
        }
        String ans = videoDownloader.downloadVideo();
        cacheContent.put(videoUrl, ans);
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        Downloader videoDownloader = new CacheDownloader("tharun");
        System.out.println(videoDownloader.downloadVideo());

        System.out.println(videoDownloader.downloadVideo());
    }
}
