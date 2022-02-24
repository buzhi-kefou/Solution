package com.soulmate.database;

public class P601 {
    String sql="select * from(" +
            "(select h.c-2 id,h.cv visit_date,h.cp people from " +
            "(select t1.*,t2.*,t3.* from " +
            "(select id a,visit_date av,people ap from stadium where people>=100) t1, " +
            "(select id+1 b,visit_date bv,people bp from stadium where people>=100) t2, " +
            "(select id+2 c,visit_date cv,people cp from stadium where people>=100) t3 " +
            "where t1.a=t2.b and t1.a=t3.c) h) " +
            "union " +
            "(select m.b-1 id,m.bv visit_date,m.bp people from " +
            "(select t1.*,t2.*,t3.* from " +
            "(select id a,visit_date av,people ap from stadium where people>=100) t1, " +
            "(select id+1 b,visit_date bv,people bp from stadium where people>=100) t2, " +
            "(select id+2 c,visit_date cv,people cp from stadium where people>=100) t3 " +
            "where t1.a=t2.b and t1.a=t3.c) m) " +
            "union " +
            "(select t.a id,t.av visit_date,t.ap people from " +
            "(select t1.*,t2.*,t3.* from " +
            "(select id a,visit_date av,people ap from stadium where people>=100) t1, " +
            "(select id+1 b,visit_date bv,people bp from stadium where people>=100) t2, " +
            "(select id+2 c,visit_date cv,people cp from stadium where people>=100) t3 " +
            "where t1.a=t2.b and t1.a=t3.c) t) " +
            ") res order by id ";
}
