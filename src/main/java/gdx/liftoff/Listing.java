package gdx.liftoff;

import gdx.liftoff.data.platforms.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import static gdx.liftoff.Maker.*;

/**
 * Fully-static class that exists so that we don't have to deal with Autumn stupid-magic from Java.
 */
public final class Listing {
    private Listing() {}

    public static ArrayList<Platform> platforms = makeList(
    new Android(),
    new Assets(),
    new Core(),
    new GWT(),
    new Headless(),
    new IOS(),
    new IOSMOE(),
    new Lwjgl2(),
    new Lwjgl3(),
    new Server(),
    new Shared(),
    new TeaVM()
    );
    public static LinkedHashMap<String, Platform> platformsByName = new LinkedHashMap<>(platforms.size());
    static {
        for(Platform p : platforms) {
            platformsByName.put(p.getId(), p);
        }
    }
}
