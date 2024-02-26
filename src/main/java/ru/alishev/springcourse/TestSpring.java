package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());

//        TestBean testBean = context.getBean("testBean", TestBean.class);
    /*    Music music = context.getBean("musicBean", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);*/
        /*MusicPlayer firstmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        boolean comparison = firstmusicPlayer == secondmusicPlayer;
        System.out.println(comparison);
        System.out.println(firstmusicPlayer);
        System.out.println(secondmusicPlayer);

        firstmusicPlayer.setVolume(10);

        System.out.println(firstmusicPlayer.getVolume());
        System.out.println(secondmusicPlayer.getVolume());
*/
       /* musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());*/

        context.close();
    }
}
