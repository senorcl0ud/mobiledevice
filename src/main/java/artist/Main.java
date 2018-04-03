package artist;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Artists artistOne = new Artists("E.O.M", new String[]{"Bump Bump Joint - EOM", "Sound Solution ft S.I.T.H", "Sentra ft Wax", "Get Along ft Anderson Paak."});
        System.out.println(artistOne.toString());

        Artists artistTwo = new Artists("Dumbfoundead", new String[]{"Are We There Yet", "We Might Die", "Safe", "Hold Me Down" });
        System.out.println(artistTwo.toString());

        Artists artistThree = new Artists("Bob Marley", new String[]{"Buffalo Song", "I Shot The Sheriff", "Jamming", "Could You Be Loved"});
        System.out.println(artistThree.toString());

        System.out.println("======================================================================================");

       Artists[] discography = new Artists[]{artistOne,artistTwo,artistThree};
       for(Artists track : discography){
           System.out.println(Arrays.toString(track.getSongs()));
        }
    }

}
