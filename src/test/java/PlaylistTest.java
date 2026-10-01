import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.List;
import java.util.Map;

public class PlaylistTest {

    //returns
    //throws
    //rejects
    //allows
    //calculates

    @Test //normal case 
    @DisplayName("returns first tracks when playlist has tracks")
    void returnsFirstTrackWhenPlaylistHasTracks() {

        Playlist playlist = new Playlist();

        playlist.addTrack("Spectre", "Bad Omens");

        Optional<String> result = playlist.getCurrentTrack();

        assertEquals(Optional.of("Spectre", "Bad Omens", result))
    }


    @Test //empty case 
    @DisplayName("returns empty when playlist has no tracks")
    void returnsEmptyWhenPlaylistHasNoTracks() {
        Playlist playlist = new Playlist(); 

        Optional<String> result = playlist.getCurrentTracks();

        assertTrue(result.isEmpty);
    }

    @Test //invalid case 
    @DisplayName("throws exception if playlist has no tracks and play executes")
    void throwsExceptionWhenTryingToPlayEmtyPlaylist() {
        Playlist playlist = new Playlist();

        assertThrows(IllegalStateException.class,
            () -> playlist.play());
    }

    @Test //boundary case 
    @DisplayName("allows the playlist to contain precisely 50 tracks")
    void allowsPlaylistWithExactly50Tracks() {
        Playlist playlist = new Playlist(); 

        AssertEquals(playlist.size(50));
    }

    @Test //boundary case 
    @DisplayName("allows playlist to contain no more than 50 tracks")
    void rejectsMoreThan50Tracks() {
        Playlist playlist = new Playlist():

        assertThrows(IllegalStateException.class,
            () -> playlist.addTrack("Track 51");
        );
    }

    @Test //multiple cases 
    @DisplayName("returns the first track in playlist, when it has multiple tracks")
    void returnsFirstTrackWhenPlaylistContainsMultipleTracks() {
        Playlist playlist = new Playlist(); 

        playlist.AddTrack("Conduit", "Russian Circles");
        playlist.AddTrack("Broken Mirror", "Architects");
        playlist.AddTrack("Sew me up", "Spiritbox";);

        assertEquals(
            Optional.of("Conduit", "Russian Circles"),
            playlist.getCurrentTrack();
        )

    }

}