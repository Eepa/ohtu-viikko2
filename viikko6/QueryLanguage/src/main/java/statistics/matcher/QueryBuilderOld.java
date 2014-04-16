package statistics.matcher;

public class QueryBuilderOld {

    private Matcher q;
    private static Matcher NONE = new None();

    public QueryBuilderOld(Matcher q) {
        this.q = q;
    }

    public QueryBuilderOld() {
        q = NONE;
    }

    public Matcher build() {
        return q;
    }

    public QueryBuilderOld hasFewerThan(int number, String property) {
        return addMatcher(new HasFewerThanOld(number, property));
    }
    
    public QueryBuilderOld hasAtLeast(int number, String property) {
        return addMatcher(new HasAtLeast(number, property));
    }

    public QueryBuilderOld playsIn(String team) {
        return addMatcher(new PlaysIn(team));        
    }

    private QueryBuilderOld addMatcher(Matcher first) {
        if (q == NONE) {
            q = new All();
        }

        return new QueryBuilderOld(new And(first, q));
    }

    public QueryBuilderOld oneOf(Matcher m1, Matcher m2) {
        return addMatcher(new OrOld(m1, m2)); 
    }
}
