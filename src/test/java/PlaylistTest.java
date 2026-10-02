import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PlaylistTest {

    //returns
    //throws
    //rejects
    //allows
    //calculates

    @Test //NORMAL case 
    @DisplayName("returns first track")
    void getCurrentTrack_returnsFirstTrack_whenPlaylistHasAnyTracks() {
        //arrange
        Playlist playlist = new Playlist();
        Track spectre = new Track("Spectre", "Bad Omens");
        playlist.addTrack(spectre);

        //act 
        Optional<Track> result = playlist.getCurrentTrack();

        //assert 
        assertEquals(Optional.of(spectre), result);
    }


    @Test //EMPTY case 
    @DisplayName("returns empty when playlist has no tracks")
    void getCurrentTrack_returnsEmpty_whenPlaylistHasNoTracks() {
        Playlist playlist = new Playlist(); 

        Optional<Track> result = playlist.getCurrentTrack();

        assertTrue(result.isEmpty());
    }


    @Test //INVALID case (play empty playlist)
    @DisplayName("throws exception when trying to play empty playlist")
    void throwsException_whenTryingToPlayEmptyPlaylist() {
        Playlist playlist = new Playlist();

        assertThrows(IllegalStateException.class,
            () -> playlist.play());
    }

    @Test //BOUNDARY case 
    @DisplayName("allows the playlist to contain precisely 50 tracks")
    void addTrack_allowsExactly50Tracks() {
        Playlist playlist = new Playlist(); 

        for (int i = 1; i <= 50; i++ ) {
            playlist.addTrack(
                new Track("Track " + i, "Artist " + i)
            );
        }

        assertEquals(50, playlist.getSize());
    }


    @Test //BOUNDARY case 2
    @DisplayName("rejects adding a track when playlist is at full 50")
    void rejectsMoreThan50Tracks() {
        //arrange
        Playlist playlist = new Playlist();

        //filling playlist with 50 tracks 
        for (int i = 1; i <= 50; i++) {
            playlist.addTrack(
                new Track("Track " + i, "Artist " + i)
            );
        }

        //act + assert
        //reject track 51
        assertThrows(IllegalStateException.class,
            () -> playlist.addTrack(new Track("Track 51", "Artist 51"))
        );
    }


    @Test //MULTIPLE cases 
    @DisplayName("returns the first track in playlist when playlist has multiple tracks")
    void getCurrentTrack_returnsFirstTrack_whenPlaylistContainsMultipleTracks() {

        //arrange
        Playlist playlist = new Playlist(); 
        Track conduit = new Track("Conduit", "Russian Circles");
        Track brokenMirror = new Track("Broken Mirror", "Architecs");
        Track sewMeUp = new Track("Sew me up", "Spiritbox");

        playlist.addTrack(conduit);
        playlist.addTrack(brokenMirror);
        playlist.addTrack(sewMeUp);

        //act
        Optional<Track> result = playlist.getCurrentTrack();

        //assert
        assertEquals(Optional.of(conduit), result);
    }

    @Test //PLAY IS VALID 
    @DisplayName("returns and plays the first track in the playlist")
    void getFirstTrack_playsTrack_returnsTrack() {

        Playlist playlist = new Playlist(); 
        Track TheFriends = new Track("The friends", "Nicholas Hooper");
        playlist.addTrack(TheFriends);

        playlist.play();

        assertTrue(playlist.isPlaying);
        //assertEquals(true, playlist.isPlaying);

    }


    
}