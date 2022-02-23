package com.soulmate.database;

public class P183 {

    String sql="select name Customers from customers a left join orders b on a.id=b.customerId where b.customerId is null";
}
