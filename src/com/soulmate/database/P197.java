package com.soulmate.database;

public class P197 {

    String sql="select a.id Id from Weather a left join Weather b on adddate(a.recordDate,-1)=b.recordDate where a.temperature>b.temperature";
}
