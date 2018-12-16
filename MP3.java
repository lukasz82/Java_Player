package lukasz.player;

public class MP3 extends MusicPlayer implements Player{
    MP3 (Song [] lib)
    {
        super(lib);
        System.out.println("Obsluguje MP3 ");
    }
}
