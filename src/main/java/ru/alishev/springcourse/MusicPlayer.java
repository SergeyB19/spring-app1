package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;



    //     @Autowired
//     @Qualifier("classicalMusic")
    private Music music1;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    private Music music2;
/*    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;*/

/*    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }*/

    public String playMusic() {
        return "Playing: " + music1.getSong() + ", " + music2.getSong();
        /*System.out.println();
        System.out.println("Playing: " + rockMusic.getSong());*/
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer() {
    }

    /*  @Autowired
      public MusicPlayer(ClassicalMusic classicalMusic) {
          this.classicalMusic = classicalMusic;
      }*/
//    @Autowired
/*    public MusicPlayer(Music music) {
        this.music = music;
    }

    @Autowired
    public void setMusic(Music music) {
        this.music = music;
    }*/


}
