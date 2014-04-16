package statistics.matcher;

import statistics.Player;

public class HasFewerThanOld implements Matcher {
    private int val;
    private String category;

    public HasFewerThanOld(int val, String category) {
        this.val = val;
        this.category = category;
    }
    
    public boolean matches(Player p) {
        return new NotOld(new HasAtLeast(val, category)).matches(p);
    }
    
}
