import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
    
	public static void main(String[] args) {
        HashMap<String, String> devonLegendAlbum = new HashMap<String, String>();
        devonLegendAlbum.put("Is this love", "I wanna love you, and treat you right.");
        devonLegendAlbum.put("Could you be loved", "Don't let them fool ya, or even try to school ya.");
        devonLegendAlbum.put("Stir it up", "We're gonna stir it up, little darling.");
        devonLegendAlbum.put("Redemption song", "Won't you help to sing, these songs of freedom?");
        
        // String firstSongLyrics = devonLegendAlbum.get("Is this love");
        // System.out.println(firstSongLyrics);

        Set<String> keys = devonLegendAlbum.keySet();
        for(String key: keys) {
            String songAndLyrics = String.format("%s : %s", key, devonLegendAlbum.get(key));
            System.out.println(songAndLyrics);
            // System.out.println(key); System.out.println(devonLegendAlbum.get(key));
        }
    }
}