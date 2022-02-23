package com.soulmate.database;

public class P262 {

    String sql="select request_at `Day`, round((select count(1) from trips b where b.request_at = l.request_at and b.client_id in (select users_id from users where banned = 'No') " +
            "and b.driver_id in (select users_id from users where banned = 'No') and status like 'cancel%')/count(1),2) `Cancellation Rate` " +
            "from (select * from trips where client_id in (select users_id from users a where a.banned='No') and driver_id in (select users_id from users a where a.banned='No')) l " +
            "GROUP BY request_at HAVING request_at BETWEEN '2013-10-01' AND '2013-10-03'";
}
