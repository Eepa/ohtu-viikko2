package statistics;

import statistics.matcher.*;

public class Main {

    public static void main(String[] args) {
//        Statistics stats = new Statistics(new PlayerReaderImpl("http://nhlstats-2013-14.herokuapp.com/players.txt"));
//          
//        QueryBuilderOld query = new QueryBuilderOld();
//        
//        Matcher m1 = query.playsIn("NYR").hasAtLeast(10, "goals").hasFewerThan(15, "assists").build();
//        
//        Matcher m2 = query.playsIn("PIT").hasAtLeast(10, "goals").hasFewerThan(15, "assists").build();
//        
//        Matcher m = query.oneOf(m1, m2).build();
//        
//        for (Player player : stats.matches(m)) {
//            System.out.println( player );
//        }

//        Statistics stats = new Statistics(new PlayerReaderImpl("http://nhlstatistics.herokuapp.com/players.txt"));
//
//        Matcher m = new Or(new Not(new HasAtLeast(8, "goals")),
//                new HasFewerThan(20, "assists"),
//                new PlaysIn("PHI")
//        );
//
//        for (Player player : stats.matches(m)) {
//            System.out.println(player);
//        }
        Statistics stats = new Statistics(new PlayerReaderImpl("http://nhlstatistics.herokuapp.com/players.txt"));

        QueryBuilder query = new QueryBuilder();

        Matcher m2 = query.playsIn("PHI")
                .hasAtLeast(10, "goals")
                .hasFewerThan(25, "assists").build();

        QueryBuilder query2 = new QueryBuilder();

        Matcher m1 = query2.playsIn("NYR").hasAtLeast(10, "goals").hasFewerThan(25, "assists").build();

        QueryBuilder query3 = new QueryBuilder();

        Matcher m = query3.oneOf(m1, m2).build();

        for (Player player : stats.matches(m)) {
            System.out.println(player);
        }
    }

}
