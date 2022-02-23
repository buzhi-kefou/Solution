package com.soulmate.database;

public class P620 {

    String sql="select * from cinema where (id%2) != 0 and description != 'boring' order by rating desc";
}
