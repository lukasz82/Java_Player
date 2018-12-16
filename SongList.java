package lukasz.player;

public class SongList {
    Song [] createSongList(int lenght)
    {
        Song [] songList = new Song[lenght];

        for (int i = 0; i < lenght; i++)
        {
            songList[i] = new Song(" Artysta nr " + i, " Utwor  " + i, "  album " + i);
        }
        return songList;
    }
}
