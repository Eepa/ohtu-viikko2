package statistics.matcher;

import java.util.ArrayList;
import java.util.List;

public class QueryBuilder {

    private List<Matcher> matchers;

    public QueryBuilder() {

        this.matchers = new ArrayList<Matcher>();
    }

    public QueryBuilder playsIn(String team) {

        this.matchers.add(new PlaysIn(team));
        return this;
    }

    public Matcher build() {

        return new And(matchers.toArray(new Matcher[matchers.size()]));
    }

    public QueryBuilder hasAtLeast(int value, String fieldName) {

        this.matchers.add(new HasAtLeast(value, fieldName));
        return this;
    }

    public QueryBuilder hasFewerThan(int value, String fieldName) {

        this.matchers.add(new HasFewerThan(value, fieldName));
        return this;
    }

    public QueryBuilder oneOf(Matcher matcher1, Matcher matcher2) {

        this.matchers.add(new Or(matcher1, matcher2));

        return this;
    }

}
