package com.soulmate.database;

public class P182 {
    String sql="select email from person group by email having count(1) > 1";
}
