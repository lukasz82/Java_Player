package lukasz.player;

public class Zadanie43 {
    public static void main(String[] args) {

        SongList list = new SongList();

        Player mp3 = new MP3(list.createSongList(50));
        mp3.play(4);
        mp3.stop();
        mp3.showAllList();

        Player cd = new CD(list.createSongList(20));
        cd.play(6);
        cd.stop();
        cd.play(2);

    }
}
