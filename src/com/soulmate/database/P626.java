package com.soulmate.database;

public class P626 {
    String sql="SELECT aId id, IF((aId%2)=0,`left`,IF(`right` IS NOT NULL,`right`,`fuck`)) student FROM " +
            "(SELECT * FROM (SELECT id aId, student `fuck` FROM seat) a " +
            "LEFT JOIN (SELECT id+1 bId, student `left` FROM seat) b ON a.aId=b.bId) d " +
            "LEFT JOIN (SELECT id-1 cId, student `right` FROM seat) c ON d.aId=c.cId ";
}
