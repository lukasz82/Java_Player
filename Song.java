package lukasz.player;

public class Song
{
    public String getArtistName() {
        return artistName;
    }

    public String getSongName() {
        return songName;
    }

    public String getAlbumName() {
        return albumName;
    }

    private String artistName;
    private String songName;
    private String albumName;

    Song(String name, String songName, String albumName)
    {
        this.artistName = name;
        this.songName = songName;
        this.albumName = albumName;
    }
}
