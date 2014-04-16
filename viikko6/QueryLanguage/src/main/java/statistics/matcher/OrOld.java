package statistics.matcher;

import statistics.Player;

public class OrOld implements Matcher{

    private Matcher[] matchers;

    public OrOld(Matcher... matchers) {
        this.matchers = matchers;
    }

    @Override
    public boolean matches(Player p) {
        for (Matcher matcher : matchers) {
            if (matcher.matches(p)) {
                return true;
            }
        }

        return false;
    }
}