package com.soulmate.database;

public class P180 {
    String sql="select distinct a.num ConsecutiveNums from " +
            "(select id, num from logs) a," +
            "(select id+1 id, num from logs) b," +
            "(select id+2 id, num from logs) c " +
            "where a.id=b.id and a.num=b.num and a.id=c.id and a.num=c.num";
}
