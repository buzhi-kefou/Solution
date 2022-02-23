package com.soulmate.database;

public class P181 {
    String sql="select a.name Employee from employee a,employee b " +
            "where a.managerId = b.id and a.salary>b.salary";
}
