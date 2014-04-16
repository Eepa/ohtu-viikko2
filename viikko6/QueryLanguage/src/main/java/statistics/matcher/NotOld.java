package statistics.matcher;

import statistics.Player;

public class NotOld implements Matcher {

    private Matcher matcher;

    public NotOld(Matcher matchers) {
        this.matcher = matchers;
    }

    public boolean matches(Player p) {
        return !matcher.matches(p);
    }
}
