package lukasz.player;

public abstract class MusicPlayer implements Player
{

    private Song [] songList;
    MusicPlayer(Song [] list)
    {
        this.songList = list;
    }

    @Override
    public void showAllList()
    {
        System.out.println("Pokazuje cala liste w urzadzeniu : " + this.getClass().getName());
        for (int i = 0; i < this.songList.length; i++)
        {
            System.out.println(songList[i].getAlbumName() + songList[i].getArtistName() + songList[i].getSongName());
        }
    }

    @Override
    public void play(int i) {
        System.out.println("Play " + this.getClass().getName());
        System.out.println("Aktualnie odtwarzam : " + songList[i].getAlbumName() + songList[i].getArtistName() + songList[i].getSongName());
    }

    @Override
    public void pause() {
        System.out.println("Pause ");
    }

    @Override
    public void stop() {
        System.out.println("Stop ");
    }

    @Override
    public void next() {
        System.out.println("Next ");
    }

    @Override
    public void prev() {
        System.out.println("Previous ");
    }
}
