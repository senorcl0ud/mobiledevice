package artist;

import java.util.Arrays;

public class Artists {
    private String name;
    private String[] songs;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSongs() {
        return songs;
    }

    public void setSongs(String[] songs) {
        this.songs = songs;
    }


    public Artists (String name, String[] songs){
        this.name = name;
        this.songs = songs;
    }

    @Override
    public String toString(){
        return "Artist name: " + this.name + "\n" +"Discography: " + Arrays.toString(songs);
    }

}


