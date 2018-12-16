package lukasz.player;

public class CD extends MusicPlayer implements Player{
    CD (Song [] lib)
    {
        super(lib);
        System.out.println("Obsluguje CD ");
    }
}
