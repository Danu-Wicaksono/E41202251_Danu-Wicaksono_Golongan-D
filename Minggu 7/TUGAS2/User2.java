package tugas2;

/**
 *
 * @author Danu Wicaksono
 */
public class User2 {

    public static void main(String[] args) {
        Televisi tv = new Televisi("TV Modern, 29 inches", 100);
        String[] semuaChannel = {"RCTI", "SCTV", "INDOSIAR",
                                 "LA TV", "METRO TV", "TRANS TV",
                                 "TPI", "TV 7", "TVRI", "TV G", "AN TV"};

        System.out.println("Pak Lukman, membeli Televisi : " + tv.getDeskripsi());

        tv.getChannels();
        tv.setChannels(semuaChannel);

        tv.setChannelAktif(3);
        tv.setVolume(10);
        tv.setChannelAktif(10);
        tv.setChannelAktif(1);
       
    }
}
