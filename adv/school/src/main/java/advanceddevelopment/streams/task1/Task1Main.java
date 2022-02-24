package advanceddevelopment.streams.task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1Main {

    public static void main(String[] args) {

        Video v1 = new Video("vid1", "vid1.pl", VideoType.EPISODE);
        Video v2 = new Video("vid2", "vid2.pl", VideoType.CLIP);
        Video v3 = new Video("vid3", "vid3.pl", VideoType.PREVIEW);
        Video v4 = new Video("vid4", "vid4.pl", VideoType.EPISODE);
        Video v5 = new Video("vid5", "vid5.pl", VideoType.CLIP);
        Video v6 = new Video("vid6", "vid6.pl", VideoType.PREVIEW);

        Episode episode1 = new Episode("ep1", 1, Arrays.asList(v1, v2, v3));
        Episode episode2 = new Episode("ep2", 2, Arrays.asList(v4, v5, v6));

        Season season1 = new Season("season1", 1, List.of(episode1));
        Season season2 = new Season("season2", 2, List.of(episode2));

        List<Season> seasons = List.of(season1, season2);

        System.out.println("a list of all episodes:");
        seasons.stream()
                .flatMap(season -> season.episodes.stream())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("a list of all videos:");
        seasons.stream()
                .flatMap(season -> season.episodes.stream())
                .flatMap(episode -> episode.videos.stream())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("a list of all season names:");
        seasons.stream()
                .map(season -> season.seasonName)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("a list of all season numbers:");
        seasons.stream()
                .map(season -> season.seasonNumber)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("a list of all episode names:");
        seasons.stream()
                .flatMap(season -> season.episodes.stream())
                .map(episode -> episode.episodeName)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("a list of all episode numbers:");
        seasons.stream()
                .flatMap(season -> season.episodes.stream())
                .map(episode -> episode.episodeNumber)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("a list of all video names:");
        seasons.stream()
                .flatMap(season -> season.episodes.stream())
                .flatMap(episode -> episode.videos.stream())
                .map(video -> video.title)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("a list of all url addresses for each video:");
        seasons.stream()
                .flatMap(season -> season.episodes.stream())
                .flatMap(episode -> episode.videos.stream())
                .map(video -> video.url)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("only episodes from even seasons:");
        seasons.stream()
                .flatMap(season -> season.episodes.stream())
                .filter(episode -> episode.episodeNumber % 2 == 0)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("only videos from even seasons");
        seasons.stream()
                .filter(season -> season.seasonNumber % 2 == 0)
                .flatMap(season -> season.episodes.stream())
                .flatMap(episode -> episode.videos.stream())
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
