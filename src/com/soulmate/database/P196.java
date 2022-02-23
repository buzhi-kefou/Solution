package com.soulmate.database;

public class P196 {

    String sql="delete from person where id in (select id from (select a.id,a.email,if(@`E` = a.email,'Y','N') flag,@`E` := a.email " +
            "from (select @`E` := null,id,email from person order by email,id asc) a) t where t.flag='Y')";

}
