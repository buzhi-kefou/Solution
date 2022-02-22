package com.soulmate.database;

public class P178 {
    String sql="select a.score,(select count(distinct b.score) from scores b where b.score >= a.score) `rank` from scores a order by a.score desc";
}
