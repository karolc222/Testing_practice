import java.util.List;
import java.util.ArrayList;
import java.util.Optional;


public class Playlist {

    //creating new playlist collection
    public final List<Track> playlist = new ArrayList<>();

    //method to add tracks to playlist 
    public void addTrack(Track track) {
        playlist.add(track);
    }

    //method to get the current track, returns an optional 
    public Optional<Track> getCurrentTrack() {
        if
        (playlist.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(playlist.get(0));
    }

    public int size() {
        return playlist.size();
    }

    public void play() {

    }
}