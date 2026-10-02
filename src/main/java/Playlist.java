import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Playlist {

    //CREATE NEW PLAYLIST COLLECTION
    public final List<Track> playlist = new ArrayList<>();
    public int maxSize = 50;
    public boolean isPlaying = false; 


    //ADD TRACK TO PLAYLIST IF SIZE ALLOWS
    public void addTrack(Track track) {
        if (playlist.size() < maxSize) {
            playlist.add(track);
        } else {
            throw new IllegalStateException();
        }
    }

    //GET CURRENT TRACK (returns optional)
    public Optional<Track> getCurrentTrack() {
        if
        (playlist.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(playlist.get(0));
    }

    public int getSize() {
        return playlist.size();
    }

    // PLAY METHOD changes PLAYBACK STATE 
    public Track play() {
        if (playlist.isEmpty()) {
            throw new IllegalStateException();
    } else {
        isPlaying = true;
        return playlist.getFirst();
        }
    }
}